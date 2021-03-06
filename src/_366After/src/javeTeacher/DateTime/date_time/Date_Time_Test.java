package _366After.src.javeTeacher.DateTime.date_time;

import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//jdk8之前日期时间的API测试
public class Date_Time_Test {
    @Test

    public void test() throws ParseException {
   /*
   大纲：获取时间
      java.util.Date
          ---java.sql.Date
    */
        //构造器一、Date（）当前时间的Date
        Date date1 = new Date();
        System.out.println(date1.toString());//年月日
        System.out.println(date1.getTime());//时间戳

        //构造器二、设置时间
        //输入时间戳，显示出-时间戳对应的时间
        Date date2 = new Date(1654152510975L);
        System.out.println(date2.toString());//年月日

        //创建java.sql.Date的对象
        java.sql.Date date3 = new java.sql.Date(34872374827L);
        System.out.println("我是java.sql.Date date3： " + date3);//年月日

        //情况 - 如何将 （父）的Date  ---> 数据库中(子)的Date
        Date date5 = new Date(); //父
        java.sql.Date date6 = new java.sql.Date(date5.getTime()); // 父(的date5.getTime()的时间戳) --> 子(的时间)
    }

//————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
//————————————————————————————————————————————————————————————————————————————————————————————————————————————————————

    /*
    大纲：
    使用SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式和解析
    1-两个操作
      -格式化：              日期  ---> 字符串
      -解析：格式化的逆过程：  字符串 ---> 日期

    2-SimpleDateFormat的实例化
----------------------------------------------------------         --------------------------------------------------
     */
    public void testSimpleDateFormat() throws ParseException {
//1-实例化:使用固定的SimpleDateFormat方法
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
//2--格式化： 日期  ---> 字符串
        Date date = new Date();
        System.out.println("没改变之前：" + date);
        String format = simpleDateFormat.format(date);
        System.out.println(".format后的： " + format);
//3--解析：格式化的逆过程：  字符串 ---> 日期
        String str = "2022/6/6 下午2:23";
        Date d = simpleDateFormat.parse(str);
        System.out.println("解析：格式化的逆过程: " + d);


        //***************按照指定的方式格式和解析：调整带参的构造器********************


//1-实例化:使用(自己规定)的SimpleDateFormat方法
        //pattern-还有很多格式，可以去Javd的api找
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//2--格式化： 日期  ---> 字符串
        String format1 = simpleDateFormat1.format(date);
        System.out.println("使用(自己规定)的SimpleDateFormat方法--格式化:  " + format1);
//3--解析：格式化的逆过程：  字符串 ---> 日期
        Date d2 = simpleDateFormat1.parse("2022-06-06 02:37:18");
        System.out.println("使用(自己规定)的SimpleDateFormat方法--解析:  " + d2);

    }

    //练习1--：字符串："2020-09-08"  转化为  java.sql.Date(方便存入数据库)
    @Test
    public void TestExer() throws ParseException {
        String birth = "2020-01-02";
        //解析
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        //将String --> Date
        Date date = simpleDateFormat1.parse(birth);
        //将Date --> java.sql.Date
        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println("String -> java.sql.Date = " + birthDate);
    }
    //练习2--：三天打鱼，两天晒网
    //1- 总天数
    //2- 总天数 % 5 == 1，2，3
    //   总天数 % 5 == 4，0
    //总：用秒算
    //（date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24)+1


    // ——————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
    // ——————————————————————————————————————————————————————————————————————————————————————————————————————————————————————

    /*
    大纲：
       Calendar--（抽象类）日历类的使用
     */
    @Test
    public void TestCalendar() {
        //1-实例化
        //调用-静态方法getInstance()
        Calendar calendar = Calendar.getInstance();

        //2-常用方法  --get/set/add/getTime/setTime

        //get--获取今天是多少天
        int days = calendar.get(calendar.DAY_OF_MONTH);//这一周的第几天
        System.out.println(days);

        //set --自己设置第几天
        calendar.set(calendar.DAY_OF_MONTH, 22);
        int day = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(day);

        //add（加天数/减天数）
        calendar.add(calendar.DAY_OF_MONTH, -3);//加天数(3)/减天数(-3)
        day = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(day);

        //getTime(日历类 ---> Date)
        Date date = calendar.getTime();
        System.out.println(date);

        //setTime(Date --> 日历类)
        Date date1 = new Date();
        calendar.setTime(date1);
        day = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(day);


    }
}

