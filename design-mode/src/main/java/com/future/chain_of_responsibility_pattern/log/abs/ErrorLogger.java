package com.future.chain_of_responsibility_pattern.log.abs;

import com.future.chain_of_responsibility_pattern.log.AbstractLogger;

/**
 * @Description: 创建扩展了该记录器类的实体类
 * @Author: lilei58
 * @Date: Created in 2022/6/22 上午6:51
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
