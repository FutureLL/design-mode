package com.future.factory_method.handler;

/**
 * @Description: 抽象工厂角色
 * @Author: lilei58
 * @Date: Created in 2022/5/11 上午9:20
 */
public interface IFactory {

    /**
     * 工厂角色
     * @return
     */
     IProduct produce();
}
