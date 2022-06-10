package _366After.src.javeTeacher.gather.gether_Map.about_map_understand;

import org.testng.annotations.Test;

import java.util.*;

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
增：put(Object key ,Object value)
删：remove（Object key）
改：put(Object key ,Object value)
查：get（Object key）
长度：size（）；
便利：keySet（）/values（）/entry（）


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

        //4- remove(Object  key) -->  根据key来删除数据，返回的是 key对应的value
        Object value = map.remove(123);
        System.out.println(value); // 根据key来删除数据，返回的是 key对应的value
        System.out.println(map);

        //5- clear(清除数据)
        map.clear();
        System.out.println("clear后的的长度 =  " + map.size());
        System.out.println("clear后集合的内容  =  " + map);
    }

    @Test
    public void test2() {

        HashMap map = new HashMap();
        map.put("AA", 123);
        map.put("BB", 13);
        map.put("ACC", 23);

        //6查找 - get(Object  key)  //输入key，找到他的value
        System.out.println(map.get("AA"));

        //7- 检验是否存在--指定的这个key---.containsKey
        boolean isExistKey = map.containsKey("AA"); //是否存在Key="AA"的这个东西吗
        System.out.println("判断是否存在指定的这个key = " + isExistKey);

        //8- 检验是否存在--指定的这个value----.containsValue
        boolean isExistValue = map.containsValue(23); //是否存在Value=23 的这个东西吗
        System.out.println("判断是否存在指定的这个value = " + isExistValue);

        //9- isEmpty (看看这个集合，内容是否为空)
        /*
        map.clear();
        System.out.println("看看这个集合，内容是否为空  = "+map.isEmpty());
         */

    }

    @Test
    public void test3() {
        HashMap map = new HashMap();
        map.put("AA", 123);
        map.put("BB", 13);
        map.put("ACC", 23);

        //10- 便利所有的key： keySet()
        Set set = map.keySet();             //1- 先接收keySet的值
        Iterator iterator = set.iterator(); //2- 用接收的keySet的值..iterator();
        while ((iterator.hasNext())) {       //3- while便利keySet的值..iterator();
            System.out.println(" 便利所有的key = " + iterator.next());
        }
        System.out.println("--------------------");

        //11- 便利所有的value
        Collection values = map.values();
        for (Object obj : values) {
            System.out.println("便利所有的value = " + obj);
        }

        //12- 便利所有的key - value
        //便利方式一、
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object obj = iterator1.next();
            //entrySet集合中的元素都是entry
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + " ----> " + entry.getValue());
        }
        //便利方式二、
        Set setKey = map.keySet();             //1- 先接收keySet的值
        Iterator iterator2 = setKey.iterator(); //2- 用接收的keySet的值..iterator();
        while ((iterator2.hasNext())) {       //3- while便利keySet的值..iterator();
            Object key = iterator2.next();
            Object value = map.get(key);
            System.out.println(key + " ======> " + value);

        }


    }
}
