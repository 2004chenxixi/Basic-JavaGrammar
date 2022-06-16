package _366After.src.javeTeacher.reflect.reflectionTest;

import org.testng.annotations.Test;

import java.lang.reflect.Field;

/*
调用运行时类中指定的结果：属性、方法、构造器
 */
public class NewInstance_TwoTest {
    //问题1-：如何操作运行时类中的指定的属性---掌握
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

    //问题2-：如何操作运行时类中的指定的方法---掌握
}
