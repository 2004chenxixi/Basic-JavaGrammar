package _366After.src.javeTeacher.DateTime.date_time;

import org.testng.annotations.Test;

import java.util.Date;

//获取时间
//java.util.Date
//---java.sql.Date
public class Date_Time_Test {
    @Test
    public void test() {
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

}
