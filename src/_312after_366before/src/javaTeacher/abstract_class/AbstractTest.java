package _312after_366before.src.javaTeacher.abstract_class;

/*
abstract关键字的使用
（抽象和普通的类多定义类一个abstract方法，除了不能直接进行实例化，其他都一样）
 1-abstract：抽象
 2-abstract可以用来修饰的结构：类、方法

 3-abstract修饰类：
       1-这个类不能实例化(造对象)
       2-抽象类中一定有构造器，便于"子类"实例化时候调用（涉及：子类对象实例化的全过程）
       3-抽象类不能实例化，一般都会提供抽象类的子类，让子类去实例化

4- abstract修饰方法：
       1- 只有方法的声明，没有方法体
       2- 包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法
       3- 若子类重写父类中的所有的抽象方法后，此子类方可实例化
       4- 若子类没有重写父类中的所有的抽象方法，则此子类也是一个抽象类，需要使用abstract来修饰

       对3-4的总结，如果一个类是抽象类--1-要在类开头定义他是abstract  2- 重写有关abstract的方法

5- abstract的使用注意：
       1- abstract 不可以修饰：属性、构造器等结构
       2- abstract 不能用来修饰私有的方法、静态方法、final的方法、final的类
  */
public class AbstractTest {
    public static void main(String[] args) {
        //person person = new person();---->报错了，因为person类被abstract修饰了

    }
}

abstract class person {
    String name;
    int age;
    String sex;

    public person() {
    }

    public person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void walk() {
        System.out.println("走");
    }

}