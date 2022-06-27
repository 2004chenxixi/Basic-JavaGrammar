package _312after_366before.src.javaTeacher.abstract_class.template;

/*
抽象类的应用：模仿方法的设计模式
 */
public class TemplateTest {

    public static void main(String[] args) {
        //这个是最后一步（第三步），测试
        Template t = new SubTemplate();
        t.SpendTime();

    }
}

//-----------------------------------------------------------------------------------------------


abstract class Template {
    //第一步，确定开头和结尾时间，创建一个"没用的abstract"的方法，让下面重写
    public void SpendTime() {
        long start = System.currentTimeMillis();

        code();//不确定，易变的

        long end = System.currentTimeMillis();

        System.out.println("执行这代码的时间= " + (end - start));
    }

    public abstract void code();//这个没被用到，下面重写了这个方法
}

//-----------------------------------------------------------------------------------------------

class SubTemplate extends Template {
    //第二部，继承Template，并且开头不写abstract，而是去重写他的abstract的方法
    // 因为这个是继承abstract的类，所以，要重写他的方法
    @Override
    public void code() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
