package _366After.src.javeTeacher.commonly_used_class.Commonly_used_class_StringFunc;

import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
使用String的Method方法大合集
 */
public class Commonly_used_StringFunc {

    @Test
    public void Test1() throws UnsupportedEncodingException {
        //-----------------------------------------String

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

        //18- 是否以（xxx自定义）开头的---Boolean类型
        String string20 = "chenxixi";
        //string20，下标为2的元素，是否为en开头
        boolean b3 = string20.startsWith("en", 2);
        System.out.println("我是用来判断，(自定义的开头)是否存在，这个值： " + b3);

        //19- 判断21是否包含22
        String string21 = "chenxixoo";
        String string22 = "x";
        boolean b4 = string21.contains(string22);
        System.out.println("我是用来判断，21 是否包含 22： " + b4);

        //¥¥对应理解--&&对应理解（对20，21的理解）
        /*
        ¥1  ： 就是从头开始，去找X，第一次遇到X，就给出--它的索引
        ¥2  ： 就是从头开始，去找X，最后一个遇到的X，才给出他的索引

        &1 ： 定义一个开头，继续从(定的那个头开始，左-->右)开始寻找   ，但是给出的结果都是，从最初的0开始算起来的
        &2 ： 定义一个开头，继续从(定的那个头开始，右-->左)开始寻找   ，但是给出的结果都是，从最初的0开始算起来的

         */

        //20- 寻找，并给出索引位置, 如果返回-1，就是不存在.indexOf(String str)¥1
        System.out.println("我是--寻找，(开头开始 -- 第一次就找到x的索引位置): " + string21.indexOf("i"));
        //21- 寻找，(自定义开始位置，继续往后找)索引位置, 如果返回-1，就是不存在.indexOf(String str ，int formIndex)&1
        System.out.println("我是--寻找，从头到尾的方向-  (自定义开始位置，继续往后找)索引位置: " + string21.indexOf("o", 6));


        //22- 寻找，并给出索引位置, 如果返回-1，就是不存在.indexOf(String str)¥2
        System.out.println("我是--寻找，(开头开始 -- 得出最后那个x的索引位置): " + string21.lastIndexOf("o"));
        //定义一个，从右往做找  &2
        System.out.println("我是--寻找，从头到尾的方向-  (自定义开始位置，继续往后前)索引位置: " + string21.lastIndexOf("x", 7));


        //23- 替换字符串
        String string23 = "我真的是无语，没这么无语过";
        String string24 = string23.replace('无', '有');
        System.out.println("我是没被改这前的字符串： " + string23);
        System.out.println("我是--被改后的字符串： " + string24);

        String string25 = string23.replace("无语", "有语音哦");
        System.out.println("我是--被改后的字符串： " + string25);

        //24-替换/切割（需要时候，查百度）
        /*
        还有的替换
        .replaceFirst
        .replaceAll
        .matches
        .split //很有用
        .根据什么开头...
         */

        //25- String   < --- > 包装类，基本数据类型
        String str1 = "123";
        int number = 456;
        int i = Integer.parseInt(str1);     //String --> int
        Integer I = Integer.parseInt(str1); //String --> Integer
        String s = String.valueOf(number);  //int --> String

        //26- String -- > char[]   (便利String的每个元素).toCharArray()
        String str2 = "532nsfdsfsa";
        char[] c = str2.toCharArray();
        for (int j = 0; j < str2.length(); j++) {
            System.out.println("我是String -- > char[]  ： " + c[j]);
        }

        //26.5- char[] --> String
        char[] chars = new char[]{'c', 'h', 'e', 'n'};
        String s1 = new String(chars);
        System.out.println("我是char[] --> String  ： " + s1);

/*
编码：看的懂 --> 变成看不懂
解码：看不懂 --> 看的懂
说明：你的  编码的字符集  和  解码集的字符集  ， 必须一样（可以定义字符集）
 */
        //27- String -- > byte[]  (出来的是，字符码) ======编码
        String str3 = "534jkjdak";
        byte[] b = str3.getBytes();
        System.out.println("我是String -- > byte[]  ： " + b);

        //27.5  byte[] --> String  ========解码
        String s2 = new String(b);
        System.out.println("我是 byte[] --> String ： " + s2);

        //27.6  new String(A, "XXX");   -->  这里的A为你需要转变的 byte[]， XXX为你需要的-字符集（utf-8，gbk，...）
        String gbk = new String(b, "gbk");
        System.out.println("我是被安排的编码级 ： " + gbk);


//---------------------------------------------------------------------------------------------

        //-----------------------------------------数组

        //28-  --- 对数组进行排序--升序 (冒泡).Arrays.sort
        int[] number1 = new int[]{21, 234, 4324, 54, 5, 654, -65, 5, -99};
        Arrays.sort(number1);
        //细节，输出要用Arrays.toString()， 不然出现是：地址值
        System.out.println("我是被 Arrays.sort 后的数组 -- ： " + Arrays.toString(number1));

        //28.5 ----  排序-- 降序1（用包装类+Collections.reverseOrder()）
        Integer[] a = {1, 2, 3, 4, 5};
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("我是已经被降序的=  " + Arrays.toString(a));

        //28.6   ---  排序-- 降序2(comparator接口的方法) ----X(不是很推荐)
        // a数组降序排列应为： 5 4 4 3 3 2 2 1 1
        Integer[] a5 = {1, 2, 3, 4, 5, 4, 3, 2, 1};

        Arrays.sort(a5, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("我是用comparator接口来实现的倒序= " + Arrays.toString(a5));


        //28.7   ---  排序-- 降序3 (实现接口之 lambda)  -----(推荐)
        Integer[] a6 = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        Arrays.sort(a6, (e1, e2) -> e2 - e1);
        System.out.println("我是用-lambda接口-来实现的倒序= " + Arrays.toString(a6));


        //29- 填充整个数组或部分数组-fill
        int[] list = {1, 2, 3, 4, 5, 54, 65, 76};
        //这里  Arrays.fill(list, 4);
        // 解释： 一、list你自己要改变的数组名字       二、4 是val，list里面所有的内容换成 -- > val
        Arrays.fill(list, 4);
        System.out.println(Arrays.toString(list));
        // [fromindex , toindex)
        //解释：这里的fromindex是确定开头的索引，toindex是结尾索引，这个期间的，全部替换成val
        Arrays.fill(list, 1, 5, 2);
        System.out.println(Arrays.toString(list));


        //30- 比较两个数组内容是否相等  Arrays.equals
        int[] a1 = {1, 2, 3};
        int[] e = {1, 2, 3};
        boolean isSame = Arrays.equals(a1, e); //true

        //31- 拷贝数组
        //1- 无脑拷贝
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[5]; //--- > 这里的自定义长度会被改变
        arr2 = Arrays.copyOf(arr1, 10);
        System.out.println("拷贝后的arr2的长度= " + arr2.length);
        System.out.println("拷贝后的arr2的内容= " + Arrays.toString(arr2));

        //2- 选择性拷贝
        // from 表示开始位置， to 表示结束位置
        // 复制下标为 ：[from, to)
        // Arrays.copyOfRange( int[] original, int from, int to)


    }
}
