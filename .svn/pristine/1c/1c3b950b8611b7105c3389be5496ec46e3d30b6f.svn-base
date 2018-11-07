package com.ehootu.core.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 获取配置文件内容工具类
 */
public class PropertiesUtil {
	/**
	 * 获得配置文件
	 * @param url 文件名称，如messages.properties
	 * @param name 文件中内容的名称
	 * @return
	 */
	public static String getProperties(String url,String name){
		try {
			return new PropertiesUtil().getPropertie(url, name);
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

	/**
	 *
	 * @param url 文件路径  路径采用相对路径直接可以从工程的path路径去找
	 * @param name
	 * @return
	 * @throws IOException
	 */
	private String getPropertie(String url,String name) throws IOException {  
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(url);  
		Properties properties = new Properties();  
	    try{  
	       properties.load(inputStream);  
	    }catch (IOException ioE){  
	       ioE.printStackTrace();  
	    }finally{  
	       inputStream.close();  
	    } 
	    String result = properties.getProperty(name);
	    return result;
	   }
	
	 
}
