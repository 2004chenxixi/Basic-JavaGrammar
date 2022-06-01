package _366After.src.javeTeacher.thread_learn.thread_learn_callable;
/*
使用Callable来创建
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//0- 创建一个Callable的实现类
class Number implements Callable {
    //1- 重写Callable的方法，将此线程需要的操作，放在Call方法中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        //如果不要放回值--就写null，也不需要6了
        return sum;
    }
}

public class thread_learn_Callable {
    public static void main(String[] args) {
        //2- 创建Callable接口的实现类的对象
        Number number = new Number();

        //3- 将Callable接口实现类的对象，作为传递值到FutureTask构造器中，创建FutureTask的对象
        FutureTask futureTask = new FutureTask(number);

        //5- 将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start（）；
        new Thread(futureTask).start();


        try {
            //6- get方法的返回值 ，为构造器futureTast构造器参数Callable实现类重写方法call（）的返回值
            Object sum = futureTask.get();
            System.out.println("总和" + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
