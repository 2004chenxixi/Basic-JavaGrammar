package _366After.src.javeTeacher.enumeration_class.enumeration_class_old;

/*
枚举类
1- 枚举类的理解：类的对象，有限/确定
2- 常量（不可变的量）----> 建议枚举类


如何定义枚举类：   1-使用enum关键字来自定义枚举类

 */
public class Enumeration_class {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
    }
}

//自定义枚举类
class Season {
    //1-声明Season对象的属性：private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //2-私有化--构造器
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3-提供当前枚举类的多个对象
    public static final Season SPRING = new Season("chun", "chun");
    public static final Season SUMMER = new Season("SUMMER", "SUMMER");
    public static final Season AUTUMN = new Season("AUTUMN", "AUTUMN");
    public static final Season WINTER = new Season(" WINTER", " WINTER");

    //4- 获取枚举类对象的属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //5-toString

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
