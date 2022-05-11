package com.future.factory_method;

import com.future.factory_method.handler.IFactory;
import com.future.factory_method.handler.IProduct;
import com.future.factory_method.handler.impl.ConcreteFactoryA;

/**
 * @Description: TODO 工厂方法模式
 * @Author: lilei58
 * @Date: Created in 2022/5/11 上午9:19
 * 
 * 工厂方法模式是简单工厂模式的进一步抽象化和推广,工厂方法模式里不再只由一个工厂类决定那一个产品类应当被实例化,这个决定被交给抽象工厂的子类去做。
 * 
 * 1. 抽象工厂角色: 这是工厂方法模式的核心,它与应用程序无关。是具体工厂角色必须实现的接口或者必须继承的父类。
 *                在java中它由抽象类或者接口来实现。
 * 2. 具体工厂角色: 它含有和具体业务逻辑有关的代码。由应用程序调用以创建对应的具体产品的对象。
 * 3. 抽象产品角色: 它是具体产品继承的父类或者是实现的接口。在java中一般有抽象类或者接口来实现。
 * 4. 具体产品角色: 具体工厂角色所创建的对象就是此角色的实例。在java中由具体的类来实现。
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {
        IFactory factoryA = new ConcreteFactoryA();
        IProduct product1 = factoryA.produce();
        product1.method();
    }
}
