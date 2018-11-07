package com.ehootu.core.util;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.Properties;

/**
 *  Word 工具类
 * <p>Description: WordUtils </p>
 * @author:  xutie
 * @created: 2017/4/27
 * @version: 1.0
 */
public class WordUtils {

    private static final Object LOCK = new Object();

    /**
     * word文件
     */
    public static final int WORD_FILE = 1;
    /**
     * excel文件
     */
    public static final int EXCEL_FILE = 2;

    private static VelocityEngine ve;

    private static WordUtils wordUtils ;

    private WordUtils(String templateFolder) {
        Properties properties = new Properties();
        properties.setProperty(VelocityEngine.FILE_RESOURCE_LOADER_PATH, templateFolder);
        ve = new VelocityEngine();
        ve.init(properties);
        ve.init();
    }

    private static void check(HttpServletRequest request) {
        if (wordUtils == null) {
            synchronized (LOCK) {
                System.out.println(request.getServletContext().getRealPath("/")+File.separator+"word");
                wordUtils = new WordUtils(request.getServletContext().getRealPath("/")+File.separator+"word");
            }
        }

    }

    /**
     * 创建 word 文档
     * 必须先设置response导出配置，然后解析模版，否则会出问题
     * @throws IOException
     */
    public static void createDoc(String templateName, VelocityContext vc, HttpServletRequest request, HttpServletResponse response, String docFileName, int fileType) throws IOException {
        //    response.resetBuffer();

        //设置导出

        response.addHeader("Cache-Control","no-cache");
        response.setCharacterEncoding("UTF-8");
        if( WORD_FILE == fileType){
            response.setContentType("application/vnd.ms-word;charset=UTF-8");
        }else{
            response.setContentType("application/octet-stream");
        }


        String ua = request.getHeader("user-agent");
        ua = ua == null ? null : ua.toLowerCase();
        if(ua != null && (ua.indexOf("firefox") > 0 || ua.indexOf("safari")>0)){
            try {
                docFileName = new String(docFileName.getBytes(),"ISO8859-1");
                response.addHeader("Content-Disposition","attachment;filename=" + docFileName);
            } catch (Exception e) {
            }
        }else{
            try {
                docFileName = URLEncoder.encode(docFileName, "utf-8");
                response.addHeader("Content-Disposition","attachment;filename=" + docFileName);
            } catch (Exception e) {
            }
        }

        //解析模版
        check(request);
        Template template = ve.getTemplate(templateName, "UTF-8");
        PrintWriter write = response.getWriter();
        template.merge(vc, write);

        if(write != null){
            write.flush();
            write.close();
        }
    }

    /**
     * 根据图片路径将图片转换成base64位编码
     *
     * @param imgUrl
     *            图片路径
     * @return base64位编码
     * @throws Exception
     */
    public static String ImgToBase64(String imgUrl) throws Exception {
        byte[] data = null;
        InputStream in = new FileInputStream(imgUrl);
        data = new byte[in.available()];
        in.read(data);
        in.close();
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);// 返回Base64编码过的字节数组字符串
    }
}
