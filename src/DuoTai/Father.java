//学习---多态
//要使用多态的前提--是要使用继承
package DuoTai;

public class Father {

    String name;
    int age;
    String sex ;

    public void eat() {
        System.out.println("男人可以吃饭--father");
    }

    public void sleep() {
        System.out.println("男人可以睡觉--father");
    }

    public  void PalyGame(){
        System.out.println("男人可以打游戏--father");
    }



}
