package _312after_366before.src.javaTeacher.learn_interface_Old;

/*
接口的使用
1- 接口的使用用--interface来定义
2- Java中。接口和类是并列的两个结构
3--如何定义接口：定义接口中的成员
JDK8：
      1- 全局常量：public static  final（可以省略）
      2- 抽象方法：public abstract
      3- 静态方法：
      4- 默认方法：

4- 接口中不能定义"构造器"，接口不可以"实例化"----所以，"接口"让"类"去实现接口（用--implement）
如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以"实例化"
反之--如果实现类没有覆盖接口中所有抽象方法，则实现类还是抽象类

5- java类可以实现多个接口 ---> 弥补类java单继承性（单继承，多实现）
单继承，多实现--的格式：
               class Word extend AA implements BB，CC（单继承，多实现）

6- 接口的具体使用，体系多态性：
7- 接口，实际上可以看做是一种规范：

 */
public class interfaceTest {
    public static void main(String[] args) {
        Flane flane = new Flane();
        flane.fly();//调用，类实现接口后，重写的方法
    }
}

//1- 接口的测试
interface Flyable {
    //全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;//----> 前面的"public static final"可以略，但是效果还在

    //抽象方法
    public abstract void fly();

    void stop(); //----- 前面的"public abstract"可以略

}

//2- 类实现接口的测试（implement）--重写完抽象类的方法，不是抽象类，可以实例化
class Flane implements Flyable {

    @Override//重写，抽象类的方法
    public void fly() {
        System.out.println("awkward-我可以飞");
    }

    @Override//重写，抽象类的方法
    public void stop() {
        System.out.println("我可以停");
    }
}

//3-  类实现接口的测试（implement）--没重写完抽象类的方法，是抽象类，不可以实例化
//我就只，重写了部分的方法，这个还是抽象类abstract
abstract class Kite implements Flyable {
    @Override
    public void fly() {
    }
}

//----------------------------------------------------------------------------------

