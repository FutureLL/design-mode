package com.future.factory_method.handler.impl;

import com.future.factory_method.handler.IFactory;
import com.future.factory_method.handler.IProduct;

/**
 * @Description: 具体工厂角色B
 * @Author: lilei58
 * @Date: Created in 2022/5/11 上午9:22
 */
public class ConcreteFactoryB implements IFactory {

    @Override
    public IProduct produce() {
        return new ProductB();
    }
}