package _366After.src.javeTeacher.DateTime.date_time;

import org.testng.annotations.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

//jdk8新版本的Date
public class Date_Time_Test_new8 {
    @Test
    public void testDate() {
        //1- 有偏移量(不推荐X) -----X(直接跳过这个垃圾方法)
        Date date = new Date(2022 - 1900, 6 - 1, 6);//2022-6-6
        System.out.println(date);
    }

    /*
    2- lockDate、LocalTime、LocalDateTime
     */
    @Test
    public void test() {

        //now()；获取当前日期、时间、日期+时间
        LocalDate localDate = LocalDate.now(); //获取-年月日
        LocalTime localTime = LocalTime.now(); //获取-时分秒
        LocalDateTime localDateTime = LocalDateTime.now();//获取--年月日时分秒

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //of();  设置--年月日时分秒（没有偏移量）
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 6, 6, 10, 10, 10);
        System.out.println(localDateTime1);

        //getXXX  获取对应信息
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());

        //withXXX（修改对应信息）   (原来的不变，新建一个) --> 不可变性
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate1);

        //plus 增加多少 --> 不可变性
        LocalDateTime localDateTime2 = localDateTime.plusMonths(3);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        System.out.println("__________________________");

        //minus 减少  --> 不可变性
        LocalDateTime localDateTime3 = localDateTime.minusMonths(3);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);
    }

    /*
    3- instant (获取时区的)
     */
    @Test
    public void test1() {
        //Instant.now();获取本初子午线的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);

        //自己设置时区的时间（中国--东8区）
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));//东8区
        System.out.println(offsetDateTime);


        //下面的*和*对应

        //*获取1970/1/1/0/0/0  -- 开始的毫秒数
        long milli = instant.toEpochMilli();
        System.out.println(milli);

        //*通过给定的毫秒数，获取Instant的实例
        Instant instant1 = Instant.ofEpochMilli(1654505787982L);
        System.out.println(instant1);
    }

    /*
    4- DateTimeFarmatter：格式化 OR 解析--日期、时间
     */
    @Test
    public void test3() {
        //1- 自定义--格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

        //格式化 -- Date --> String
        String str = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(str);

        //解析 String --> Date(再将Date --> java.sql.Date方便存入数据库)
        TemporalAccessor parse = dateTimeFormatter.parse("2022-06-06 05:16:14");
        System.out.println(parse);
    }

}
