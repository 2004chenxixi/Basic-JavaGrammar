package _366After.src.javeTeacher.commonly_used_class.Commonly_used_class_StringFunc;

import org.testng.annotations.Test;

/*
使用String的Method方法大合集
 */
public class Commonly_used_StringFunc {

    @Test
    public void Test1() {
        String string1 = "HelloString"; //1- 基础款

        System.out.println(string1.length());//2- 长度.length()

        System.out.println(string1.charAt(0));
        System.out.println(string1.charAt(1));//3- 打印对应位置.charAt

        System.out.println(string1.isEmpty());//4- 检测String是否为空.isEmpty()

        //5- 下面这个，不动string1的前提下，（新建一个string2，并且都变成小写了）.toLowerCase
        String string2 = string1.toLowerCase();
        System.out.println("我是上面的，string1=" + string1);
        System.out.println("我是下面toLowerCase后的string2=" + string2);

        //6- 去除首位空格.trim
        String string3 = "   --   Hello  String---   ";
        String string4 = string3.trim();
        System.out.println("我是原来开头，结尾有空格的string3：" + string3);
        System.out.println("我是后来开头，结尾没空格的string4：" + string4);


        //7- *区分大小写来---查看是否相等.equals
        String string5 = "xixi";
        String string6 = "xixi";
        System.out.println("区分大小写来---看看5和6是否相等==  " + string5.equals(string6));


        //8- 不区分大小写来---查看是否相等.equalsIgnoreCase
        String string7 = "XiXi";
        String string8 = "xixi";
        System.out.println("不区分大小写来---看看7和8是否相等==  " + string7.equalsIgnoreCase(string8));

        //9- 拼接字符串.concat
        String string9 = "chen";
        String string10 = "xixi";
        //   string11 等于 9 拼接 10
        String string11 = string9.concat(string10);
        System.out.println("我是9拼接10= " + string11);

        //10- 字符串直接的比大小.compareTo
        String string12 = "abc";
        String string13 = "abe";
        //string12.compareTo(string13) == 等价 == string12 减去 string13   （如果负数，12小，正数12大）
        System.out.println(string12.compareTo(string13));

        //11- 取字符串.substring
        String string14 = "我是一个好人";
        String string15 = string14.substring(4);
        System.out.println("我是原来的字符串 : " + string14);
        System.out.println("我是被取的字符串 ： " + string15);

        //15- 取字符串.substring---[  )
        String string16 = "你们好,我是:左避右开";
        String string17 = string16.substring(7, 11);
        System.out.println("我是原来的字符串 : " + string16);
        System.out.println("我是被取的字符串 ： " + string17);

        //16- 是否以xx结尾的---Boolean类型
        String string18 = "chenxixi";
        boolean b1 = string18.endsWith("xi");
        System.out.println("我是用来判断，是否以什么结尾的： " + b1);

        //17- 是否以xx开头的---Boolean类型
        String string19 = "chenxixi";
        boolean b2 = string19.startsWith("chen");
        System.out.println("我是用来判断，是否以什么来开头的： " + b2);


    }
}
