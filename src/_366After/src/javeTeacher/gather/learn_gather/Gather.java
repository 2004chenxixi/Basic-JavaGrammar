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
        collection.add(new person("张三", 20));
        collection.add(new person("李四", 25));


        //2- size //获取添加元素的个数
        System.out.println(collection.size());

        //3- addAll(Collection coll1);//将coll1集合的元素添加到当前的集合中
        Collection Coll1 = new ArrayList();
        Coll1.add("CC");
        Coll1.add("dd");
        collection.addAll(Coll1);  //collection使用addAll  --将Coll1，加到自己的集合中

        //4- isEmpty  -- 判断当前集合是否为空
        System.out.println("判断当前的集合是否为空 =  " + collection.isEmpty());

        //5- clear  --清空集合里面的内容
        /*
        --先把5-注销，不然下面都是空
        collection.clear(); //我们清空完，再看看isEmpty是否为空
        System.out.println("使用完clear--再判断当前的集合是否为空 =  "+collection.isEmpty());
        */

        //6- contains（Object obj ）判断当前集合中是否包含obj  --true/false
        //检查（XX）这个数，是否在集合中
        boolean contains = collection.contains("dd");
        boolean contains1 = collection.contains(new person("张三", 20));
        //contains这个方法比较的是equal方法，在person类中重写equal方法就变成true了¬
        System.out.println("判断当前集合中是否包含XX = " + contains);
        System.out.println("判断当前集合中是否包含-张三 = " + contains1);

        //7- containsAll --- 判断（形参coll1）中的所有元素是否都存在当前集合中
        boolean conAll = collection.containsAll(Coll1);
        System.out.println("判断（形参coll1）中的所有元素是否都存在当前集合中= " + conAll);//ture,因为collection.addAll(Coll1);
    }

    @Test
    public void test2() {
        Collection collection = new ArrayList();
        collection.add("aa");
        collection.add("BB");
        collection.add(123);//自动装箱子
        collection.add(new Date());
        collection.add(new person("张三", 20));
        collection.add(new person("李四", 25));

        //8- 移除数据 --放回值为Boolen  --->true为移除成功/false
        boolean remove = collection.remove(123);
        System.out.println("内部信息= " + collection);
        System.out.println("查看是否移除成功= " + remove);
        System.out.println("内部信息-被移除后 = " + collection);
    }
}
