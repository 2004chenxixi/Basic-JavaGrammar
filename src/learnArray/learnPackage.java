package learnArray;

//学习封装
class learnPackage {
    public static void main(String[] args) {
        //小分装，引用了外部的testPublic的方法
        //用法
        //"细节"----想调用什么的，就把什么new一下
        //testPublic + p1 = new testPublic();
        //这里的p1，自定义，用来调用
        learnPackageTest p1 = new learnPackageTest();
        p1.name = "陈稀饭";
        p1.age = 18;
        //输入性别的时候1-男性，2-女性
        p1.sex = 1;
        System.out.println(p1.name + "\t" + p1.age + "\t" + p1.sex + "\t");
        p1.study();
        p1.showAge();
        p1.addAge(8);

    }
}
 class learnPackageTest {
    String name;
    int age;
    int sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println("你的年龄为=" + age);
    }

    public int addAge(int i) {
        age += i;
        System.out.println(age);
        return age;
    }
}

