package _366After.src.javeTeacher.gather.gather_List;

import _366After.src.javeTeacher.gather.learn_gather_collection.person;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*

                                               List的理解和常用方法
collection接口：单列集合，用来存储一个一个的对象
           List接口：存储有序的、可重复的数据  --> "动态"数组
                 ArrayList -->  "作为List接口的主要实现类，线程不安全，效率高，底层用Object[] elementData （推荐）"
                 linkedList --> "对于频繁插入、删除操作，使用此类的效率比ArrayList高;底层使用双向链存储    （看情况---推荐）"
                 Vector -->     "作为List接口的古老实现；线程安全，效率低，底层使用Object[] elementData存储 （不推荐）"

ArrayList、LinkedList、vector三者的异同
同：1- 都实现类List接口  2-存储有序、可以重复的数据
异：看上面

-----------------------------------------------------------------------------------------------------------

**总结：常用方法
增：    -->    add(Object  obj) //默认在末尾增加
删：    -->    remove(int index) / remove(Object  obj)
改：    -->    set(int  index, Object  ele)
查：    -->    get(int index)
插入：  -->    add(int  index, Object  ele)
长度：  -->    size()
便利：  -->    1- Iterator(迭代器方式)    2- foreach    3-普通循环

 */
public class About_List_understand {
    @Test
    public void test1() {
        //1-  自定义位置增加  ： add(int  index,Object  ele)  -- >  把ele这个值，放在"自定义的index"这个位置
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add("AA");
        list.add(new person("张三", 43));
        list.add(999);
        System.out.println(list);
        list.add(1, "CCC");//自定义位置增加
        System.out.println(list);

        //2-  自定义位置(增加一个"集合")  ：1- addAll(int  index,Object  eles)  -- >  把eles这个"集合"，放在"自定义的index"这个位置
        List list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1); //1- 没添加index，默认在--末尾
        System.out.println(list);

        list.addAll(0, list1);//2- 我规定把这个"集合"放在，index=0，的这个位置
        System.out.println(list);

        //3- 按照index，获取指定索引的元素  Object  get（int  index）
        System.out.println("按照index，获取指定索引的元素= " + list.get(1));
    }

    @Test
    public void test2() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add("AA");
        list.add(new person("张三", 43));
        list.add(123);
        list.add(999);
        //4- .indexOf    返回"obj"在集合中的位置，如果这个集合不存在"obj"，则返回  -1
        int index = list.indexOf("AA");
        System.out.println("放回AA在集合中的索引位置 = " + index);

        //5-  如果在一个集合中有很个，"AA"，那么latIndexOf，就会报出，最后一个"AA"的索引位置
        //万花丛中，选择最后一朵花
        int index1 = list.lastIndexOf(123);
        System.out.println("lastIndexOf,万花丛中，选择最后一朵花=  " + index1);

        //6-Object remove（int  index）：删除指定index位置的元素，返回的是--你删除的那个元素( 就是你可以查看，你自己删的是什么)
        //对"返回的是--你删除的那个元素"的解析 --->  就是你可以查看，你自己删的是什么
        Object obj = list.remove(0);
        System.out.println("remove的返回值就是，你可以查看，你自己删的是什么=  " + obj);

        //7- Object set（int index ，Object ele）：设置(修改)指定index位置的元素为ele
        list.set(1, "QQ");
        System.out.println(list);

        //8- 获取--集合中指定index位置的内容[A，C)
        //sublist不会对原来的list集合，有影响
        List list1 = list.subList(3, 5);
        System.out.println(" 获取--集合中指定index位置的内容=  " + list1);
    }

    @Test
    public void test3() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add("AA");

        //List的循环（3种）
        //1- iterator
        Iterator iterator = list.iterator();      //1- 把需要 -- (便利的集合).iterator();
        while (iterator.hasNext()) {              //2- .hasNext()
            System.out.println(iterator.next()); //3- .next()
        }

        //2-foreach
        for (Object obj : list) {    //类型  ： （便利的集合）
            System.out.println(obj);
        }

        //3-普通版本
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    //附加 ---> 小问题：对remove的理解
    @Test
    public void test4() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        updateList(list);  //调用下面写的updateList方法
        System.out.println(list);
    }

    private void updateList(List list) {
        list.remove(2);              //这样的是删除 index索引为2的元素
        list.remove(new Integer(2)); //这样是删除 --值为2的这个元素
    }

}
