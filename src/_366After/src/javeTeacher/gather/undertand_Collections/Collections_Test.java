package _366After.src.javeTeacher.gather.undertand_Collections;


//Collections工具的使用
//Collections是工具（让数组，怎么样怎么样的工具）
/*
区分Collection  和  Collections
Collection是集合，Collections是工具（让数组，怎么样怎么样的工具）
 */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Collections的常用方法
public class Collections_Test {
    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(123);
        list.add(123);
        list.add(456);
        list.add(876);
        list.add(0);
        list.add(999999);

        System.out.println(list);

        //1-.reverse 使用Collections的方法 -- 反转（数组）的内容
        Collections.reverse(list);  //调用Collections的reverse方法 -- 把数组放进去
        System.out.println("使用collections工具 -- 反转=  " + list);

        //2-.shuffle 随机排序
        Collections.shuffle(list);
        System.out.println("使用collections工具 -- 随机排序=  " + list);

        //3-排序
        Collections.sort(list); //从小到大
        System.out.println("使用collections工具 -- 排序 =  " + list);

        //4- 交换位置上的元素（根据索引）
        Collections.swap(list, 2, 3);//让索引2.和索引3，位置的元素互换
        System.out.println("使用collections工具 -- 交换位置 =  " + list);

        //5- 查看某个元素，出现的次数
        int frequency = Collections.frequency(list, 123);//查看在list这个集合里面，123出现的次数
        System.out.println("使用collections工具 --  查看某个元素，出现的次数 =  " + frequency);

        //6- copy（dest，src） --> 把src复制一份给dest
        List dest = Arrays.asList(new Object[list.size()]); //创建一个数组，内容为src的长度，里面都是null（这样的话长度才够）
        //copy的细节是：要创建一个dest长度要和是src的长度（一样或者更大）的集合，才可以复制
        System.out.println("创建dest的内容= " + dest);
        System.out.println("创建dest的长度= " + dest.size());

        Collections.copy(dest, list);
        System.out.println("复制后dest的内容=  " + dest);

        //7-
        /*
        线程安全
        collecton中提供了对synchronizedXXX方法
        该方法可将指定集合包装成线程同步的集合，从而可以解决多线程并发反问集合时的线程安全问题
         */
        List list1 = Collections.synchronizedList(list);
        System.out.println("线程安全问题= " + list1);

        //附加 -对线程的使用
        /*
        我们使用集合--主要都是使用ArrayList和HashMap都是效率高，但是线程不安全的
当然有解决方法：
        我们可以将：ArrayList和HashMap转化成为线程的。
        操作：Collections.synchronizedList(List list)、Collections.synchronizedMap(Map  map)
        使用.synchronizedXXX()就可以使线程安全。
         */


    }
}
