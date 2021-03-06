package com.ehootu.core.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class HttpRequest {

	//上线url
	public static final String URL= PropertiesUtil.getProperties("messages.properties", "properties.url")+"dz/";
	public static  String GET_URL_JLXMC = URL+"findJieDaoXiangMingCheng";
	public static  String GET_URL_MPHMC = URL+"findMenPaiHaoMingCheng";
	public static  String GET_URL_LPHMC = URL+"findLouDongHaoMingCheng";
	public static  String GET_URL_DZ = URL+"findSuoSuPaiChuSuo";
	public static  String GET_URL_DZ_DZXX_BM = URL+"querDzDzxx"; // 通过 地址编码 查询基库数据
	public static  String POST_URL_DZ_DZXX_MC = URL+"findDzList"; // 通过 地址名称 查询基库数据
	// 发短信
	public static  String URL_SEND_MESSAGE = PropertiesUtil.getProperties("messages.properties","sendMsg.url");
	//短信签名
	public static  String SEND_MESSAGE_SIGNATURE = PropertiesUtil.getProperties("messages.properties","sendMsg.signature"); // 发短信

//	//测试调发红包接口
	public static final String GET_URL_REDPACKET = PropertiesUtil.getProperties("messages.properties", "weixin.url");
	//本地红包接口
//	public static final String GET_URL_REDPACKET = "http://192.168.2.200:8080/send";

	//测试url
//	public static final String URL= "http://192.168.2.211:8090/dmdz/dz/";
//	public static final String GET_URL_JLXMC = "http://192.168.2.211:8090/dmdz/dz/findJieDaoXiangMingCheng";
//	public static final String GET_URL_MPHMC = "http://192.168.2.211:8090/dmdz/dz/findMenPaiHaoMingCheng";
//	public static final String GET_URL_LPHMC = "http://192.168.2.211:8090/dmdz/dz/findLouDongHaoMingCheng";
//	public static final String GET_URL_DZ = "http://192.168.2.211:8090/dmdz/dz/findSuoSuPaiChuSuo";

//	public static final String URL= "http://192.168.2.211:8090/dz/";
//	public static final String GET_URL_JLXMC = "http://192.168.2.211:8090/dz/findJieDaoXiangMingCheng";
//	public static final String GET_URL_MPHMC = "http://192.168.2.211:8090/dz/findMenPaiHaoMingCheng";
//	public static final String GET_URL_LPHMC = "http://192.168.2.211:8090/dz/findLouDongHaoMingCheng";
//	public static final String GET_URL_DZ = "http://192.168.2.211:8090/dz/findSuoSuPaiChuSuo";

	//测试调发红包接口
//	public static final String GET_URL_REDPACKET = "http://192.168.2.200:8080/send";

	private final static Logger log = LoggerFactory.getLogger(HttpRequest.class);

	public static String sendPost(String url, String param) {
		String result = "";
		BufferedReader in = null;
		try {
			System.out.println("post url: " + url);
			System.out.println("post params: " + param);

			URL httpUrl = new URL(url);
			// 建立连接
			HttpURLConnection conn = (HttpURLConnection) httpUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("user-agent", "Mozilla/5.0 (compatible; MSIE 6.1; Windows NT 5.1;SV1)");
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestMethod("POST");
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setConnectTimeout(1000*10);
			conn.setReadTimeout(1000*3);
			// 连接，从postUrl.openConnection()至此的配置必须要在connect之前完成，
			// 要注意的是connection.getOutputStream会隐含的进行connect。
			conn.connect();
			/** 参数格式：xx=xx&yy=yy */
			//建立输入流，向指向的URL传入参数
			DataOutputStream dos=new DataOutputStream(conn.getOutputStream());
			// 防止乱码 将 dos.writeBytes(param); 修改为
			dos.write(param.getBytes());
			dos.flush();
			dos.close();
			int resultCode=conn.getResponseCode();
			// 获取所有响应头字段
			Map<String, List<String>> map = conn.getHeaderFields();
			// 遍历所有的响应头字段
			for (String key : map.keySet()) {
				System.out.println(key + "--->" + map.get(key));
			}
			// 定义 BufferedReader输入流来读取URL的响应
			// 调用 conn.getInputStream() 之前会默认调用 conn.connect(); 建立正式连接
			// 一定要指定charsetName为“utf-8” ，不然返回中文乱码
			in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("发送POST请求出现异常！" + e);
			e.printStackTrace();
		}
		finally {
			try {
				if (in != null) in.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}

	public static String sendGet(String url, String param) throws ConnectException {
		String result = "";
		BufferedReader in = null;
		try {
			String urlNameString = url + "?" + param;
			URL httpUrl = new URL(urlNameString);
			log.info("urlNameString:" + urlNameString);
			// 建立连接
			HttpURLConnection conn = (HttpURLConnection) httpUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("Content-Type", "application/json; encoding=utf-8");
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 建立实际的连接
			conn.connect();
			// 获取所有响应头字段
			Map<String, List<String>> map = conn.getHeaderFields();
			// 遍历所有的响应头字段
			for (String key : map.keySet()) {
				log.info(key + "--->" + map.get(key));
			}
			// 定义 BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
			log.info("result:" + result);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ConnectException();
			
		}
		// 使用finally块来关闭输入流
		finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * Get请求
	 * 
	 * @param url
	 * @param param
	 * @return
	 * @throws IOException
	 */
	public static String readContentFromGet(String url, String param) throws IOException {
		log.info("param---" + param);
		// 拼凑get请求的URL字串，使用URLEncoder.encode对特殊和不可见字符进行编码
		String getURL = url +"?"+ param;
		log.info("getURL---" + getURL);
		URL getUrl = new URL(getURL);
		// 根据拼凑的URL，打开连接，URL.openConnection函数会根据URL的类型，
		// 返回不同的URLConnection子类的对象，这里URL是一个http，因此实际返回的是HttpURLConnection
		HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
		// 进行连接，但是实际上get request要在下一句的connection.getInputStream()函数中才会真正发到
		// 服务器
		connection.connect();
		// 取得输入流，并使用Reader读取
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
		System.out.println("=============================");
		System.out.println("Contents of get request");
		System.out.println("=============================");
		String lines;
		StringBuilder sb = new StringBuilder();
		while ((lines = reader.readLine()) != null) {

			System.out.println(lines);
			sb.append(lines);

		}
		System.out.println(sb.toString());
		reader.close();
		// 断开连接
		connection.disconnect();
		return sb.toString();
	}
}
