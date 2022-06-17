package _366After.src.javeTeacher.reflect.reflectionTest;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

/*
通过"反射"--创建对应的运行时类的对象的信息（俗话：获取"自定义类中的属性和方法和所有的一切"）
 */
public class NewInstanceTest {
    @Test
    public void test1() throws Exception {
        Class<Person> personClass = Person.class;
        //***-->  newInstance();调用此方法，创建对应的运行时类的对象(俗话：获取"自定义类中的属性和方法"）
        Person person = personClass.newInstance();
        System.out.println("使用newInstance()这个方法，获取--自定义类中的属性和方法= " + person);
    }

    // 查看运行时类的信息
    @Test
    public void test() {
        Class<Person> personClass = Person.class; //查看的是"Person"这个运行时类的信息

        //1- getmethods(); 获取当前运行时类，及多有父类中声明为public权限的方法
        Method[] methods = personClass.getMethods();
        for (Method m : methods) {
            System.out.println("获取当前运行时类，及多有父类中声明为public权限的方法= " + m);
        }
        System.out.println("__________________");

        //2- getDeclaredMethods();  获取当前"运行时类"中声明的所有方法（不包含父类）
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println("获取当前\"运行时类\"中声明的所有方法（不包含父类）= " + m);
        }

        //3-通过"反射"--->    可以获取"权限修饰符，返回值类型，方法名，异常"这些信息

        //4- 通过"反射"--->  可以获取"1- 当前运行时类中声明为public的构造器 2- 当前运行时类中所有的构造器"这些信息

        //5-通过"反射"---> 获取"当前运行时类的--父类（也可以获得父类的泛型 ）"

        //6-通过"反射"---> 获取"当前运行时类，父类的接口 ）"

        //7- -通过"反射"---> 获取运行时类所在的包


    }
}
