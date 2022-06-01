package _366After.src.javeTeacher.thread_learn.thread_learn_threadPool;

/*
使用--线程池
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class thread_learn_ThreadPool {
    public static void main(String[] args) {
        //设置-线程池的最大容量
        ExecutorService service = Executors.newFixedThreadPool(10);

//        service.execute();//适合-适用于Runnable
//        service.submit();//适合-适用于Callable


    }
}
