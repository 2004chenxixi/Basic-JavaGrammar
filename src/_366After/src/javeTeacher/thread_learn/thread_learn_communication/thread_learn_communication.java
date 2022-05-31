package _366After.src.javeTeacher.thread_learn.thread_learn_communication;

/*
通信--可以让用户，交替打印
 */
class Number implements Runnable {
    private int number = 1;
    //如果要使用obj，那么下面的notifyAll和wait--也要是obj的
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            // synchronized (this) {
            synchronized (obj) {

                //和wait合用，每次解锁一下

                //notifyAll();
                obj.notifyAll();
                if (number < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        //wait(阻塞)
                        //wait();
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    break;
                }
            }
        }
    }
}

public class thread_learn_communication {
    public static void main(String[] args) {
        Number n = new Number();

        Thread t1 = new Thread(n);
        Thread t2 = new Thread(n);
        Thread t3 = new Thread(n);


        t1.setName("1hao");
        t2.setName("2hao");
        t3.setName("3hao");


        t1.start();
        t2.start();
        t3.start();


    }
}
