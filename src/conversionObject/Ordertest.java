package conversionObject;

//自己写一个转化，转化equal
//把以前那些，输出出来是地址的东西，全给它改了
//下面改了，equals/toString
public class Ordertest {
    public static void main(String[] args) {
        Order order1 = new Order(11, "AA");
        Order order2 = new Order(11, "BB");

        System.out.println(order1.equals(order2));
        Order order3 = new Order(11, "BB");
        System.out.println(order2.equals(order3));

        Order order4 = new Order(101, "sad");
        System.out.println(order4.toString());

    }
}

class Order {
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {  //构造器
        super();
        this.orderId = orderId;
        this.orderName = orderName;

    }

    public int getOrderId() {   //封装
        return orderId;
    }

    public void setOrderId(int orderId) { //封装
        this.orderId = orderId;
    }

    public String getOrderName() { //封装
        return orderName;
    }

    public void setOrderName(String orderName) { //封装
        this.orderName = orderName;
    }

    //重写equal
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        //判断object是否是order的实例对象--下面是对这句话的理解
        //就是判断--Object object = new Order；--这个就是object就是Order的实例化了
        if (object instanceof Order) {
            Order order = (Order) object;
            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
        }
        return false;
    }


    //万物都可以重写
    //现在我们重写toString
    public String toString() {
        return "Order4[orderId =" + orderId + ", orderName= " + orderName + "]";
    }


}
