package constructor;

public class learnThis {
    public static void main(String[] args) {
        learnThis1 l = new learnThis1();
        learnThis1 l1 = new learnThis1(1);
        learnThis1 l2 = new learnThis1(1);
    }
}
//一句话---->1.想要用this来解决冗余，2.就要-----"方法重载",的基础上，才可以执行this
//*****8
//想使用，this来解决，冗余，需要满足一定的格式，格式如下----和'方法重载'差不多
//1。名字都一样，大概和'方法重载'差不多意思------写法
//2。想要被调用哪一个，就---注意后面的行参，"看上面的调用"-----用法
class learnThis1 {

    public learnThis1() {
        String info = "yiyiyyiyiyiyi";
        System.out.println("xixiixixi"+info);
    }

    public  learnThis1(int a) {
        this();
    }

    public learnThis1(int a, int b) {
        this(a);
    }

}


//class pet{
//    public pet(){
//
//    }
//}
