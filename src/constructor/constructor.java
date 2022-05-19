//构造器
//构造器，1。创建对象---2。给对象直接赋值
//And
//对this的使用
// 1。对于在一个类中，行参和总体的重名，就this一下他
//2。为了在，构造器里面调构造器，也要用this.(需要的行参)
//调用一个类就要用构造器====类就是一个class
package constructor;

public class constructor {
    private double base;//底边长
    private double height;//高

    public constructor(){
        System.out.println("xiixixixiix");
    }
    //下面这个，是给带仓库赋值，可以直接在构造完，直接赋值
    public constructor(double b , double h){
        base = b;
        height = h;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return this.base;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public double getHeight(){
        return this.height;
    }



}
