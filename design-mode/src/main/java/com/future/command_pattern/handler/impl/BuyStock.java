package com.future.command_pattern.handler.impl;

import com.future.command_pattern.handler.Order;
import com.future.command_pattern.handler.Stock;

/**
 * @Description: 创建实现了 Order 接口的实体类
 * @Author: lilei58
 * @Date: Created in 2022/5/17 上午7:11
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
