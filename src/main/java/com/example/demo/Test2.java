/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.example.demo;


public class Test2 {

    public static void main(String[] args) {

        test2();

    }

    private static void test1(){
        System.out.println(TestBean.test);
        System.out.println(TestBean.test2);
    }

    private static void test2(){

        System.out.println(Math.toIntExact(10L));
        System.out.println(Math.toIntExact(11L));
        System.out.println(Math.toIntExact(12L));
        System.out.println(Math.toIntExact(13L));
        System.out.println(Math.toIntExact(14L));

    }

}
