package Tools;
//方法中有需要return的，在主体里面都需要
// 1.定义一下
// 2.System.out.println一下
public class ArrayTools {
    //求最大值
    public int Max(int[] arr) {
        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }
        return Max;
    }

    //求最小值
    public int Min(int[] arr) {
        int Min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        return Min;
    }

    //求和

    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //求平均数
    public int average(int[] arr) {
        return getSum(arr) / arr.length;
    }

    //反转数组
    public void Reversal(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1-i];
            arr[arr.length - 1-i] = temp;
        }
    }

    //复制数组
    public int[] CopyArray(int[] arr) {   //这里的细节是，放回的是一个你int的数组切片
        int[] NewArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            NewArray[i] = arr[i];
        }
        return NewArray;
    }

    //数组排序-冒泡
    public void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp1 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp1;
                }
            }
        }
    }

    //便利数组
    public void WriteArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    //查找数组--线性
    public String indexLook(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return "找到了" + arr[i] + "这个数的位置是" + i;
            }
        }
        return "对不起没有你想要的";
    }
}
