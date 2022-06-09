package _366After.src.javeTeacher.gather.Collection_TreeSet_Test;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class personTest {
    @Test
    public void test() {
        TreeSet treeSet = new TreeSet();

        Person p1 = new Person("chenxixi", 18, new MyDate(2011, 21, 21));
        Person p2 = new Person("chenganfang", 13, new MyDate(2000, 22, 22));
        Person p3 = new Person("zhoumaodang", 12, new MyDate(2033, 24, 25));
        Person p4 = new Person("chenxixi", 11, new MyDate(2051, 27, 27));

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
