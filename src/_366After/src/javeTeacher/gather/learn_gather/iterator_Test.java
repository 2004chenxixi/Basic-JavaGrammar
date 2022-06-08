package _366After.src.javeTeacher.gather.learn_gather;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/*
iterator的迭代器
使用iterator接口便利集合元素

总结：
      便利集合--next、hasNest
 */
public class iterator_Test {
    public void test1() {
        Collection collection = new ArrayList();
        collection.add("aa");
        collection.add("BB");
        collection.add(123);//自动装箱子
        collection.add(45);//自动装箱子
        collection.add(67);//自动装箱子
        collection.add(new person("张三", 20));
        collection.add(new person("李四", 25));

        Iterator iterator = collection.iterator();
        //方式一、便利(不推荐)
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(iterator.next());
        }

        //方式二、便利(推荐)
        //hasNext：判断是否还会有下一个元素
        while (iterator.hasNext()) {
            //next：1-指针下移  2-将下移以后集合位置上的元素放回
            System.out.println(iterator.next());
        }

    }

    @Test
    //  用iterator-便利集合时候---顺便删除数据
    public void test2() {
        Collection collection = new ArrayList();
        collection.add("aa");
        collection.add("BB");
        collection.add(123);//自动装箱子
        collection.add(45);//自动装箱子
        collection.add(67);//自动装箱子
        collection.add(new person("张三", 20));
        collection.add(new person("李四", 25));

        //删除集合中"BB"
        Iterator iterator = collection.iterator(); //- 第一次
        while (iterator.hasNext()) {
            Object obj = iterator.next(); //赋值给obj
            if ("BB".equals(obj)) {
                iterator.remove();
            }
        }

        //便利集合
        iterator = collection.iterator();//- 第二次
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
