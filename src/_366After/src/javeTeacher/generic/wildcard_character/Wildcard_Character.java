package _366After.src.javeTeacher.generic.wildcard_character;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*通配符
     对"通配符"的介绍
         1-基本数据类型\数组 都满足 Object（主） --> byte、short、int、long、float、double
         2- 可是在-集合-中不满足这样的关系<String> = <String> ≠ <Object>
         所以出现了通配符，在-集合-中"通配符"，相当于基本数据类型的Object
         通配符<?>

 */
public class Wildcard_Character {
    @Test
    public void test1() {
        //1- 先对（1-基本数据类型\数组 都满足 Object（主） --> byte、short、int、long、float、double）做解释
        //1- 赋值
        int a = 213;
        String b = "XXX";
        float c = 43.4f;
        //2- 用Object来接收 ---Object都可以接收
        Object all = a;
        Object all1 = b;
        Object all2 = c;

//2- 对（可是在-集合-中不满足这样的关系<String> = <String> ≠ <Object> ）的解释

        //1- 对（<String> ≠ <Object>）解释
        List<Object> list = null;
        List<String> list2 = null;
        // list = list2  不可用 =

        //2- 对（<String> = <String> ）的解释
        List<String> list3 = null;
        List<String> list4 = null;
        // list3 = list4; 可以用 =

//3- 对"通配符"的使用
        List<Object> list5 = null;
        List<String> list6 = null;

        //使用<?> 接收 List<Object>、List<String>
        List<?> list7 = null;
        list7 = list5;
        list7 = list6;

        //便利"通配符"
        Iterator<?> iterator = list7.iterator();
        while (iterator.hasNext()) {
            //便利的使用-用Object来接收<?>,不管怎么样，<?>接收的类型，肯定属性Object
            Object obj = iterator.hasNext();
            System.out.println(obj);
        }
    }

    //  "通配符"的细节
    @Test
    public void test2() {
        //1- 创建集合
        ArrayList<Object> list = new ArrayList<>();

        //2- 给集合赋值
        list.add(123);
        list.add(1654);
        list.add(876);

        //3- 创建"通配赋"
        List<?> wildcard_characters = null;

        //4- 把list集合赋值给"通配符"
        wildcard_characters = list;

        //*5- 我想给wildcard_characters"通配符"添加数据 ---> (不行)
        //不能给"通配符"直接添加数据，只能通过"集合"给他赋值
        //wildcard_characters.add("XX");
        //wildcard_characters.add("?");

        //*6- 我想读取，"集合"赋值给"通配赋"的值 --->（可以）
        Object o = wildcard_characters.get(0);
        System.out.println("我读取，\"集合\"赋给\"通配赋\"的值=  " + o);


    }
}
