package _366After.src.javeTeacher.gather.gather_there;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
collection接口：单列集合，用来存储一个一个的对象

           set接口：存储无序的、不可重复的数据  -->"高中的"集合
                     HashSet: 作为Set接口的主要实现类；线程不安全；可以存储null值
                              LinkedHashSet：作为hashSet的子类；"便利"其内部数据的时候，可以按照填写的顺序"便利"
                     treeSet：可以按照添加对象的指定属性，进行排序
 */
public class About_Set_understand {
    // set接口：存储无序的、不可重复的数据
    /*
    1- 无序性  !=  随机性
    存储的数据在底层数组中并非按照数组的索引的顺序添加，而是根据---哈希值

    2- 不可重复性 :保证添加的元素按照equals()判断时候，不能返回true，--  相同的元素只能添加一个
    要求：向Set中添加的数据，其所在的类一定要重写  hashCode  和  equal  方法
     */
    @Test
    public void test1() {
        HashSet set = new HashSet();
        set.add(123);
        set.add(456);
        set.add(789);
        set.add(new User("张三", 21));
        set.add(new User("张三", 21));
        set.add(new User("李四", 43));
        set.add("AA");
        set.add("BB");
        set.add("CC");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //    LinkedHashSet的使用
    /*  LinkedHashSet作为HashSet的子类，在添加数据的同时，每个数据还维护类两个引用，记录前后两个数据

    优点：对于频繁的便利效果，LinkedHashSet效率比hashSet的高

     */
    @Test
    public void test2() {
        HashSet set1 = new LinkedHashSet();
        set1.add(123);
        set1.add(456);
        set1.add(789);
        set1.add(new User("张三", 21));
        set1.add(new User("张三", 21));
        set1.add(new User("李四", 43));
        set1.add("AA");
        set1.add("BB");
        set1.add("CC");

        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
