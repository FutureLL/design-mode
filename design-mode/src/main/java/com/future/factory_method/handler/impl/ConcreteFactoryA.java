package com.future.factory_method.handler.impl;

import com.future.factory_method.handler.IFactory;
import com.future.factory_method.handler.IProduct;

/**
 * @Description: 具体工厂角色A
 * @Author: lilei58
 * @Date: Created in 2022/5/11 上午9:21
 */
public class ConcreteFactoryA implements IFactory {

    @Override
    public IProduct produce() {
        return new ProductA();
    }
}