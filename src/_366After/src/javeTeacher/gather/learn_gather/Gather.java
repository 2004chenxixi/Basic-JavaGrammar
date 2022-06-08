package _366After.src.javeTeacher.gather.learn_gather;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

//Collection接口中的使用方法
public class Gather {
    @Test
    public void test1() {
        Collection collection = new ArrayList();
        //1- add(Object e); //将元素e，添加到集合coll中
        collection.add("aa");
        collection.add("BB");
        collection.add(123);//自动装箱子
        collection.add(new Date());

        //2- size //获取添加元素的个数
        System.out.println(collection.size());
    }
}
