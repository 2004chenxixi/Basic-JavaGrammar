package _366After.src.javeTeacher.gather.gether_Map.about_map_understand;

import org.testng.annotations.Test;

import java.util.HashMap;

/*
一、
Map：双列数据，存储key--value对的数据
         hashMap:（作为map的主要实现类）；线程不安全，效率高;存储null的key和value
               LinkedHashMap：保证在便利Map的时候，可以按照--添加顺序实现便利（怎么写的，怎么便利）
         treeMap：保证按照（key）/（定制）来实现--便利的操作
         Hashtable：古老实现类；线程安全，效率低；不能储存null的key和value
               Properties：处理配置文件，key和vaule都是String类型

二、
Map结构的理解
    Map中的key：无序、不可重复、使用set存储所有的key
    Map中的value：无序、可重复，使用Collection来存储所有的value
    一个键值对：key--value构成一个Entry的对象
    Map中的Entry：无序、不可重复，使用set存储entry

三、HashMap的常用方法


 */
public class About_Map_Understand {
    @Test
    public void MapTest1() {
        //三、SashMap的常用方法
        HashMap map = new HashMap();
        //1-添加
        map.put("AA", 123);
        map.put("BB", 13);
        map.put("ACC", 23);

        //2-修改（当key一样的时候，就是修改）
        map.put("AA", 9999999);
        System.out.println(map);

        //3-putAll 把一个集合放在另一个集合A.putAll(B)   --- >   把集合B的内容，放到集合A中
        HashMap map1 = new HashMap();
        map1.put(123, 544);
        map1.put(978, 99999999);
        map.putAll(map1);
        System.out.println(map);


    }
}
