package com.future.factory_method.handler.impl;

import com.future.factory_method.handler.IProduct;

/**
 * @Description: 具体产品角色B
 * @Author: lilei58
 * @Date: Created in 2022/5/11 上午9:23
 */
public class ProductB implements IProduct {

    @Override
    public void method() {
        System.out.println("I'm ProductB!");
    }
}