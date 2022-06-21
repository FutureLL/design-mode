package com.future.chain_of_responsibility_pattern.log;

/**
 * @Description: 创建抽象的记录器类
 * @Author: lilei58
 * @Date: Created in 2022/6/22 上午6:50
 */
public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    /**
     * 责任链中的下一个元素
     */
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){

        // 执行对应 logger 的 write()
        if(this.level <= level){
            write(message);
        }

        // 调用下一个 logger
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 写方法
     *
     * @param message
     */
    abstract protected void write(String message);

}
