package _312after_366before.src.javaTeacher.learn_interface_New;

/*
这个是一个对，接口的加深理解

1-问题：
    你老婆、老妈调水里，救谁的问题？
2-解决方法：
    你听你老爸的话--OR--自己选择救谁
 */

//老妈的求救
interface Mom {
    public default void help() {
        System.out.println("救你老妈--");
    }
}

//老婆的求救
interface Wife {
    public default void help() {
        System.out.println("救你老婆，我给你生孩子--");
    }
}

//老爸的注意
class Dad {
    public void help() {
        System.out.println("听爸爸说：救你老妈");
    }
}

//情况1---不停老爸的话，自己选择
class HelpWho_Test implements Mom, Wife {
    @Override
    public void help() {
        Mom.super.help();//救老妈
        Wife.super.help();//救老婆
        System.out.println("我也不知道救谁呀");
    }
}

//情况2：听老爸的话
class HelpWho_Test2 extends Dad implements Mom, Wife {
    //如果你继承了，你父亲的话，就不用纠结，肯定听父亲的话
    /*
    想表达的是：
           实现到两个接口的"同参数，同名"的方法时，要做重写的选择
           但是在上面的情况遇到的时候，你继承了父类"同参数，同名"的方法时，就直接听父的话了
     */
}









