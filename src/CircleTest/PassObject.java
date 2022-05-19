package CircleTest;

public class PassObject {
    public static void main(String[] args) {
        PassObject p = new PassObject();
        Circle c = new Circle();
        p.printAreas(c, 5);  //这里的c，为什么要先new一下
    }


    public void printAreas(Circle c, int time) {

        System.out.println("radius" + "\t\t\t" + "Areas");
        //设置圆的半径
        for (int i = 1; i <= time; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t\t" + c.findArea());
        }
    }
}
