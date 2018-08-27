/*
 * Copyright (c) 2001-2017 GuaHao.com Corporation Limited. All rights reserved. 
 * This software is the confidential and proprietary information of GuaHao Company. 
 * ("Confidential Information"). 
 * You shall not disclose such Confidential Information and shall use it only 
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.example.demo.utils;

/**
 * 邀请码生成工具类
 *
 * @author shandp
 * @version V1.0
 * @since 2017-11-08 16:40
 */
public class CodeUtils {

    private static final String SOURCE = "abcdef01234ghijklmnopqrs56789tuvwxyz";

    /**
     * 邀请码生成器 ，比如 用户userid 生成 邀请码
     *
     * @param num
     * @return
     */
    public static String getCode(long num) {
        String code = "";
        int bit = SOURCE.length();

        while (num > 0) {

            //对 bit 取余数, 得到最后最后一位
            long mod = num % bit;
            int modValue = Math.toIntExact(mod);
            String lastChar = SOURCE.substring(modValue, modValue + 1);
            //整除部分 往高位进
            num = (num - mod) / bit;
            code = lastChar + code;
        }

        return code;
    }

    /**
     * 邀请码解码器 对于 邀请码 解码成 对应的userid
     *
     * @param code
     * @return
     */
    public static Long decodeCode(String code) {
        long num = 0L;
        if (code == null || code.length() == 0) {
            return null;
        }
        String lowcaseCode = code.toLowerCase();
        int len = code.length();
        int bit = SOURCE.length();
        for (int i = 0; i < len; i++) {
            int bitXLen = len - 1 - i;
            long bitXValue = 1;
            for (int j = 0; j < bitXLen; j++) {
                bitXValue = bitXValue * bit;
            }
            int index = SOURCE.indexOf(lowcaseCode.substring(i, i + 1));
            if (index == -1) {
                return null;
            }
            num = num + index * bitXValue;
        }
        return num;
    }

}
