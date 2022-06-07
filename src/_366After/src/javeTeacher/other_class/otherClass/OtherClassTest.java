package _366After.src.javeTeacher.other_class.otherClass;

import org.testng.annotations.Test;

/*
System
Math
BigInteger、BigDecimal
 */
public class OtherClassTest {
    @Test
    public void SystemClassTest() {
//第一部分 -System
        String javaVersion = System.getProperty("java.version");
        System.out.println("java的版本 --> " + javaVersion);

        String javaHome = System.getProperty("java.home");
        System.out.println("java的Home文件路径 --> " + javaHome);

        String osName = System.getProperty("os.name");
        System.out.println("java的os.name的系统名称 --> " + osName);

        String osVersion = System.getProperty("os.version");
        System.out.println("java的os.version系统版本 --> " + osVersion);

        String uerName = System.getProperty("user.name");
        System.out.println("java的user.name系统用户名 --> " + uerName);

        String uerHome = System.getProperty("user.home");
        System.out.println("java的user.home当前用户名的路径 --> " + uerHome);

        String uerDir = System.getProperty("user.dir");
        System.out.println("java的user.dir当前工程 --> " + uerDir);
    }
//————————————————————————————————————————————————————————————————————————————————————
//————————————————————————————————————————————————————————————————————————————————————

    /*
第二部分、
    对数学相关的去Math这个类找
    绝对值
    三角函数
    平方根
    自然对数
    e为底的指数
    最大值/最小值
    弧度 --> 角度
    角度 --> 弧度
    and so  on（Math的api）
     */

//————————————————————————————————————————————————————————————————————————————————————
//————————————————————————————————————————————————————————————————————————————————————

//第三部分、BigInteger、BigDecimal
// 注意：调用构造器---new 构造器
    //Biginteger是最大的 -- 可以表示不可变的任意精度的"整数"
    //BigInteger的构造器 --->  BigInteger(String  val);
    //加减乘除具体看Api
//-------------------------------------------------------
    //BigDecimal最大的 --  可以表示不可变的任意精度的"小数"
    //BigDecimal的构造器 --->  BigDecimal(double val)\BigDecimal(String val)
    // //加减乘除具体看Api

}
