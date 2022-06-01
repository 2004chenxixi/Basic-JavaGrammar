package _366After.src.javeTeacher.thread_learn.thread_learn_threadPool;

/*
使用--线程池
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class Number implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}

class Number1 implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}


public class thread_learn_ThreadPool {
    public static void main(String[] args) {
        //1- 设置-线程池的最大容量---Executors.
        ExecutorService service = Executors.newFixedThreadPool(10);
        //附加1 --线程池的管理(转化)
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
        //附加2- 设置属性
        service1.setCorePoolSize(15);
        // service1.setKeepAliveTime();


        /**
         *   2- 使用线程
         *  service.execute();//适合-适用于Runnable
         *  service.submit();//适合-适用于Callable
         */
        //如果要使用，两个线程--写两个@override（如下）
        service.execute(new Number());
        service.execute(new Number1());


        //3- 关闭线程池
        service.shutdown();


    }
}
