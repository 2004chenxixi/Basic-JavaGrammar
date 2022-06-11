package _366After.src.javeTeacher.gather.undertand_Collections;

/*
区分Collection  和  Collections 557
 */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

//Collections的常用方法
public class Collections_Test {
    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(876);
        list.add(0);
        list.add(999999);

        System.out.println(list);

        //1- 使用Collections的方法 -- 反转（数组）的内容
        Collections.reverse(list);  //调用Collections的reverse方法 -- 把数组放进去
        System.out.println(list);


    }
}
