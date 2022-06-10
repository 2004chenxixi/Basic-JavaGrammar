package _366After.src.javeTeacher.gather.Collection_TreeSet_Test;

import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class personTest {
    @Test  //这个Test--调用的是，公共类 -- 重写Collection 自然类
    public void test() {
        //注：因为这个用treeSet来储存，也包含来TreeSet的特性，不能重复
        //如果用 数组/List 来接收，就可以重复
        TreeSet treeSet = new TreeSet();


        Person p1 = new Person("chenxixi", 18, new MyDate(2011, 21, 21));
        Person p2 = new Person("chenganfang", 13, new MyDate(2000, 22, 22));
        Person p3 = new Person("zhoumaodang", 12, new MyDate(2033, 24, 25));
        Person p4 = new Person("chenxgua", 11, new MyDate(2051, 27, 27));

        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);


        Iterator iterator1 = treeSet.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

    }

    @Test  //这里不是调用--公共重写的自然类  ---> 是自己写的 --自定义类
    public void test2() {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person) {
                    Person person1 = (Person) o1;  //记得大写
                    Person person2 = (Person) o2;

                    MyDate birthday1 = person1.getBirthday();
                    MyDate birthday2 = person2.getBirthday();

                    //比较年
                    int year = birthday1.getYear() - birthday2.getYear();
                    if (year != 0) {
                        return year;
                    }

                    //比较月
                    int month = birthday1.getMonth() - birthday2.getMonth();
                    if (month != 0) {
                        return month;
                    }

                    //比较日
                    return birthday1.getDay() - birthday2.getDay();

                }
                throw new RuntimeException("输入错误");
            }
        });

        Person p1 = new Person("chenxixi", 18, new MyDate(2011, 21, 21));
        Person p2 = new Person("chenganfang", 13, new MyDate(2000, 22, 22));
        Person p3 = new Person("zhoumaodang", 12, new MyDate(2033, 24, 25));
        Person p4 = new Person("chenxgua", 11, new MyDate(2051, 27, 27));

        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);

        Iterator iterator1 = treeSet.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

    }

}

