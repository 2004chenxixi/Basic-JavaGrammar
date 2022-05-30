package _366After.src.javeTeacher.thread_learn.thread_learn_3;

/**
 * （一）测试Thread中常用的方法：
 * 1- start：启动当前线程：调用当前线程的run（）
 * <p>
 * 2- run（）：通常需要重写Thread类中的此方法：将创建的线程都要执行的操作声明在此方法中
 * <p>
 * 3- currentThread（）：静态方法，返回执行当前代码的线程
 * <p>
 * 4- getName（）：获取当前线程的名字
 * <p>
 * 5- setName（）：设置当前线程的名字-->小线程用new的调，主线程用Thread(自带的)调
 * <p>
 * 6- yield（）：主动放弃当前线程(一次)，给别的线程 ---->用法：Thread.yield();
 * <p>
 * 7- join（）： （小三）当join(join就是小三)插入后，小三会一直得宠，直到小三离开，正牌才会出来
 * ————注释：当jion爆红的时候，直接给她一个try就可以了
 * <p>
 * 8- sleep(long millitime):睡眠当前线程---就是睡着了，动的很慢
 * * ————注释：当sleep爆红的时候，直接给她一个try就可以了
 * <p>
 * 9- isAlive():判断当前线程是否存活
 * <p>
 * <p>
 * —————————————————————————————————————————————————————————————————————————————————————
 * ————————————————————————————————————————————————————————————————————————————————————
 * <p>
 * <p>
 * （二）线程的优先级
 * 1- MAX_PRIORITY：10
 * MIN_PRIORITY：1
 * NORM_PRIORITY：5
 * <p>
 * 2- 如何获取和设置当前线程的优先级
 * getpriority();       //获取线程的优先级
 * setpriority(int p);  //设置线程的优先级
 * <p>
 * 3-
 */


//1- 创建一个继承于Thread（自带的）类的子类
class MyThread extends Thread {
    //2- 重写Thread类的run（）方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + Thread.currentThread().getPriority() + ":" + i + "wsT1");
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
        //todo  是不是（分线程和主线程的引入方式不同）
        //设置(分线程)的优先级
        T1.setPriority(Thread.MAX_PRIORITY);

        //4- 通过此对象调用start（）
        T1.start();
//______________________________________________——————————————————
        //**附加：给主线程起名字
        Thread.currentThread().setName("我是主线程");
        //todo
        //设置（主线程）的优先级
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {

                System.out.println(Thread.currentThread().getName() + Thread.currentThread().getPriority() + ":" + i);
            }
            if (i == 90) {
                try {
                    T1.join(); //这个是把T1，插队进来的意思
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        //isAlive
        System.out.println(T1.isAlive());


    }
}
