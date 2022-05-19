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
        System.out.println(i + 1);
    }

    public void WrapperTestTotal() {
        //上面的：基本数据类型<-->包装类,太麻烦，jdk给了我们（自动装箱和自动拆箱）
        int I1 = 10;
        Integer ChangeI1 = I1; //*这里的int-I1  可以直接变成  Integer-ChangeI1

        Integer I2 = 32;
        int ChangeI2 = I2;  //*这里的Integer-ChangeI1  可以直接变成  int-I2

        /*
        对于-基本数据类型<-->包装类-直接使用就可以
         */

    }


}


