package LearnExtends;

//学习--继承extends------但是子类可以用（重写----方法重载）来覆盖父类的值
//继承1。解决了---代码的冗余
//2。便于扩展
//3。为多态，提供条件
//继承的操作在Student里面，可以查看
//——————————————————————————————————————————————
//如果要 重写
//1。需要规定--（子的）方法名和行参列表----和（父的）方法名和行参列表---要一样
//2。修饰符不能小与被重写的权限修饰符
//3。但是如果父的修饰符是private，那么子类会把它判定为太小，不能被重写
//4。如果父的返回值是void--子的放回值也要是void
//5。如果父的返回值 -----不写了太多了
//实战直接复制粘贴----父类的
// 覆盖的都是方法***
public class Extends {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
        person.sleep();

        Student student = new Student();
        student.seeView();
        student.eat();
        student.sleep();
    }
}

//super也是继承里面的内容
//主要区分，父类被子类覆盖的情况下-----super代表父类的方法
//1，super调用-方法
//2。super调用-构造体

//-----------------------------
//经典问题，为什么子，不管怎么样，都会调用父的构造器
//我们就把，构造器==可以创造人
//我们现在想要孩子，然后我们就要先用构造器构造爸爸，再构造儿子
class LearnSuper{

}
