package com.future.singleton_pattern.single;

/**
 * @Description: 1 懒汉式,线程不安全
 * @Author: lilei58
 * @Date: Created in 2022/5/10 上午9:14
 *
 * 描述: 这种方式是最基本的实现方式,这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized,所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显,不要求线程安全,在多线程不能正常工作。
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton () {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
