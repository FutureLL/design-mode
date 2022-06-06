package com.future.compound_pattern;

import com.future.compound_pattern.compound.StudentController;
import com.future.compound_pattern.compound.StudentModel;
import com.future.compound_pattern.compound.StudentView;

/**
 * @Description: TODO 复合模式（Compound Pattern）
 * @Author: lilei58
 * @Date: Created in 2022/6/6 上午8:40
 *
 * 复合模式是指在一个解决方案中结合两个或多个模式,以解决一般或重发发生的问题。
 * 由于设计模式比较多,所以复合出来的复合模式就更多了,这里关于复合模式就不再展开分析了,下面我们来通过一种非常普遍的复合模式,来简单演示下复合模式的通常应用。
 * 
 * MVC 是复合模式,结合了观察者模式、策略模式和组合模式
 * 模型使用观察者模式,以便观察者更新,同时保持两者之间的解耦
 * 控制器是试图的策略,试图可以使用不同的控制器实现,得到不同的行为
 * 视图使用组合模式实现用户界面,用户界面通常组合了嵌套的组件,像面板、框架和按钮等
 * 这些模式携手合作,把 MVC 模型的三次解耦,这样既可以保持设计干净,又有弹性
 * 适配器模式用来将新的模型适配成已有的试图和控制器
 * Model2 是 MVC 在 Web 上的应用
 * 在 Mdodel2 中,控制器实现成了 Servlet,而 JSP/Html 是视图层
 */
public class CompoundPatternDemo {

    public static void main(String[] args) {

        // 从数据库获取学生记录
        StudentModel student = new StudentModel();
        student.setName("云中志");
        student.setRollNo("10");

        // 创建一个视图: 把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        // 更新模型数据
        controller.setStudentName("syske");

        controller.updateView();
    }
}
