package _366After.src.javeTeacher.gather.gather_there.Set_Test;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
使用set的场景
1- 让list去除重复的内容


 */


public class Set_test {

    public List duplicateList(List list) { //方法
        HashSet set = new HashSet();  //设置hashset
        set.addAll(list);             //把有重复内容的list，放到hashSet里面，去除相同内容
        return new ArrayList(set);   //因为你开头返回值是List，如果直接写set，返回的是haseSet值，不是list
    }

    @Test
    public void test() {
        ArrayList list = new ArrayList();  //1- 创建一个list的集合
        list.add(new Integer(1));    //2- 给集合--添加内容
        list.add(new Integer(2));
        list.add(new Integer(2));
        list.add(new Integer(5));
        list.add(new Integer(5));
        list.add(new Integer(3));
        List list1 = duplicateList(list); //3- 把（有重复内容的list）放到hashSet里面
        for (Object obj : list1) {        //4- 便利
            System.out.println(obj);
        }
    }
}

