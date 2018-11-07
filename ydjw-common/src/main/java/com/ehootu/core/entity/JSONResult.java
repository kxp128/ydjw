package com.ehootu.core.entity;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * Json Result
 * <p>Description: JSONResult </p>
 * @author:  zhangyong
 * @created: 2017/09/18
 * @version: 1.0
 */

public class JSONResult implements Serializable {

    private static final long serialVersionUID = 7880907731807860636L;
    private final static Logger log = LoggerFactory.getLogger(JSONResult.class);

    /**
     * Ajax 中 Json字符串 转 Class 实体
     * @param jsonStr
     * @param clazz
     * @return
     */
    public static <T> T getJsonAjax(String jsonStr, Class<T> clazz){
        log.info("JSON String to Class : " + jsonStr);
        return JSON.parseObject(jsonStr,clazz);
    }

    /**
     * 成功情况 返回Json 字符串
     * @param clazz
     * @return
     */
    public static String resultJSON(Object clazz){
        JSONObject json = new JSONObject();
        json.put("status", 0);
        json.put("result", clazz);
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

        String jsonStr = JSON.toJSONString(json,SerializerFeature.WriteDateUseDateFormat
        									,SerializerFeature.DisableCircularReferenceDetect
                                            ,SerializerFeature.WriteNullStringAsEmpty
                                            ,SerializerFeature.WriteNullNumberAsZero);

        log.info(jsonStr);
        return jsonStr;
    }
    /**
     * 成功情况 返回Json 字符串   //WriteMapNullValue:是否输出值为null的字段,默认为false
     * @param clazz
     * @return
     */
    public static String resultJSON2(Object clazz){
    	JSONObject json = new JSONObject();
    	json.put("status", 0);
    	json.put("result", clazz);
    	JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    	
    	String jsonStr = JSON.toJSONString(json,SerializerFeature.WriteMapNullValue,SerializerFeature.WriteDateUseDateFormat);
    			
    	
    	log.info(jsonStr);
    	return jsonStr;
    }
    

    public static String resultJSON(JSONObject json){
        json.put("status", 0);
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

        String jsonStr = JSON.toJSONString(json,SerializerFeature.WriteDateUseDateFormat
        									,SerializerFeature.DisableCircularReferenceDetect
                                            ,SerializerFeature.WriteNullStringAsEmpty
                                            ,SerializerFeature.WriteNullNumberAsZero);

        log.info(jsonStr);
        return jsonStr;
    }
    /**
     * 失败或异常 返回
     * @param msg_code  失败/异常 code
     * @param msg_content  失败/异常 信息
     * @return
     */
    public static String resultJSON(String msg_code,String msg_content){
        JSONObject json = new JSONObject();
        json.put("status", 1);
        json.put("msg_code", msg_code);
        json.put("msg_content", msg_content);
        String jsonStr = JSON.toJSONString(json);

        log.info(jsonStr);
        return jsonStr;
    }
    /**
     * 失败或异常 返回
     * @param msg  失败/异常 信息
     * @return
     */
    public static String resultJSON(String msg){
        JSONObject json = new JSONObject();
        json.put("status", 1);
        json.put("msg", msg);
        String jsonStr = JSON.toJSONString(json);

        log.info(jsonStr);
        return jsonStr;
    }
}