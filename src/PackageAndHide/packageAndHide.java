package PackageAndHide;
//封装和隐藏---之一
//set、get
//对分装的理解："属性"的分装
//我们将"类的'属性'"XXX私有化（private），提供公有化（public）
//获取：写一个getXXX方法
//设置：写一个setXXX的方法
//**
//java规定的--权限（从小到大）private,缺省，protected，public
//private-在类部
//缺省--类部，同一个包
//protected--类部，同一个包，不同包的'子类'
//public--类部，同一个包，不同包的'子类'，同一个工程
//***
//不需要返回值的是---set
//需要反回值的是-----get

public class packageAndHide {
    public static void main(String[] args) {

        Animal pat = new Animal();
        pat.name = "花花";
        pat.age = 1;
        pat.setLegs(-1);
        pat.eat();
        pat.show();

        Animal pat2 = new Animal();
        pat2.name = "嘻嘻";
        pat2.age = 1;
        pat2.setLegs(4);
        pat2.show();
        System.out.println(pat2.getLegs());

    }
}

class Animal {
    String name;
    int age;
    //private,使得int legs;不能直接被调，要通过下面的 setLegs方法调
    private int legs;//腿的个数

    //对属性的设置
    public void setLegs(int leg) {
        if (leg >= 0 || leg % 2 == 0) {
            legs = leg;
        } else {
            legs = 0;
        }
    }

    //对属性的获取
    public int getLegs() {
        return legs;
    }


    public void eat() {
        System.out.println("我要吃饭");
    }

    public void show() {
        System.out.println("姓名=" + name + "\t" + "年龄=" + age + "\t" + "腿的个数=" + legs);
    }
}
