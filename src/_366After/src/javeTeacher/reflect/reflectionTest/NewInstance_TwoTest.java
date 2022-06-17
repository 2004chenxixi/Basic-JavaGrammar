package _366After.src.javeTeacher.reflect.reflectionTest;

import org.testng.annotations.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
调用运行时类中指定的结果：属性、方法、构造器---（要掌握）
 */
public class NewInstance_TwoTest {
    //问题1-：如何操作运行时类中的指定的"属性"---掌握
    @Test
    public void test() throws Exception {
        //1- 实例化"运行时类"
        Class<Person> classzz = Person.class;
        //2- 创建"运行时的对象"
        Person p = classzz.newInstance();
        //3- 获取"运行时类"中指定变量名的"属性"--getDeclaredField(String  name)
        Field name = classzz.getDeclaredField("name");
        //4- 保证当前属性是可以访问的
        name.setAccessible(true);
        //5- 获取、设置--指定对象的此属性值(运行时对象，改的值)
        name.set(p, "Tom");
        System.out.println(name.get(p));
    }

    //问题2-：如何操作运行时类中的指定的"方法"---掌握
    @Test
    public void test2() throws Exception {
        //1- 实例化"运行时类"
        Class<Person> classzz = Person.class;
        //2- 创建"运行时的对象"
        Person p = classzz.newInstance();
        //3-获取运行时类的方法.getDeclaredMethod("你需要的方法名"，参数的行参列表--括号内的 )
        Method show = classzz.getDeclaredMethod("show", String.class);
        //4- 保证当前属性是可以访问的
        show.setAccessible(true);
        //5--.invoke(方法的调用者，"实参数")
        // invoke的返回值，就是调用方法中的放回值
        Object returnValue = show.invoke(p, "Chinese");
        System.out.println(returnValue);

        System.out.println("——————————测试静态方法——————————————————————————");

        //1-同上--1- 实例化"运行时类"
        //2-同上--2- 创建"运行时的对象"
        //3-开始---获取运行时类的构造器.getDeclaredMethod(方法名，因为是static，所以只要方法吗名就可以)
        Method showDesc = classzz.getDeclaredMethod("showDesc");
        show.setAccessible(true);
        //如果调用的运行时类中的方法没有返回值，.invoke则返回null
        //todo  如果showDesc是private，就不行---和反射矛盾（待解决）
        Object returnValue2 = showDesc.invoke(null);
        System.out.println(returnValue2);
    }

    //问题3-：如何操作运行时类中的指定的"构造器"---掌握
    @Test
    public void test3() throws Exception {
        //1- 实例化"运行时类"
        Class<Person> classzz = Person.class;
        //2-获取"指定的构造器"
        //public Person(String name, String sex, Integer age) {
        //.getDeclaredConstructor(参数：指明构造器的参数列表)
        //行参数有多少个，下面获得构造器也要写多少个，还要➕. class
        Constructor declaredConstructor = classzz.getDeclaredConstructor(String.class, String.class, Integer.class);
        //3- 保证可以反问
        declaredConstructor.setAccessible(true);
        //4- 创建运行时类的构造器
        Person person = (Person) declaredConstructor.newInstance("tom", "nan", 13);
        System.out.println(person);
    }
}
