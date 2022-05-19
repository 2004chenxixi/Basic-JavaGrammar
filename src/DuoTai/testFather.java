package DuoTai;
/*

多态的理解
1。对象的多态度--父类的引用指向子类的对象
2。我们调用父类的方法，但是执行的是--子类重写父类的方法
总结：编译看左边，执行看右边---只对方法有效，对属性无效
属性不存在多态

多态的前提是--1。继承，没有继承就没有多态  2。子类要有重写父类的方法重写


 */
public class testFather {
    public static void main(String[] args) {
        Father father = new Father();
        father.name ="xixi";
        father.eat();
        woman woman = new woman();
        woman.name="xixi---wowam";
        woman.eat();
        //______________________上面这些还是继承的内容，下面开始--多态
        Father father1 = new woman(); //多态,可以看看和上面有什么不同
        Father father2 = new son();
        woman woman1 =new woman();

        father1.eat();//他是用Father开始的，可是结果却是woman的结果

        woman woman2 = (woman)father1;
        woman2.isgood=true;

        if (father1 instanceof  woman){
            woman woman5 = (woman)father1;
            //woman5.isgood = false;
            System.out.println( woman5.isgood = false);
        }
        /*
        ##多态的升维和降维

        但是上面的多态也有弊端，因为你前面的规定成Father，只能调Father里面的内容
        这样woman自己的属性，就调不了啦？
        ##解决：
        我们使用强制转化，要使用father的东西，当时又要同时兼顾自己的属性
        我们先谢谢，兼顾自己的属性，怎么样可以调用自己的属性----> Woman woman1 =new Woman();
        这样是可以调用自己的，可是father的就不能用了
        所以我们中和一下，先写father的多态，在写自己的调用
        1.先写father的多态------Father father1 = new Woman();
        2.在写自己的调用---------Woman woman1 =new Woman();
        所以中和一下---->Woman woman1 = （Woman）father

        但是怎么可能这么简单--我们应该要加一个判断，否则会报出ClassCastException
       加上；----instanceof
       if （father instanceof Woman){
       Woman woman1 = （Woman）father
        woman1.isgood=true;
        System.out.println("xixiixixi")
       }
       ）

         */

    }


}
