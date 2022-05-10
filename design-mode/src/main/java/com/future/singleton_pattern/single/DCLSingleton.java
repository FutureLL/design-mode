package com.future.singleton_pattern.single;

/**
 * @Description: 4 双检锁/双重校验锁（DCL，即 double-checked locking）
 * @Author: lilei58
 * @Date: Created in 2022/5/10 上午9:19
 *
 * 描述: 这种方式采用双锁机制,安全且在多线程情况下能保持高性能。
 *
 * getInstance() 的性能对应用程序很关键。
 */
public class DCLSingleton {

    private volatile static DCLSingleton singleton;

    private DCLSingleton () {

    }

    public static DCLSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DCLSingleton.class) {
                if (singleton == null) {
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }

}
