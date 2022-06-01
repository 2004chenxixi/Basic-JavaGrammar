package _366After.src.javeTeacher.thread_learn.thread_learn_extend;

//尚硅谷418----线程（thread）
/*
多线程的创建：方式一：继承于thread类
1- 创建一个继承于Thread类的子类
2- 重写Thread类的run（）方法 -->这里写主要的操作（我这边写的是--便利100以内的偶数）
3- 创建Thread类的子类的对象
4- 通过此对象调用start（）

such  as： 便利100以类的所有偶数
 */

//————————————————————————————————————————————————————————

//1- 创建一个继承于Thread（自带的）类的子类
class MyThread extends Thread {
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

public class thread_learn_1 {

    public static void main(String[] args) {
        //3- 创建Thread类的子类的对象
        MyThread T1 = new MyThread();

        //4- 通过此对象调用start（）
        T1.start();

        //问题3 --的解决
        MyThread T2 = new MyThread();
        T2.start();
//______________________________________________________________
        /**
         * 问题1 -能不能把上面的T1.start(); 换成  T1.run（）
         * 回答：不能
         */
//______________________________________________________________

        /**
         * 问题2 -能不能调完一次T1.start();  再来一次T1.start();？
         * 回答：不能
         */
//______________________________________________________________
        /**
         * 问题3 -想再起一个线程，便利100以内的问题，怎么办？
         * 回答：需要再新建一个线程对象
         *
         * eg：MyThread T2 = new MyThread();
         * T2.start();
         */
//______________________________________________________________
        /**
         * 问题4 -如果要开启两个不同的线程，怎么办
         * 回答：再Thread_learn2中
         */


    }
}
