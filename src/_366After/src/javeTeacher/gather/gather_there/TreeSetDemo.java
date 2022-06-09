package _366After.src.javeTeacher.gather.gather_there;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.TreeSet;


/*
1- treeSet中添加的数据，要求是 "相同类" 的对象


2-两种（排列）方式
自然排序：比较两个对象是否相同的标准：compareTo返回0，而不是equals
定制排序：比较两个对象是否相同的标准：compare返回0，而不是equals
** 没有写全--建议看Comparable专门的章节
 */


public class TreeSetDemo {
    @Test
    public void test1() {
/*
         1- treeSet中添加的数据，要求是 "相同类" 的对象
 */
        //错误示范
//        TreeSet set = new TreeSet();
//        set.add(3);
//        set.add(2);
//        set.add(5);
//        set.add(1);
//        set.add(3);
//        set.add(new User("ZZ",12));
//        set.add("AA");
//        System.out.println(set);
    }

    @Test
    public void test2() {
        //举例子一、
        TreeSet set = new TreeSet();
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(1);
        set.add(3);
        System.out.println(set);
    }

    @Test
    public void test4() {
        //举例二、比较String类型  --- （在Uer类里面要重写  1-继承Comparable  2- 重写ComparableTo方法 ）
        //需要回顾 --> comparable的内容
        TreeSet set = new TreeSet();
        set.add(new User("qq", 2));
        set.add(new User("ww", 22));
        set.add(new User("ee", 33));
        set.add(new User("rr", 44));
        set.add(new User("rr", 43));


        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}