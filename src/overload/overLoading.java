//方法重载
package overload;

public class overLoading {

    public static void main(String[] args) {
        overLoading load = new overLoading();
        load.mOL(1);
        load.mOL(1, 2);
        load.mOL("xiix");

        load.Max(21, 23);
        load.Max(21.3, 23);
        load.Max(21, 23, 43);
    }

    //三个重载方法
    public void mOL(int a) {
        System.out.println(a);
    }

    public void mOL(int a, int b) {
        System.out.println(a + b);
    }

    public void mOL(String c) {
        System.out.println(c);
    }

    //三个重载方法
    public void Max(int a, int b) {
        if (a > b) {
            System.out.println("最大值是" + a);
        } else {
            System.out.println("最大值是" + b);
        }
    }

    public void Max(double c, double d) {
        if (c > d) {
            System.out.println("最大值是" + c);
        } else {
            System.out.println("最大值是" + d);
        }
    }

    public void Max(double a, double b, double c) {
        if (a > b && a > c) {
            System.out.println("最大值是" + a);
        } else if (b > a && b > c) {
            System.out.println("最大值是" + b);
        } else {
            System.out.println("最大值是" + c);
        }
    }


}

//(int ... i)这个地方就是可变个数的"行参"，可以传入很多个[0个-无数个]
//可变个数的"行参"--->VariableNumberParameter
class VariableNumberParameter {
    public static void main(String[] args) {
        VariableNumberParameter variableNumberParameter = new VariableNumberParameter();
        variableNumberParameter.show("dsa", "dsa ");
        variableNumberParameter.IntShow(new int[]{1, 11, 1, 1, 1});
    }

    //这里的int... i也可以接收很多数字，所以他和数组重复，一起存在时候会报错
    //int... i ( !----> ) int []i
    //但是相对数组而言,...会更方便，因为使用数组要new一下
    public void show(String... i) {
        System.out.println("int ... i");
    }

    public void IntShow(int[] i) {
        System.out.println("dada");
    }
}

//行参和实参数的定义
class parameter {
    public static void main(String[] args) {
        //行参：方法定于时，声明小括号内的参数
        //public void show(String... i) {----->这里括号内的，就是"行参"

        //实参： 方法调用时候，实际传递给行参的值
        //variableNumberParameter.show("dsa","dsa ");----->这里给方法赋"给方法的行参就是-实参"

        //***值传递
        //1。如果参数是"基本数据类型"，此时-'实参'赋给'行参'的是'实参真实存在的数据值'
        //2。如果参数是"引用数据类型"，此时-'实参'赋给'行参'的是'实参存数组的地址值'
        //这里的"引用数据类型"----就是，可以被new的，new出来的就是"引用数据类型"
    }
}

class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        //调
        Test test = new Test();
        test.method(a, b);//需要在调出method后，打印出a=100，b=200，写出method的代码
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    public void method(int a ,int b) {
        int a1 = 100;
        int b1 = 200;
    }
}


