package _366After.src.javeTeacher.compare.learn_compare;

/*
解释：--comparable对（自定义类）的比较
1- 让对比的(自定义类)implements Comparable
2- 重写compareTo
 */
public class Goods implements Comparable {
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    //值明-商品大小来排序
    public int compareTo(Object o) {

        if (o instanceof Goods) {
            Goods goods = (Goods) o;
            return Double.compare(this.price, goods.price);
        }
        throw new RuntimeException("你输入的类型有误");
    }
}
