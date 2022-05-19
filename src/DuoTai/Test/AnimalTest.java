package DuoTai.Test;

import DuoTai.Father;
import DuoTai.woman;

//对-多态的理解test
public class AnimalTest {
    public  static  void  main(String[]args){
        AnimalTest test = new AnimalTest();
        test.func(new Dog());
        //Father father1 = new woman();
    }


    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
}

class  Animal{
    public void  eat(){
        System.out.println("吃东西--Animal");
    }

    public void shout(){
        System.out.println("可以叫-Animal");
    }
}

class  Dog extends Animal{
    public void  eat(){
        System.out.println("吃东西--dog");
    }

    public void shout(){
        System.out.println("可以叫-dog");
    }
}

class  cat  extends  Animal{
    public void  eat(){
        System.out.println("吃东西--cat");
    }

    public void shout(){
        System.out.println("可以叫-cat");
    }
}
