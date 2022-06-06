package com.future.compound_pattern.compound;

/**
 * @Description: 控制层
 * @Author: lilei58
 * @Date: Created in 2022/6/6 上午8:47
 * 
 * 视图层和控制器实现了经典的策略模式,视图是一个对象,可以被调整使用不同的策略,而控制器提供了策略。视图只关心系统中可视的部分,对于任何逻辑行为,都委托给控制器处理。
 * 使用策略模式也可以让视图和模型之间的关系解耦,因为控制器负责和模型交互来传递用户的请求,对于实际请求是如何处理的,视图并不需要关心。
 * 这里的控制层也很简单,由控制层直接操作视图和模型,然后完成相关操作：
 */
public class StudentController {

    private StudentModel model;

    private StudentView view;

    public StudentController(StudentModel model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }

}
