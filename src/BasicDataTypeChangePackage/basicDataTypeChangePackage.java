package BasicDataTypeChangePackage;
 /*
 总结：(基本数据类型<-->包装类) <---> String  [三种类型的转化]
 (基本数据类型<-->包装类)--这个直接转
 String --ValueOf和Parse
  */
/*
(基本数据类型<-->包装类) <---> String  [三种类型的转化]
在包装类中，大家都变成了类
 */

public class basicDataTypeChangePackage {
    public static void main(String[] args) {
        basicDataTypeChangePackage b = new basicDataTypeChangePackage();
        b.WrapperTest();
        b.WrapperTest1();
        b.WrapperTestChangeString();
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
    }
        /*
        One--对于-基本数据类型<-->包装类-直接使用就可以
         */
//——————————————————————————————————————————————————————————————————————————————————————————
        /*
       Two --(基本数据类型<-->包装类) <---> String
         */
   public void  WrapperTestChangeString() {
       //基本数据类型-->String
       //方法1  ---> xxx + ""  = String类型
       int a = 10;
       String A = a + "1";
       System.out.println(A);

       //方法2 ---> StringValueOf()
       int b = 10;
       String B = String.valueOf(b);
       System.out.println(B);

       //String--->基本数据类、包装类
       //使用  包装类.parse
       String C ="123";
       Integer c =  Integer.parseInt(C);
       System.out.println(c);
   }





}


