package _366After.src.javeTeacher.thread_learn.thread_learn_extend2;

/**
 * 对thread_learn-1  的解决
 * 问题4 -如果要开启两个不同的线程，怎么办
 * 回答：1。什么都写两遍（在下面）
 * 2。可以简单的写（）
 */

//——————————————————————————————————————————————————————————————————
class MyThread1 extends Thread {
    //2- 重写Thread类的run（）方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class MyThread2 extends Thread {
    //2- 重写Thread类的run（）方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}


public class thread_learn_2 {
    public static void main(String[] args) {
        //3- 创建Thread类的子类的对象
        MyThread1 T1 = new MyThread1();
        MyThread2 T2 = new MyThread2();

        //4- 通过此对象调用start（）
        T1.start();

        //4.5 --通过此对象调用start（）
        T2.start();

//方便写法（四合一 ）
        new MyThread2() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();
    }
}
