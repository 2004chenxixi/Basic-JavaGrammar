package _366After.src.javeTeacher.reflect.reflectionTest;

/*
给--reflection--来演示"大鱼吃小鱼"
 */
public class Person {
    private String name;
    private String sex;
    private Integer age;

    public Person() {
    }

    public Person(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String show(String nation) {
        System.out.println("我的国籍是： " + nation);
        return nation;
    }

    public String eat() {
        return "吃饭";
    }

    //测试静态方法
    public static void showDesc() {
        System.out.println("我是一个可爱的人---测试静态方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

}
