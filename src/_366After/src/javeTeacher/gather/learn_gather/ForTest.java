package _366After.src.javeTeacher.gather.learn_gather;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;

/*
加强版本的for循环 ---->foreach

细节：
     for (int i : arr)
            这里只是把arr的值，取出来--赋给i的，如果对i进行改变，arr不受影响
 */
public class ForTest {
    @Test
    public void test1() {
        Collection collection = new ArrayList();
        collection.add("aa");
        collection.add("BB");
        collection.add(123);//自动装箱子
        collection.add(45);//自动装箱子
        collection.add(67);//自动装箱子
        collection.add(new person("张三", 20));
        collection.add(new person("李四", 25));

        //for（"集合"元素的类型--局部变量  ： "集合"对象）
        //collection的类型 ---> 是Object的
        //内部仍然调用迭代器
        for (Object obj : collection) {
            System.out.println(obj);
        }
    }

    @Test
    public void test2() {
        int[] arr = {1, 4, 54, 53, 76, 98};
        //for（"数组"元素的类型--局部变量  ： "数组"对象）
        //arr的类型   --->  int类型的
        //内部仍然调用迭代器
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
