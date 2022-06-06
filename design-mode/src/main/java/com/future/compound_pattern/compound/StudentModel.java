package com.future.compound_pattern.compound;

/**
 * @Description: 模型层
 * @Author: lilei58
 * @Date: Created in 2022/6/6 上午8:45
 *
 * 模型层通常采用观察者模式,更准确地说是它和视图层共同组成观察者模式,当数据数据模型发生变化时（被观察对象）,可以实时将结果反馈给视图层（观察者）。
 * 使用观察者模式,可以让模型完全独立于视图和控制器,同一个模型可以使用不同的视图,甚至可以使用多种视图。
 * 这里我们的代码演示的是最基本的数据模型,也就是我们 web 开发中的 bean
 */
public class StudentModel {

    private String rollNo;
    private String name;

    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
