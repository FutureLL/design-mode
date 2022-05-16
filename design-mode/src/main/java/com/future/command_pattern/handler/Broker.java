package com.future.command_pattern.handler;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Description: 创建命令调用类
 * @Author: lilei58
 * @Date: Created in 2022/5/17 上午7:13
 */
public class Broker {

    private List<Order> orderList = Lists.newArrayList();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
