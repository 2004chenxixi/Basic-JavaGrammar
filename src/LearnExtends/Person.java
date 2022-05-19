package LearnExtends;

public class Person {

    String name;
    int age;

    public Person() {
    }

    //如果是封装，要把属性给-private---然后写set，get---写 this.name = name;
    //那为什么--构造体要写一个这个，不写可以吗
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}
