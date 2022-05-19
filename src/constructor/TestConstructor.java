package constructor;

public class TestConstructor {
    public static void main(String[] args) {
        constructor c  = new constructor();
        c.setBase(2.2);
        c.setHeight(3.3);
        System.out.println("base="+c.getBase()+"\t"+"height="+c.getHeight());
    }

}
