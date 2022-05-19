package recursionTest;

//递归方法----写斐波那，方便
public class recursion {
    public static void main(String[] args) {
        recursion sum = new recursion();

        System.out.println(sum.getsum(100));
        System.out.println(sum.f(10));
        System.out.println(sum.FibonacciSequence(7));



    }

    public int getsum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getsum(n - 1);
        }
    }

    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * f(n - 1) + f(n - 2);
        }
    }
//斐波那数列
    //用递归写，方便一点
    //1，1，2，3，4，5，8，13，21，34，55
    //从第三个项开始，后面的每一项等于，前面两项的和
    public int FibonacciSequence(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return FibonacciSequence(n-1)+FibonacciSequence(n-2);
        }
    }





}
