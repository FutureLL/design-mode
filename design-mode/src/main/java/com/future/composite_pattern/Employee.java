package com.future.composite_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 创建 Employee 类,该类带有 Employee 对象的列表
 * @Author: lilei58
 * @Date: Created in 2022/5/25 上午8:10
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    /**
     * 构造函数
     * @param name
     * @param dept
     * @param sal
     */
    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }

}
