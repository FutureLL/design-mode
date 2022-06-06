package com.future.compound_pattern.compound;

/**
 * @Description: 视图层
 * @Author: lilei58
 * @Date: Created in 2022/6/6 上午8:46
 * 
 * 视图层在某些场景下,是可能需要同时显示多种数据模型和数据展示组件的,所以通常情况下视图会是一个或多个组件构成,所以视图层的实现是需要用到组合设计模式的。
 * 这里我们也仅仅演示一种最简单的视图模型,它主要用来打印模型的基本信息
 */
public class StudentView {

    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }

}
