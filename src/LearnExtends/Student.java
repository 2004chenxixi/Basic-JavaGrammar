package LearnExtends;

public class Student  extends Person {

//    String name;
//    int age;
    String major;

    public Student() {
    }

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

//    public void eat() {
//        System.out.println("吃饭");
//    }
//
//    public void sleep() {
//        System.out.println("睡觉");
//    }

    public void seeView() {
        System.out.println("看风景");
    }
}
