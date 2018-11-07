package com.ehootu.core.generic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ehootu.core.entity.JSONResult;
import com.ehootu.core.feature.orm.mybatis.Page;
import com.ehootu.core.util.PropertiesUtil;
import com.ehootu.core.util.ShiroUtils;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.apache.shiro.authz.UnauthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

/*import com.ehootu.user.model.Menu;
import com.ehootu.user.model.MenuExample;
import com.ehootu.user.service.MenuService;*/

/**
 * Base 视图控制器
 **/
@Controller
public class BaseController {

    @Autowired
    private Producer producer;
/*
    @Autowired
    private MenuService menuService;*/
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;

    private final static Logger log = LoggerFactory.getLogger(BaseController.class);

    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.session = request.getSession();
    }

    /**
     * 首页
     *
     * @return
     */
    @RequestMapping(value = {"","index"})
    public ModelAndView index(){
        ModelAndView mav= new ModelAndView();
        System.out.println(" 系统首页 - 访问成功 ");
        mav.setViewName("/index.html");

        return mav;
    }

    /**
     * 欢迎页
     *
     * @return
     */
    @RequestMapping("/main")
    public ModelAndView welcome(){
        ModelAndView mav= new ModelAndView();
        mav.setViewName("/main.html");

        return mav;
    }



    /**
     * 获取验证码
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping("captcha.jpg")
    public void captcha(HttpServletResponse response)throws ServletException, IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");

        //生成文字验证码
        String text = producer.createText();
        log.info("生成验证码："+text);
        //生成图片验证码
        BufferedImage image = producer.createImage(text);
        //保存到shiro session
        ShiroUtils.setSessionAttribute(Constants.KAPTCHA_SESSION_KEY, text);
        
        Object obj = ShiroUtils.getSessionAttribute(Constants.KAPTCHA_SESSION_KEY);

        log.info("获取session："+ (obj==null ? obj :obj.toString()));
        
        ServletOutputStream out = response.getOutputStream();
        
        ImageIO.write(image, "jpg", out);
    }

    /**
     * Ajax 中 Json字符串 转 Class 实体
     * @param jsonStr
     * @param clazz
     * @return
     */
    protected <T> T getJsonAjax(String jsonStr, Class<T> clazz){
        log.info("JSON String to Class : " + jsonStr);
        return JSON.parseObject(jsonStr,clazz);
    }

    /**
     * 客户端返回字符串
     * @param string
     * @return
     */
    protected void renderString(String string ) {
        try {
            //http://192.168.2.123:8080
            //http://192.168.2.142:8020
            //http://weixin.ehootu.cn
            //response.reset();
//            response.setHeader("Access-Control-Allow-Origin", PropertiesUtil.getProperties("messages.properties", "base.url"));
//            response.setHeader("Access-Control-Allow-Origin", "http://weixin.ehootu.cn");
//            response.setHeader("Access-Control-Allow-Origin", "http://192.168.2.163:8080");
//            response.setHeader("Access-Control-Allow-Origin", "http://weixin.ehootu.cn");
            //可以解决跨域
            response.setHeader("Access-Control-Allow-Origin",request.getHeader("Origin"));
            response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
            response.setHeader("Access-Control-Allow-Credentials", "true");
            response.setHeader("Access-Control-Max-Age", "3600");
            response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            response.getWriter().print(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 成功情况 返回Json 对象
     * @param clazz
     * @return
     */
    protected void resultSuccess(Object clazz){
        renderString(JSONResult.resultJSON(clazz));
    }

    protected void resultPage(JSONObject jsonObject){
        renderString(JSONResult.resultJSON(jsonObject));
    }
   
    /**
     * 成功情况 返回Json 对象 字段为null的也要返回
     * @param clazz
     * @return
     */
    protected void resultSuccess2(Object clazz){
    	renderString(JSONResult.resultJSON2(clazz));
    }
    

    /**
     * 成功情况 返回Json 对象
     */
    protected void resultSuccess(){
        JSONObject json = new JSONObject();
        json.put("status", 0);
        json.put("result", "ok");
        renderString(JSON.toJSONString(json));
    }
    
    /**
     * 返回分页数据
     * @param p
     * @return
     */
    protected void resultTableJson(Page p) {
    	JSONObject resultJson = new JSONObject();
    	resultJson.put("draw", p.getDraw());  
    	resultJson.put("recordsTotal", p.getTotalCount());  
    	resultJson.put("recordsFiltered", p.getTotalCount());  
    	resultJson.put("data", p.getResult());
        renderString(JSONResult.resultJSON(resultJson));
	}
    
    /**
     * 失败或异常 返回
     * @param msg_code  失败/异常 code
     * @param msg_content  失败/异常 信息
     * @return
     */
    protected void resultError(String msg_code,String msg_content){
        renderString(JSONResult.resultJSON(msg_code,msg_content));
    }
    /**
     * 失败或异常 返回
     * @param msg  失败/异常 信息
     * @return
     */
    protected void resultError(String msg){
        renderString(JSONResult.resultJSON(msg));
    }

    @ExceptionHandler(Exception.class)
    public void exception(Exception e, HttpServletRequest request) {
        log.error(e.getMessage(), e);
        e.printStackTrace();
        request.setAttribute("exception", e);
        resultError("操作失败");
    }

    //Shiro 401 无权限 异常处理
    @ExceptionHandler(UnauthorizedException.class)
    public void exception401(UnauthorizedException e, HttpServletRequest request) {

        request.setAttribute("exception", "用户角色无权限使用该功能！");
        System.out.println("用户角色无权限使用该功能");
    }
/*
    @RequestMapping("mainMenu")
    @ResponseBody
    public JSONObject mainMenu(){
        List<Menu> list = menuService.selectByExample(new MenuExample());
        JSONObject json = new JSONObject();
        JSONArray array = new JSONArray();
        for(Menu menu:list){
            if("首页".equals(menu.getMenuName())){
                JSONObject a1 = new JSONObject();
                a1.put("text", menu.getMenuName());
                a1.put("icon", "&#xe63b;");
                a1.put("href", menu.getMenuUrl());
                array.add(a1);
            }else if(menu.getParentId()==1){
                JSONArray jsonArray = new JSONArray();
                JSONObject a = new JSONObject();
                a.put("text", menu.getMenuName());
                a.put("icon", "&#xe620;");
                for(Menu m:list){
                    if(menu.getId()==m.getParentId()){
                        JSONObject b = new JSONObject();
                        b.put("text", m.getMenuName());
                        b.put("icon", "&#xe621;");
                        b.put("href", m.getMenuUrl());
                        jsonArray.add(b);
                    }
                }
                a.put("subset", jsonArray);
                array.add(a);
            }
        }
        json.put("data", array);
        return json;
    }*/
    /**
     * 支持 二级菜单的跳转  例: /511/index/index.html
     * @param url1
     * @param url2
     * @return
     */

    @RequestMapping("{url1}/{url2}.html")
    public String url(@PathVariable("url1") String url1,@PathVariable("url2") String url2){
        return url1 + "/" + url2+".html" ;
    }


    @RequestMapping("topMenu")
    @ResponseBody
    public JSONObject topMenu(){
        JSONObject json = new JSONObject();

        System.out.println(" 测试过去 菜单 ");
        JSONArray jsonArray = new JSONArray();

        JSONObject a = new JSONObject();
        a.put("text", "基础AAAAAAAAAAA");
        a.put("icon", "&#xe620;");

        JSONObject a1 = new JSONObject();
        a1.put("text", "按钮");
        a1.put("icon", "&#xe621;");
        a1.put("href", "http://www.baidu.com");

        a.put("subset", a1);
        a.put("subset", a1);

        JSONObject b = new JSONObject();
        b.put("text", "基础BBBBBBB");
        b.put("icon", "&#xe620;");

        JSONObject b1 = new JSONObject();
        b1.put("text", "按钮b");
        b1.put("icon", "&#xe621;");
        b1.put("href", "http://www.baidu.com");

        b.put("subset", b1);


        jsonArray.add(a);
        jsonArray.add(b);
        json.put("data", jsonArray);

        System.out.println("测试菜单 ..." + json.toJSONString());

        return json;
    }
}