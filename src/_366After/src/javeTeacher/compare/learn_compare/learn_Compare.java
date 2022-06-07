package _366After.src.javeTeacher.compare.learn_compare;

import org.testng.annotations.Test;

import java.util.Arrays;

/*
一、正常的java只能用 == 或者 !=  来比较大小
    不能用<  或者  >
    当我们需要对"对象"进行比较大小的时候--可以使用comparable 、comparator

二、comparable接口使用 -->自然排序(从小到大)

***三、1-对于String、包装类  ---直接使用Arrays.sort(XX数组);  来比较大小
       2-如果是(自定义类)--需要 ： 1-让对比的(自定义类中)implements Comparable 、 2- (在自定义类中)重写compareTo  3、再使用Arrays.sort(XX数组);  来比较大小
 */
public class learn_Compare {
    //comparable的使用
    @Test
    public void TestComparable1() {
        String[] str = new String[]{"ww", "aa", "cc", "rr", "tt"};
        Arrays.sort(str);//从小到大
        System.out.println(Arrays.toString(str));
    }

    @Test
    public void TestComparable2() {//比较（自定义）的类

        Goods[] goods = new Goods[5];
        //调用构造器用new Goods()；
        goods[0] = new Goods("xiaomi", 23);//这里因为我的Goods什么方法都没写，为了可以赋值，就new Goods()调用的是有参构造器
        goods[1] = new Goods("dell", 153);
        goods[2] = new Goods("sanxin", 98);
        goods[3] = new Goods("huawei", 103);
        goods[4] = new Goods("huasuo", 103);

        Arrays.sort(goods);//从小到大
        System.out.println(Arrays.toString(goods));


    }

//————————————————————————————————————————————————————————————————————————————————————————
//————————————————————————————————————————————————————————————————————————————————————————

    /*
    Comparator比较器（定制排序）
背景：1- 元素类没有实现Java.lang.Comparable接口而又不方便修改代码，
        或者实现java.lang.Comparable接口的排序规则不适合当前的操作，
        那么可以考虑使用Comparable的对象来排序

     */
}
