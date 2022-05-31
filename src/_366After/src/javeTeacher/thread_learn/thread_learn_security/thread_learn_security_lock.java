package _366After.src.javeTeacher.thread_learn.thread_learn_security;

import java.util.concurrent.locks.ReentrantLock;

class Window implements Runnable {

    private int ticket = 100;
    //多引入这个---ReentrantLock
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //多加一个try--和下面finally连用
            try {
                //调用lock（）上锁
                lock.lock();

                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                //解锁
                lock.unlock();

            }

        }


    }
}

public class thread_learn_security_lock {
    public static void main(String[] args) {
        Window w = new Window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("1hao");
        t2.setName("2hao");
        t3.setName("3hao");

        t1.start();
        t2.start();
        t3.start();

    }
}
