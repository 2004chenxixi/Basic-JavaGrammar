package _312after_366before.src.javaTeacher.learn_final;

/*
final关键字（1- 太监  2- final的值不能变）

1- final用来修饰的结构：类、方法、变量

2- fina修饰一个类：---> (太监类，别的类不能继承final类，不能有子类)
比如：String类、System类、StringBuffer类

3- final修饰方法：这个方法不能被重写
比如：Object类中的getClass

4- final来修饰变量：此时"变量"就称为一个常量
  4.1- final修饰属性：可以考虑赋值的位置有：显示初始化、代码块中初始化、构造器中初始化

5- static  final来修饰：属性（全局常量）、方法
 */
public class FinalTest {

    final int width = 10;

    public void doWidth() {
        //width =20;  --- 因为width是final，所以不能再被修改
    }
}

final class FinalA {
}

//class B extends FinalA{} --- 不能继承final类


