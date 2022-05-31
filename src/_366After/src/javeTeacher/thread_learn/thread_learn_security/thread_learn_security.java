package _366After.src.javeTeacher.thread_learn.thread_learn_security;
/*
这个安全性--->解决了；代码重复

方式一、同步代码块
      同步监视器（一直用这一个就可以了）：Object  obj = new  Object();

     synchronized(同步监视器){
     //需要被同步的代码，（一般都是---操作的步骤）
     }

方式二、同步方法
略





 */

class Mythread implements Runnable {
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        synchronized (obj) {
            while (true) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ":" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class thread_learn_security {
    public static void main(String[] args) {
        Mythread w = new Mythread();
        //将new的放入--Thread（自带）的构造器中
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
