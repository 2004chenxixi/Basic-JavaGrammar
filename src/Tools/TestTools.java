package Tools;
//注意
//下面这些，需要"打印出来的数组"不可以直接System.out.print
//需要便利才可以出来，不然出来的"只会是地址"
public class TestTools {
    public static void main(String[] args) {
        //创建一个arr的数组
        int arr[] = new int[]{32, 43, 65, 76, 75, 44, 4, 0, 98, 5};
        //new一个ArrayTools，让ArrayTools里面的东西被使用
        ArrayTools tools = new ArrayTools();
        int max = tools.Max(arr);
        System.out.println("最大值" + max);
        System.out.println("-----------------------------");
        int min = tools.Min(arr);
        System.out.println("最小值" + min);
        System.out.println("-----------------------------");
        int sum = tools.getSum(arr);
        System.out.println("总和" + sum);
        System.out.println("-----------------------------");
        int average = tools.average(arr);
        System.out.println("平均数" + average);
        System.out.println("-----------------------------");
        System.out.println("排序前");
        tools.WriteArray(arr);
        System.out.println();
        tools.BubbleSort(arr);
        System.out.println("排序后");
        tools.WriteArray(arr);
        System.out.println("\n"+"-----------------------------");
        System.out.println("反转后");//单独测试"反转"时，要把前面排序的先注销，不然会有影响
        tools.Reversal(arr);
        tools.WriteArray(arr);
        System.out.println("\n"+"-----------------------------");
        int[] copy = tools.CopyArray(arr);  //这里的细节是，需要用一个数组来接收
        System.out.println("复制");
        tools.WriteArray(copy);
        System.out.println("\n"+"-----------------------------");
        String index = tools.indexLook(arr,4);  //这里的细节是，需要用一个数组来接收
        System.out.println("查找"+index);
        System.out.println("-----------------------------");






    }
}
