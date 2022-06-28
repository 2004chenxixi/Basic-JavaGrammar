package _312after_366before.src.javaTeacher.learn_interface_Old.use_interface;

/*
接口的使用:
1- 接口上，体现出了多态
2- 接口，实际上就是定义了一种规范
3- 开发中，体会面向接口编程
 */
public class Use_interface {
    public static void main(String[] args) {
        //解析实现类和对象
        /*
        Computer c = new Computer();
       1-  c是new出来的="对象"
       2-  new Computer();这个Computer="实现类"
       情况：
           1- 如果是匿名对象，非匿名实现类，就不写前面，直接new本身就可以了
           2- 如果是匿名对象，匿名实现类，就不写前面，直接new接口就可以了
           3- 如果是非匿名对象，匿名实现类，前都都写，但是后面new的是接口
           4-如果是非匿名对象，非匿名实现类，前后都写，前面new的一样
         */

        Computer computer = new Computer();
        //1- 创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();//Flash,实现类USB的特性
        computer.transferData(flash);

        //2-  创建了接口的非匿名实现类的匿名对象
        computer.transferData(new Printer());

        //3-创建了接口的匿名实现类的非匿名对象
        //匿名实现类，用接口USB来充当
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("我是--匿名实现类的非匿名对象--开始工作");
            }

            @Override
            public void stop() {
                System.out.println("我是--匿名实现类的非匿名对象--停止");
            }
        };
        computer.transferData(phone);

        //4-创建了接口的匿名实现类的匿名对象
        //都匿名
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("我是--匿名实现类的匿名对象--开始工作");
            }

            @Override
            public void stop() {
                System.out.println("我是--匿名实现类的匿名对象--停止工作");
            }
        });

    }
}

//电脑链接USB
class Computer {
    public void transferData(USB usb) {
        usb.start();
        System.out.println("开始工作----");
        usb.stop();
    }
}

//1-接口
interface USB {
    //定义：长，宽，最大，最小的传输速度

    void start();

    void stop();

}

//2-实现类1
class Flash implements USB {

    @Override
    public void start() {
        System.out.println("USB开始传输");
    }

    @Override
    public void stop() {
        System.out.println("USB停止传输");
    }
}

//3- 实现类2
class Printer implements USB {
    @Override
    public void start() {
        System.out.println("打印机开始传输");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止传输");
    }
}

