package com.common.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;

/**
 * @author zhouhz
 * @date 2020/7/5 6:47 下午
 */
public class Base64Util {

    /**
     * Base64加密
     * @param str
     * @return
     */
    public static String encode(String str){
        byte[] btArr = null;
        String encodeStr = null;
        try {
            btArr = str.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if( btArr != null){
            encodeStr = new BASE64Encoder().encode(btArr);
        }
        return encodeStr;
    }


    /**
     * Base64解密
     * @param str
     * @return
     * @throws IOException
     */
    public static String decode(String str) throws IOException {
        String decodeStr = null;
        if (str != null) {
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] btArr = decoder.decodeBuffer(str);
            decodeStr = new String(btArr, "utf-8");
        }
        return decodeStr;
    }

}
