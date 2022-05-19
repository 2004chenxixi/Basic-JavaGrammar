package learnArray;

//学习封装和打印矩形
public class oriented {
    public static void main(String[] args) {
        Person p1 = new Person();
        //调用属性
        p1.name = "陈稀饭";
        p1.age = 18;
        p1.high = 178;
        p1.weigh = 150;
        System.out.println(p1.name + p1.age + p1.high + p1.weigh);
        //调用方法
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");

        rectangle r1 = new rectangle();
        r1.rectangle();
        r1.area();

        r1.method(12, 10);
    }
}

//属性
class Person {
    String name;
    int age;
    int high;
    int weigh;

    //方法
    public void eat() {
        System.out.println("可以吃饭");
    }

    public void sleep() {
        System.out.println("可以睡觉");
    }

    public void talk(String language) {
        System.out.println("可以说话" + "说的是" + language);
    }

}

class rectangle {
    int high = 10;
    int weigh = 8;


    public void rectangle() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
    }

    public double area() {
        double area = high * weigh;
        System.out.println("这个矩形的面积为=" + area);
        return area;
    }

    public double method(double m, double n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
        System.out.println(m * n);
        return m * n;
    }
}



