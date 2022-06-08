package _366After.src.javeTeacher.enumeration_class.enumeration_class_new;

/*
枚举类
1- 枚举类的理解：类的对象，有限/确定

2- 常量（不可变的量）----> 建议枚举类

3-使用enum枚举类，
  定义的枚举类默认继承与-java.lang. enum

4- 如何定义枚举类：   1-使用enum关键字来自定义枚举类

5- enum常用方法：1- values -需要便利
               2- valueOf  -（来坚定也没有XX这个东西）
               3- toString

6-调用接口
     1-让枚举类--继承接口
     2-在枚举类的对象的地方，重写接口方法

*7-枚举类在实际中使用
比如：当状态只要有两种状态---就用Boolen值   --> if(true)\false
比如：当状态有三种或者三种以上的状态，我们就使用枚举类
 -->   switch(枚举类){
               case 枚举类对象；
                   XXXXX
               case 枚举类对象；
                   XXXXX
              case 枚举类对象；
                   XXXXX

 }



 */
public class Enumeration_class_new {
    public static void main(String[] args) {
        //测试枚举类
        Season1 spring = Season1.SPRING;
        System.out.println(spring);
        System.out.println("查看父类= " + Season1.class.getSuperclass());

        System.out.println("——————————————————————————————————————————————————————-");

        //values();   ---便利枚举类的内容
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println("values();便利枚举类的内容= " + values[i]);
        }
        System.out.println("——————————————————————————————————————————————————————-");

        //values();   ---便利枚举类的状态
        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println("values();当前状态= " + values1[i]);
        }

        //valueOf（String  objName）：返回枚举类中对象名是obj的对象
        //如果没有objName的枚举类对象，抛出异常：.IllegalArgumentException
        Season1 summer = Season1.valueOf("SUMMER");
        //Season1 summer1 = Season1.valueOf("SUMMER1");---错误的演示
        System.out.println("valueOf,查找： " + summer);
        // System.out.println("valueOf,查找： " + summer1);---错误的演示

        System.out.println("-________________________________________________");

        //测试接口
        spring.show();


    }
}

//接口
interface Info {
    void show();
}

//使用enum (按照顺序--1-4)
enum Season1 implements Info {
    //3-提供当前枚举类的对象 ，多个对象用逗号隔开，末尾用封号；
    SPRING("chun", "chun") {
        @Override
        public void show() {
            System.out.println("xixiixi");
        }
    },

    SUMMER("SUMMER", "SUMMER") {
        @Override
        public void show() {
            System.out.println("hahhahah");
        }
    },
    AUTUMN("AUTUMN", "AUTUMN") {
        @Override
        public void show() {
            System.out.println("wuuwuwuwuw");
        }
    },
    WINTER(" WINTER", " WINTER") {
        @Override
        public void show() {
            System.out.println("yuyuyuuyu");
        }
    };


    //1-声明Season对象的属性：private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //2-私有化--构造器
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4- 获取枚举类对象的属性
    public String getSeason1Name() {
        return seasonName;
    }

    public String getSeason1Desc() {
        return seasonDesc;
    }
}
