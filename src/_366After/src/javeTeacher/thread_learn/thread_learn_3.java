package _366After.src.javeTeacher.thread_learn;

/**
 * 测试Thread中常用的方法：
 * 1。start：启动当前线程：调用当前线程的run（）
 * 2。run（）：通常需要重写Thread类中的此方法：将创建的线程都要执行的操作声明在此方法中
 * 3。currentThread（）：静态方法，返回执行当前代码的线程
 * 4。getName（）：获取当前线程的名字
 * 5。setName（）：设置当前线程的名字-->小线程用new的调，主线程用Thread(自带的)调
 * 6。yield（）：主动放弃当前线程，给别的线程 ---->用法：Thread.yield();
 */
//1- 创建一个继承于Thread（自带的）类的子类
class MyThread extends Thread {
    //2- 重写Thread类的run（）方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
            if (i % 30 != 0) {
                //这里使用yield，
                Thread.yield();
            }
        }
    }
}


public class thread_learn_3 {
    public static void main(String[] args) {
        //3- 创建Thread类的子类的对象
        MyThread T1 = new MyThread();

        //*附加——给（小）线程起名字
        T1.setName("我是一个小线程");

        //4- 通过此对象调用start（）
        T1.start();

        //**附加：给主线程起名字
        Thread.currentThread().setName("我是主线程");

        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }


    }
}
