package _366After.src.javeTeacher.reflect.reflectionTest;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/*
反射 --> "大鱼吃小鱼的原理"
解释：
    我们之前说，定义一个类，后可以分为private、public这些状态，可是我们用"反射"就相当于"有一个大的.Class把小.class吃掉了"
    那大鱼就可以使用小鱼肚子里面的任何"私有"方法。
 */
public class ReflectionTest {
    //1- 获取Class的实例
    @Test
    /*
    换句话说：Class的实例就对应这一个运行时类
    加载到内存中的运行时类，会缓存一定的时间。在此时间内，我们可以通过不同的方式(下面有3种，可以参考)来获取此运行时类
     */
    public void test1() throws ClassNotFoundException {
        //方法一：调用运行时的属性
        Class<Person> classzz1 = Person.class;
        System.out.println(classzz1);
        //2- 方式二：运行时类的对象，调用getClass
        Person classzz2 = new Person();
        Class<? extends Person> aClass = classzz2.getClass();
        System.out.println(aClass);
        //3-调用Class的静态方法：forName（String classPath）
        //这里有小技巧，我选择的"自定义类--person"，这里的路径，我双击点person，任何选择 - Copy-Reference
        Class<?> aClass1 = Class.forName("_366After.src.javeTeacher.reflect.reflectionTest.Person");
        System.out.println(aClass1);
    }

    //2- 读取配置文件
    @Test
    public void test2() throws Exception {
        Properties properties = new Properties();
        //1-方式一：（读取当前module下的配置文件）
        FileInputStream fileInputStream = new FileInputStream("jdbc.properties");
        properties.load(fileInputStream);

        //方式二：（当前modv ule下的src的配置文件）
        ClassLoader classLoader = ClassLoader.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("jdbk1.properties");
        properties.load(resourceAsStream);
    }
}
