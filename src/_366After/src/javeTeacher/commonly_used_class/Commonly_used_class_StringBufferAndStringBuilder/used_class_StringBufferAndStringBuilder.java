package _366After.src.javeTeacher.commonly_used_class.Commonly_used_class_StringBufferAndStringBuilder;

import org.testng.annotations.Test;

/*
关于StringBuffer和StringBuilder的使用
 */
public class used_class_StringBufferAndStringBuilder {
    /*
        问题1-  关于String/StringBuffer/StringBuilder的异同

    String：不可变的字符序列
    StringBuffer：可变的字符序列--线程安全，效率低，底层使用char[]存储 --（底层长度16）
    StringBuilder：可变的字符序列--线程不安全，效率高，底层使用char[]存储
     */
    //————————————————————————————————————————————————————————————————————————————————————

    //--------------------------StringBuffer的常用方法------------------------------------
    /*
    总结：
    增:append(XX)
    删:delete[start,end)
    改:setCharAt(int n, char ch) / replace(int start,int end ,String str)
    查:charAt(int n)
    插入:insert(int offset,xxx)
    长度:length();
    便利:toString/for()+charAt()
     */
    @Test
    public void StringBufferFunc() {
        //1- 添加.append
        StringBuffer s1 = new StringBuffer("abcd");
        s1.append(1);
        s1.append('a');
        System.out.println("我是 使用append添加的 = " + s1);

        //2- 删除(这里我还是调是s1来查看，确认了，StringBuffer的底层-是可以改变的).delete
        //如果是String，再调用s1，还是原本的值--因为String底层不会改变，只会新造一个
        s1.delete(2, 3);  //[start,end)
        System.out.println("我是 使用delete的 = " + s1);

        //3- 替换.replace
        s1.replace(2, 3, "我被替换");
        System.out.println("我是被替换的的 = " + s1);

        //4- 插入数据 （比如：我插入第2个位置，那第2个位置-原本的位置就变成第3个位置）.insert
        s1.insert(2, false);
        System.out.println("我是被插入的的 = " + s1);

        //5- 反转.reverse()
        s1.reverse();
        System.out.println("我是被反转的的 = " + s1);

        //6- indexOf（和Stirng一样，找索引）

        //7- .substring(找规定索引地方--的值) 需要返回值

        //8-String  -- StringBuffer/StringBuilder  --相互转化
        /*
        String --> StringBuffer/StringBuilder = 调用StringBuffer/StringBuilder的构造器
        StringBuffer/StringBuilder -- String = 1-调用String的构造器/2-调用toString方法
         */

    }


}
