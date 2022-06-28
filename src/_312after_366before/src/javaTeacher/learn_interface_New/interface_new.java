package _312after_366before.src.javaTeacher.learn_interface_New;

/*
这个是JDK8的interface
特性：除了"全局常量"、"抽象方法"+还有"静态方法"、"默认方法"
 */
public interface interface_new {
    //静态方法
    public static void method1() {
        System.out.println("我是静态方法");
    }

    //默认方法——有写权限
    public default void method2() {
        System.out.println("我是默认方法");
    }

    //默认方法--不写权限
    default void method3() {
        System.out.println("我是默认方法，略写版本--接口");
    }


}
