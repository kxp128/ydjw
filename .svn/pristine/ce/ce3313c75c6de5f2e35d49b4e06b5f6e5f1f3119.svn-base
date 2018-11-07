package com.ehootu.core.util;


import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AES {
    static final String IV="7tWGBRwBdDmzTKVr";//使用CBC模式，需要一个向量iv，可增加加密算法的强度
    static final String KEY="W0A74sg23yhcermr"; //key 16位

    /**
     * 加密
     * @param sSrc
     * @param sKey
     * @return
     * @throws Exception
     */
    public static String Encrypt(String sSrc, String sKey) throws Exception {
        if (sKey == null) {
            sKey=AES.KEY;
        }

        byte[] raw = sKey.getBytes();
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");//"算法/模式/补码方式"
        IvParameterSpec iv = new IvParameterSpec(AES.IV.getBytes());//使用CBC模式，需要一个向量iv，可增加加密算法的强度
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

        byte[] encrypted = cipher.doFinal(sSrc.getBytes("UTF-8"));
        return  ByteUtil.bytesToHexString(encrypted);
    }


    /**
     * 解密
     * @param sSrc
     * @param sKey
     * @return
     * @throws Exception
     */
    public static String Decrypt(String sSrc, String sKey) throws Exception {

        // 判断Key是否正确
        if (sKey == null) {
            sKey=AES.KEY;
        }

        byte[] raw = sKey.getBytes("ASCII");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        IvParameterSpec iv = new IvParameterSpec(AES.IV.getBytes());
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
        //  byte[] encrypted1 = Base64.decodeBase64(sSrc);//先用bAES64解密
        byte[] encrypted1 =  ByteUtil.hexStringToBytes(sSrc);
        byte[] original = cipher.doFinal(encrypted1);
        String originalString = new String(original,"UTF-8");
        return originalString;


    }
    public static void main(String[] args) {
        String s="jdbc:mysql://192.168.2.222:3308/511";
        //password = km+3Xhp+*qAe
        
        System.out.println("加密后的密码：--"+ApplicationUtils.sha256Hex("admin"));
        try {
            String as = AES.Encrypt(s, "IcAvgpSJxzqcKnyx");
            System.out.println(as);

            System.out.println(AES.Decrypt("e14787e74e495d2738d4db34bd39ecfd610bf89192a41c8a17d50bda902a5f31dbccfa0445746f00a4a8b5cfd1b624f932abe3b37c375fdf13ac5ceb333fbf5af6a80199d647e927714a2870c2e171cfc0041088dfc6c40e49a4a02502e488e424c735993118e921cf19d259e7ae0c24","IcAvgpSJxzqcKnyx"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}