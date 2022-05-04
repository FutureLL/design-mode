package com.future.strategy_pattern.abstractWay;

import com.future.strategy_pattern.abstractWay.handler.AbstractStrategyHandler;
import com.future.strategy_pattern.abstractWay.handler.impl.AbstractAddHandler;
import com.future.strategy_pattern.abstractWay.handler.impl.AbstractMultiplyHandler;
import com.future.strategy_pattern.abstractWay.handler.impl.AbstractSubtractHandler;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * @Description: abstract 实现策略模式
 * @Author: lilei58
 * @Date: Created in 2022/5/4 下午9:32
 */
public class TestDemo {

    private static List<AbstractStrategyHandler> handlers = Lists.newArrayList(
            new AbstractSubtractHandler(),
            new AbstractMultiplyHandler(),
            new AbstractAddHandler()
    );

    public static void main(String[] args) {

        Optional<Integer> first = handlers.stream()
                .filter(handler -> handler.isMatch("*"))
                .map(handler -> handler.doMatch(10, 5))
                .findFirst();

        System.out.println(first.orElse(-999));

    }
}
