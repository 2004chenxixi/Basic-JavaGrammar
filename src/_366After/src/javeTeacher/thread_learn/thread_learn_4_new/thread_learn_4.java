package _366After.src.javeTeacher.thread_learn.thread_learn_4_new;
/*
和前面的123-不同
前面用的是（继承）
这里用的是（实现）
 */

class Mythread implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
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


public class thread_learn_4 {
    public static void main(String[] args) {
        //new的是（操作）的类名
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
