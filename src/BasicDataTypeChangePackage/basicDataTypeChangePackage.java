package BasicDataTypeChangePackage;

/*
基本数据类型-->包装类
在包装类中，大家都变成了类
 */

public class basicDataTypeChangePackage {
    public static void main(String[] args) {
        basicDataTypeChangePackage b = new basicDataTypeChangePackage();
        b.WrapperTest();
        b.WrapperTest1();
    }
    //1--这个是基本数据类型---->包装类
    //用Integer.valueOf()  来转化
    public void WrapperTest() {
        int number1 = 10; //这个是基本数据类型
        Integer number2 = Integer.valueOf(number1);
        System.out.println(number2.toString());

        Integer number3 = Integer.valueOf("123");
        System.out.println(number3.toString());
    }

    //2--这个是包装类--->基本数据类型
    //用xxx.(int/byte)Value   来转化
    public void WrapperTest1() {
        Integer num1 = Integer.valueOf(12);
        int i = num1.intValue();
        System.out.println(i+1);

    }



}


