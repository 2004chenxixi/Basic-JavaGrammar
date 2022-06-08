package _366After.src.javeTeacher.enumeration_class.enumeration_class_new;

/*
使用enum枚举类，
定义的枚举类默认继承与-java.lang. enum
如何定义枚举类：   1-使用enum关键字来自定义枚举类
 */
public class Enumeration_class_new {
    public static void main(String[] args) {
        //测试枚举类
        Season1 spring = Season1.SPRING;
        System.out.println(spring);
        System.out.println("查看父类= " + Season1.class.getSuperclass());

        System.out.println("——————————————————————————————————————————————————————-");
        //values();   ---便利枚举类
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println("便利枚举类的内容= " + values[i]);
        }
        System.out.println("——————————————————————————————————————————————————————-");

        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println("当前状态= " + values1[i]);
        }

    }
}

//使用enum (按照顺序--1-4)
enum Season1 {
    //3-提供当前枚举类的对象 ，多个对象用逗号隔开，末尾用封号；
    SPRING("chun", "chun"),
    SUMMER("SUMMER", "SUMMER"),
    AUTUMN("AUTUMN", "AUTUMN"),
    WINTER(" WINTER", " WINTER");


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
