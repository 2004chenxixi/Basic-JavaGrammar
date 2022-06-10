package _366After.src.javeTeacher.gather.gether_Map.about_treeMap_understand;

import org.testng.annotations.Test;

import java.util.*;

/*
向TreeMap中添加key- value，要求key必须去由同一个类创建的对象
因为要按照key进行排序：自然排序，定制排序

TreeSet，就用compareTo和comparator来对类进行比较的
 */
public class About_TreeMap_Understand {
    @Test //默认compareTo排序
    public void test1() {
        TreeMap map = new TreeMap();
        User user1 = new User("tom", 12);
        User user2 = new User("java", 121);
        User user3 = new User("C++", 152);
        User user4 = new User("C", 123);

        map.put(user1, 10);
        map.put(user2, 2);
        map.put(user3, 90);
        map.put(user4, 54);

        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object obj = iterator1.next();
            //entrySet集合中的元素都是entry
            Map.Entry entry = (Map.Entry) obj;
            System.out.println("这里面用的是" + entry.getKey() + " ----> " + entry.getValue());
        }


    }

    @Test //new Comparator()  --按照age排序
    public void test2() {
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    return Integer.compare(u1.getAge(), (u2.getAge()));
                }
                throw new RuntimeException("你输入的类型有误");
            }
        });
        User user1 = new User("tom", 12);
        User user2 = new User("java", 121);
        User user3 = new User("C++", 152);
        User user4 = new User("C", 123);

        map.put(user1, 10);
        map.put(user2, 2);
        map.put(user3, 90);
        map.put(user4, 54);

        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object obj = iterator1.next();
            //entrySet集合中的元素都是entry
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + " ----> " + entry.getValue());
        }
    }
}
