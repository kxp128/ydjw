package com.ehootu.core.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.UUID;

/**
 * ApplicationUtils : 程序工具类，提供大量的便捷方法
 *
 */
public class ApplicationUtils {

    /**
     * 产生一个36个字符的UUID
     *
     * @return UUID
     */
    public static String randomUUID() {
        return UUID.randomUUID().toString();
    }

    /**
     * md5加密
     *
     * @param value 要加密的值
     * @return md5加密后的值
     */
    public static String md5Hex(String value) {
        return DigestUtils.md5Hex(value);
    }

    /**
     * sha1加密
     *
     * @param value 要加密的值
     * @return sha1加密后的值
     */
    public static String sha1Hex(String value) {
        return DigestUtils.sha1Hex(value);
    }

    /**
     * sha256加密
     *
     * @param value 要加密的值
     * @return sha256加密后的值
     */
    public static String sha256Hex(String value) {
        return DigestUtils.sha256Hex(value);
    }

    /**
     * 本地执行 sh 命令
     *
     * @param cmd shell命令
     * @return 终端内容
     */
    public static StringBuffer exeCMD(String cmd) {
        StringBuffer buffer = new StringBuffer();
        BufferedReader bfRd = null;
        Process process = null;
        try {
            String[] cmdArray = {"/bin/bash", "-c", cmd};
            process = Runtime.getRuntime().exec(cmdArray);
            bfRd = new BufferedReader(new InputStreamReader(
                    process.getInputStream()));
            String line;
            while ((line = bfRd.readLine()) != null) {
                buffer.append(line);
                buffer.append("\n");
            }
            process.destroy();
        } catch (Exception e) {
            System.err.println("Linux erro ------------ :" + cmd);
            return null;
        } finally {
            try {
                if (bfRd != null) bfRd.close();
                if (process != null) process.destroy();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return buffer;
    }

}

