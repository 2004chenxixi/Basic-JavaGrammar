package _366After.src.javeTeacher.thread_learn.thread_learn_project_4;

//------------------------------>这个是（继承）的项目
//用synchronized来解决--安全性
/*

创建3个窗口，卖票，总数--100张
 */class Window extends Thread {
    private static int ticket = 100;
    //这个Object要变成static
    private static Object obj = new Object();

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
                    System.out.println(getName() + ":买票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class Window_test_project {
    public static void main(String[] args) {
        //3- 创建Thread类的子类的对象
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        //设置名字
        w1.setName("一号窗口");
        w2.setName("二号窗口");
        w3.setName("三号窗口");

        //4- 通过此对象调用start（）
        w1.start();
        w2.start();
        w3.start();
    }
}
