/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.example.demo.exec;

import com.example.demo.utils.CodeUtils;

/**
 * TODO
 *
 * @author yusk
 * @version V1.0
 * @since 2018-08-22 10:55
 */
public class ExecTest {

    public static void main(String[] args) {

        String code = CodeUtils.getCode(56580000000L);

        System.out.println(code);

        Long num = CodeUtils.decodeCode("6z738j5");

        System.out.println(num);

    }
}
