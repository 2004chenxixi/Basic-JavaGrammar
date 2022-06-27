package _312after_366before.src.javaTeacher.learn_static;

/*
static关键字的使用：
1- static：静态的
2- static是用来修饰：属性、方法、代码块、内部类
3- 使用static修饰属性：--->  静态变量
     3.1-属性是否使用static修饰，分为：静态属性和非静态属性（实例变量）
         非静态变量（实例变量）：我们创建了类的多个对象，每个对象都独立拥有一套类中的非静态属性。当修改其中一个对象中的非静态属性时，不会导致其他对象中同样的属性值的修改。
         静态变量（类变量）：我们创建了类的多个对象，多个对象共享（最后）一个静态变量。当通过某一个对象修改静态变量时，会导致其他对象调用此静态变量时，是修改过了的。
     3.2-static修饰属性的其他说明：
         1- 静态变量随着类的加载而加载，可以通过"类.静态变量"的方式进行调用
         2- 静态变量的加载要早于对象的创建
         3- 由于类只会加载一次，则静态变量在内存中也只会存在一份；存在方法区的静态域中。
         总结：    类变量     实例变量
          类：     yes         no
          对象：   yes         yes
4- 使用static修饰方法：
         1- 随着类的加载而加载，可以通过"类.静态的方法"的方式进行调用
        2-  总结：    静态方法    非静态方法
             类：     yes         no
             对象：   yes         yes
        3- 重点：1.静态方法，只能调静态的方法和属性  <-----> 2.非静态的方法，可以调用非静态方法And静态方法

5- static注意点：
       1- 在静态方法内，不能使用this关键字、super关键字。
       2- 关于静态属性和静态方法的使用，都从生命周期的角度区理解。

*6- 什么时候，要用static
       1-什么时候用Static属性：
                   回答：属性被多个对象共享，不会随着对象的不同而不同
       2-什么时候用Static方法：
                   回答： 1- 操作静态属性的方法，通常Static
                         2- 工具类中的方法，习惯上声明为Static。比较Math、Arrays、Collections
 */
public class StaticTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "chenxixi";
        person1.age = 18;
        person1.notion = "china";//在没有person2的时候，这个notion="china"，但是因为有了person2，又因为notion是静态，所以会被改变

        Person person2 = new Person();
        person2.name = "zhou";
        person2.age = 18;
        person2.notion = "CHINA";

        if (person1.notion == person2.notion) {
            System.out.println("测试static方法，如果 person2.notion == person1.notion ，返回+出这句话");
        }

        System.out.println("测试静态static方法的notion是否改变---> person1=  " + person1.notion);
        System.out.println("测试静态static方法的notion是否改变---> person2=  " + person2.notion);
    }
}

class Person {
    //测试的类--static的属性
    String name;
    int age;
    static String notion;

    public void eat() { //非静态方法
        System.out.println("吃饭");
        //非静态----可以调非静态方法AND静态方法
        sleep();//非静态方法，调用非静态方法--Success
        show();//非静态方法，调用静态方法--Success

    }

    public static void show() {//静态方法
        System.out.println("我们是show");
        //sleep(); -- 静态方法，调用非静态方法--Fail
        playGame();//-- 静态方法，调用静态方法--Success
    }

    public void sleep() { //非静态方法
        System.out.println("睡觉");
    }

    public static void playGame() {//静态方法
        System.out.println("我们是打游戏");
    }


}

