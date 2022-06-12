package _366After.src.javeTeacher.generic.generic;

public class User_two implements Comparable<User_two> {
    private String name;
    private Integer age;

    public User_two() {
    }

    public User_two(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    //1- 这个是用了泛型的CompareTO
    public int compareTo(User_two o) {
        return this.age.compareTo(o.age);
    }

    //这个是没用泛型以前 --要判断（非常麻烦）
    /*
     public int compareTo(Object o) {
       if(o instanceof  User){
          User u = (User)o
          return this.name.compareTo(u.name);
       }
        throw new Run···("输入的类型有误")
    }
     */
}
