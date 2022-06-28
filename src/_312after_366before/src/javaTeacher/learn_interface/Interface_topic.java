package _312after_366before.src.javaTeacher.learn_interface;

/*
    对interface的测试题目
     */
interface A {
    int x = 0;
}

class B {
    int x = 1;
}

class C extends B implements A {
    public void pX() {
        //问题一，父类和接口--重名的情况
        //System.out.println(x);-->错误，因为（接口和父类，是并列的关系，所以不知道x到底是什么，报错）
        System.out.println(super.x);//这个是父类的，所以x=1；
        System.out.println(A.x);//接口中的是-抽象类，可以直接用类.出来（所以这个是x=0）

    }

    public static void main(String[] args) {
        new C().pX();
    }
}
