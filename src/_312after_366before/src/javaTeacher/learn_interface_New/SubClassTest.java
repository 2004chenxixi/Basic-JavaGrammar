package _312after_366before.src.javaTeacher.learn_interface_New;

/*
测试"interface_new"
 */
public class SubClassTest {
    //2-去测试SubClass和interface_new
    public static void main(String[] args) {
        SubClass subClass = new SubClass();

        //问题1：调不出接口中的静态方法
        //总结：接口中定义的静态方法，只能通过接口来调用
        //subClass.method1();--调静态（不行）
        interface_new.method1();//--接口调静态，（可以）

        //问题2：要调用默认的方法
        //总结：用实现类的对象，可以调用接口中的默认方法
        //附加：如果实现类重写类接口中的默认方法，调用的时候，调用的是"重写后"的方法
        subClass.method2();
        subClass.method3();

        //问题4：父类和接口中都有，同名同参数"方法"的使用---用谁？
        //如果：子类（实现类）没有重写这个方法，调用的就是父类的方法
        //附加：和前面的父类和接口没有区别，区分开 +（这里是有父类优先的）---》 类优先原则
        //这里那method3做比较（前提，没有重写过）
        subClass.method3();

        //问题5：如果实现类，没有继承父类，而是实现类多个接口，并且多接口里面有"同名，同参数"的方法
        //总结：这时候，调用"同名，同参数"的方法的时候，报错---接口冲突
        //解决方法：我们要重写此方法

        subClass.MyMethod();


    }
}

//1-我写Subclass去实现interface_new这个接口
class SubClass extends SuperClass implements interface_new {
    //问题3-实现接口的方法，可以重写吗
    //回答：可以重写
    public void method2() {
        System.out.println("我是默认方法--被重写类 ");
    }

    public void method3() {
        System.out.println("太多人要我，我是被重写的method3");
    }

    //重点
    public void MyMethod() {
        method3();//调用自己"重写"的方法
        super.method3();//调用父类中声明的
        interface_new.super.method3();//调用接口中的"默认"方法
    }


}
