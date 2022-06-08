package _366After.src.javeTeacher.gather.learn_gather;

import org.testng.annotations.Test;

import java.util.*;

//Collection接口中的使用方法
//总结：
//*当我们要添加Obj时，要求obj所在的类要----重写equal方法
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
        collection.add(45);//自动装箱子
        collection.add(67);//自动装箱子
        collection.add(new Date());
        collection.add(new person("张三", 20));
        collection.add(new person("李四", 25));

        //8- remove 移除数据 --放回值为Boolen  --->true为移除成功/false
        boolean remove = collection.remove(123);
        System.out.println("查看是否移除成功= " + remove);
        System.out.println("内部信息-被移除后 = " + collection);

        //9- removeAll  -->以Coll1的内容为模版，在 Collection 删除与coll1相同内容的部分，当时coll1不受影响
        //模版删除
        Collection coll1 = Arrays.asList(45, 67);
        boolean rmAll = collection.removeAll(coll1);
        System.out.println("查看模版删除--是否成功= " + rmAll);
        System.out.println("coll1为模版的内容= " + coll1);
        System.out.println("以Coll1的内容为模版，在 Collection 删除与coll1相同内容的部分= " + collection);
    }

    @Test
    public void test3() {
        Collection collection = new ArrayList();
        collection.add("aa");
        collection.add("BB");
        collection.add(123);//自动装箱子
        collection.add(45);//自动装箱子
        collection.add(67);//自动装箱子
        collection.add(new Date());
        collection.add(new person("张三", 20));
        collection.add(new person("李四", 25));

        //10- 模版查询 -retainAll  --->  Collection 以 Coll1为模版，输出和Coll1（共有的内容）
        Collection coll1 = Arrays.asList(45, 67);
        collection.retainAll(coll1);
        System.out.println(collection);
    }

    @Test
    public void test4() {
        Collection collection = new ArrayList();
        collection.add("aa");
        collection.add("BB");
        collection.add(123);//自动装箱子
        collection.add(45);//自动装箱子
        collection.add(67);//自动装箱子
        //collection.add(new Date());
        collection.add(new person("张三", 20));
        collection.add(new person("李四", 25));

        Collection collection2 = new ArrayList();
        collection2.add("aa");
        collection2.add("BB");
        collection2.add(123);//自动装箱子
        collection2.add(45);//自动装箱子
        collection2.add(67);//自动装箱子
        //collection.add(new Date());
        collection2.add(new person("张三", 20));
        collection2.add(new person("李四", 25));

        //11-equal  比较两个集合的内容-是否相等
        System.out.println("比较两个集合的内容-是否相等=  " + collection.equals(collection2));

        //12- hashCode 哈希值
        System.out.println("collection的哈希值= " + collection.hashCode());

        System.out.println("-----------------------------------------");

        //13-toArray  集合 --> 数组
        Object[] arr = collection.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("我是 集合 --> 数组 便利效果=  " + arr[i]);
        }

        System.out.println("-----------------------------------------");

        //14-asList 数组 --> 集合
        List<String> list = Arrays.asList(new String[]{"aa", "bb", "cc"});
        System.out.println("数组 --> 集合= " + list);
        //数组(要用包装类) --> 集合 ---的细节
        List<Integer> arr2 = Arrays.asList(new Integer[]{133, 435});
        System.out.println("数组 --> 集合（要用包装类）= " + arr2);

        //15- iterator();放回Iterator接口的实例，用于便利集合元素---在iteratorTest中
    }
}
