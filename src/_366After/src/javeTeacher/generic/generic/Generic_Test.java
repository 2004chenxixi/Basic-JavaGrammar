package _366After.src.javeTeacher.generic.generic;

import org.testng.annotations.Test;

import java.util.*;

/*
1- 泛型的"抽象理解"：
     就像（公共厕所的图标--他规定了男生去哪个厕所，女生去哪厕所），男士进男厕所，女生进女厕所 ---> 对应String去String，integer去integer

2- 泛型的体验：
    1- 泛型的体验 --请看Test1和Test2，的对比实验

3- 在集合中使用泛型
    1- 在时例化集合时候，可以指明具体的泛型类型
           ArrayList list = new ArrayList(); -->  没有泛型
           ArrayList<Integer> list = new ArrayList<Integer>(); -->  有泛型

    2- 指明以后，在集合类或者接口中凡事定义类或者接口的时候，内部结构（比如：方法、构造器、属性 ···）使用到类的泛型的位置，都指定为实例化的泛型类型。
           比如：add（E A） ---> add（Integer A）

    3- 注意点：泛型的类型，必须是"类"，不能是"基本数据类型"，·如果需要用到"基本数据类型"，我们可以拿包装类替换
 */
public class Generic_Test {
    @Test
    //1- 在没使用"泛型"之前的情况
    public void test1() {
        ArrayList list = new ArrayList();
        //2- 给没有"泛型"的集合赋值
        list.add(21);
        list.add(25);
        list.add(29);
        list.add(67);
        list.add("Tom");

        //3- 把list的集合，放到int里面
        for (Object score : list) {
            int studentScore = (int) score;
            //4- 输出会爆出-ClassCastException问题  --因为"Tom"不是int类型的
            System.out.println(studentScore);
        }
    }

    @Test
    //1- 使用"泛型"后
    public void test2() {
        //2- 使用了<>泛型
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(21);
        list.add(25);
        list.add(29);
        list.add(67);
        //3- 使用了"泛型"所以 -- 除了泛型定义的类型，其他类型不能填入
        // list.add("Tom");  --> 型不匹配

        //4- 把list的集合，放到int里面
        for (Integer score : list) {
            int studentScore = score;
            System.out.println(studentScore);
        }
    }

    @Test
    //在集合中使用"泛型"的情况：以HashMap为例子
    public void test3() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        //1- 付值
        map.put("Tom", 187);
        map.put("Java", 187);
        map.put("Web", 187);
        map.put("chenxixi", 187);

        //2- 泛型的嵌套（目的：为了便利）
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + " -----> " + value);
        }

    }
}
