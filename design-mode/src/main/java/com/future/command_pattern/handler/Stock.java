package com.future.command_pattern.handler;

/**
 * @Description: 创建一个请求类
 * @Author: lilei58
 * @Date: Created in 2022/5/17 上午7:11
 */
public class Stock {

    private String name = "ABC";

    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ",Quantity:" + quantity +" ]bought ");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ",Quantity:" + quantity +" ]sold ");
    }

}
