package _366After.src.javeTeacher.thread_learn.thread_learn_project_ticket;

//------------------------------>这个是（实现）的项目
//用synchronized来解决--安全性
/*
创建3个窗口，卖票，总数--100张
 */
class Mythread implements Runnable {
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
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
            }
        }
    }
}

public class window_test_project_2 {
    public static void main(String[] args) {
        Mythread w = new Mythread();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("1:--");
        t2.setName("2:--");
        t3.setName("3:--");

        t1.start();
        t2.start();
        t3.start();
    }
}
