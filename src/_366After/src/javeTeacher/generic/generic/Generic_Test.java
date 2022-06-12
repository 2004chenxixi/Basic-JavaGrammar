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

        //2- 泛型的嵌套（目的：为了更好的便利）
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + " -----> " + value);
        }

    }
    //——————————————————————————————————————————————————————————————————————————————————————————————————
    /*
    对下面的Contribution：
             下面是--"泛型"在比较器中的具体使用：
                 一、 test4、test5  ---  是"泛型"在List集合中的使用
                      注意点：1-List集合下使用CompareTo，要在.sort（）的情况下,才会去使用(类重写CompareTo的方法)
                            2- List集合在使用new Comparator()的时候，要在 .sort内部new --->  .sort(XX,new Comparator)，然后重写compare方法
                                eg： Collections.sort(users, new Comparator<User_two>() {

                 二、test6、test7 ---是"泛型"在TreeSet集合中的使用
                       注意到：1-TreeSet集合下(不需要)使用.sort（）的情况下,就会自己去使用(类重写CompareTo的方法)
                              2-TreeSet集合在使用new Comparator()的时候，直接在TreeSet集合开头(XX,new Comparator)，然后重写compare方法，即可
                                 eg： TreeSet<XXX> set = new TreeSet<XXX>(new Comparator<XXX>()
     */


    //1-（List）泛型在 --- CompareTO中的体现（自然类）
      /*
---> 因为我不是TreeSet，和TreeMap所以，要想调用CompareTO中的方法时候，要使用Collections.sort();才可以实现CompareTO方法
    */
    @Test
    public void test4() {
        ArrayList<User_two> users = new ArrayList<>();

        users.add(new User_two("张三", 54));
        users.add(new User_two("王五", 14));
        users.add(new User_two("李四", 65));
        users.add(new User_two("赵四", 78));

        //这个才是--使用CompareTO的关键，要先把它排序一下，才会调用CompareTO方法
        //如果单纯是"使用便利"，只是单纯的便利
        Collections.sort(users);

        //这个操作 --只是（很单纯的便利）
        Iterator<User_two> iterator = users.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    //2- （List）泛型在 --- Comparator中的体现（自定义类）
    /*
---> 因为我不是TreeSet，和TreeMap所以，要想调用Comparable(自定义方法)的时候，要使用Collections.sort(XXX,new comparator);才可以实现(自定义)方法
如果是TreeSet和TreeMap，就可以直接 -->TreeSet<User_two> users = new TreeSet<User_two>(new Comparator);,然后重写方法
*/
    @Test
    public void test5() {
        ArrayList<User_two> users = new ArrayList<User_two>();

        users.add(new User_two("赵四", 78));
        users.add(new User_two("张三", 54));
        users.add(new User_two("王五", 14));
        users.add(new User_two("李四", 65));


        //这个才是--使用Comparator的关键，在排序的地方重写new Comparator
        //如果单纯是"使用便利"，只是单纯的便利
        Collections.sort(users, new Comparator<User_two>() {
            @Override
            public int compare(User_two o1, User_two o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //这个操作 --只是（很单纯的便利）
        Iterator<User_two> iterator = users.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    //3- （TreeSet）"泛型"的使用（自然类）
    /*
     这个使用TreeSet方法，他和list的不同，不用写Collections.sort(set)方法，可以直接调类中的CompareTO（自然类）
     */
    @Test
    public void test6() {
        TreeSet<User_two> set = new TreeSet<User_two>();

        set.add(new User_two("赵四吧", 78));
        set.add(new User_two("张三吧", 54));
        set.add(new User_two("王五吧", 14));
        set.add(new User_two("李四吧", 65));


        /*
        使用 TreeSet ，就不需要写" Collections.sort(set) "，他会直接调类中的CompareTO方法
         */

        //这个操作 --只是（很单纯的便利）
        Iterator<User_two> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    //4- （TreeSet）"泛型"的使用（自定义类）
    /*
   2- 这个使用TreeSet方法，他和list的不同，不用在Collections.sort(set，new Comparator) ---（自定义类）
   而是直接在（集合开头的时候）：TreeSet<User_two> set = new TreeSet<User_two>(new Comparator<User_two>()
    */
    @Test
    public void test7() {
        TreeSet<User_two> set = new TreeSet<User_two>(new Comparator<User_two>() {
            @Override
            public int compare(User_two o1, User_two o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        set.add(new User_two("D", 78));
        set.add(new User_two("Z", 54));
        set.add(new User_two("B", 14));
        set.add(new User_two("A", 65));


        /*
        使用 TreeSet ，就不需要写" Collections.sort(set) "，他会直接调类中的CompareTO方法
         */

        //这个操作 --只是（很单纯的便利）
        Iterator<User_two> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}

