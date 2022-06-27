package _312after_366before.src.javaTeacher.learn_singleton.Singleton_test;

/*
单例的设计模式：-- 饿汉式
所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象的实例
 */
public class singleTest {
    public static void main(String[] args) {
        //Bank bank = new Bank(); -- 不能直接调用私有的构造器

        Bank bank1 = Bank.getInstance();//Static方法的，可以只要用所属类来调用


    }
}

class Bank {//饿汉式

    //1- 私有化类的构造器
    private Bank() {
    }

    //2- 内部创建类的对象
    //4- 要求此对象也必须声明为静态
    private static Bank instance = new Bank();

    //3- 提供公共的方法，返回类的对象
    public static Bank getInstance() {
        return instance;
    }
}
