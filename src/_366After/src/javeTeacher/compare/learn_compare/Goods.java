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
            //方式一、
            if (this.price > goods.price) {
                return 1;
            } else if (this.price < goods.price) {
                //return 0;
                return -this.name.compareTo(goods.name);
            }
            //方式二、  return Double.compare(this.price, goods.price);
            return this.name.compareTo(goods.name);
        }
        throw new RuntimeException("你输入的类型有误");
    }
}
