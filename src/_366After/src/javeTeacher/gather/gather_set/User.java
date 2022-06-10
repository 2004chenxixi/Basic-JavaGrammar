package _366After.src.javeTeacher.gather.gather_set;

import java.util.Objects;

public class User implements Comparable {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //要String比较所以要进行 --- 重写compareTo方法
    @Override
    public int compareTo(Object o) {
        if (o instanceof User) {
            User user = (User) o;
            int compare = this.name.compareTo(user.name); //对一样名字，再进行一次处理
            //如果名字不一样，不会返回 = 0 ， 所以 = 0的情况就是，名字相同，我们再进行处理
            if (compare != 0) {
                return compare;
            } else {
                return Integer.compare(this.age, user.age); //比较Inerger类型，需要这样的形式
            }
        } else {
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}
