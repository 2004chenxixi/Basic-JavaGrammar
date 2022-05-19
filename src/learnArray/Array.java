package learnArray;

import java.util.Arrays;
import java.util.Scanner;

//数组
public class Array {
    public static void main(String[] arges) {
//静态数组，就是每个数字都是，确定的
        int[] age = new int[]{43, 434, 32, 32, 3232};
        System.out.println(age);
//动态数组，没有具体化的数组，就是动态数组，下面给动态数组付值
        String[] names = new String[4];
        names[0] = "chen";  //动态数组付值

        System.out.println(names.length);//length长度
    }
}

//class learnArray.arrayTest ，这里可以学到，怎么在一堆数字里面找出，最大的那个，思路在下面，有具体体现
//定义一个0值，在循环体中，比较和付值
class arrayTest {
    public static void main(String[] arges) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你们班的人数");
        int person = in.nextInt();

        int[] personScore = new int[person];//这个地方定义了一个personScore的数组
        System.out.println("请输入你们班" + person + "个人，各自的分数");
        for (int i = 0; i < personScore.length; i++) {
            personScore[i] = in.nextInt();//循环给personScore付值
        }
        int maxScore = 0;//定义一个0的值，和输入的值做比较，然后用maxscore来接受最大值
        for (int i = 0; i < personScore.length; i++) {
            if (maxScore < personScore[i]) {
                maxScore = personScore[i];
            }
        }
        char level;//定义一个level，来输出
        for (int i = 0; i < personScore.length; i++) {
            if (maxScore - personScore[i] <= 10) {
                level = 'A';
            } else if (maxScore - personScore[i] <= 20) {
                level = 'B';
            } else if (maxScore - personScore[i] <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("student" + i + "is score" + personScore[i]
                    + "grader is" + level);
        }
    }
}

class Test {
    public static void main(String[] arr) {
        int[] gainMaxNumber = new int[]{43, 49, 65, 76, 32, 34, 23};
        System.out.println(gainMaxNumber);
        for (int i = 0; i < gainMaxNumber.length - 1; i++) {
            for (int j = 0; j < gainMaxNumber.length - 1 - i; j++) {
                int max = 0;
                if (gainMaxNumber[i] > gainMaxNumber[i + 1]) {
                    max = gainMaxNumber[i];
                    gainMaxNumber[i] = gainMaxNumber[i + 1];
                    gainMaxNumber[i + 1] = max;
                    System.out.print(max);
                }
            }

        }

    }
}

//二维数组，就好像在，一个人在国旗下，阅兵一样，第一拍看见的，就是队长（第一次就定义的人），他后面可以带好多人
//就是二维的
class TwoDimensionalArray {
    public static void main(String[] arr) {
        //二维数组的基本认识
        //静态初始化
        int[][] Array = new int[][]{{12, 3}, {2, 3, 1}, {3, 2, 1}, {3, 10}};
        //动态初始化
        //这里的[3][2]，第一个3表示'堆'里面有3个元素，后面的2，表示3个元素每个都'附加'2个元素
        String[][] Array2 = new String[3][2];

        //如何便利二维数组
        int[][] Array3 = new int[][]{{12, 3}, {2, 3, 1}, {3, 2, 1}, {3, 3}};
        //操作
        int sum = 0;
        for (int i = 0; i < Array3.length; i++) {
            for (int j = 0; j < Array3[i].length; j++) {
                sum += Array3[i][j];
                // System.out.print(Array3[i][j] + "  ");

            }
        }
        System.out.println(sum);
    }
}

//class yanghuiTest {
//
//    public static void main(String[] args) {
//        int yangHui[][] = new int[10][];
//
//        for (int i = 0; i < yangHui.length; i++) {
//            yangHui[i] = new int[i + 1];
//            yangHui[i][0] = 1;
//            yangHui[i][i] = 1;
//            if (i > 1) {
//                for (int j = 0; j < yangHui[i].length; j++) {
//                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
//                }
//            }
//        for (int i = 0; i < yangHui.length; i++) {
//            for (int j = 0; j < yangHui[i].length; j++) {
//                //赋值每行两端元素值为1
//                if (j == 0 || i == j) {
//                    yangHui[i][j] = 1;
//                } else {
//                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
//                }
//            }
//       }


//            for (int i = 0; i < yangHui.length; i++) {
//                for (int j = 0; j < yangHui[i].length; j++) {
//                    System.out.print(yangHui[i][j] + "\t");
//                }
//                System.out.println();
//            }
//        }
//    }

class YangHuiSanJiao {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        //创建一个n行n列的二维数组
        int[][] arr = new int[n][];//n行
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];//注意括号内的是内存大小，+1
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //赋值每行两端元素值为1
                if (j == 0 || i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        //遍历输出。
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

//杨辉三角，回形数

//随机数公式
//10 - 99
//(int)(Math.random()*(99-10+1)+10)
class ManyArrayTest {
    public static void main(String[] args) {
        int[] array = new int[6];
    }
}

class Test1 {
    public static void main(String[] args) {
        //下面new的东西，就是长度，也是这个OneArray的个数，怎么知道他的个数，就--OneArray.length
        //个数就是长度
        int[] OneArray = new int[10];
        //要是要产生随机数，不能把随机数直接付值给一个值，不然那样值就会一直一样，错误示范如下
        //int random = (int) (Math.random() * (99 - 10) + 10);
        //给切片付值，要循环，付值
        for (int i = 0; i < OneArray.length; i++) {
            OneArray[i] = (int) (Math.random() * (99 - 10) + 10);
            System.out.print("值为=" + OneArray[i] + "\t");
        }
        int Max = OneArray[0];
        for (int i = 0; i < OneArray.length; i++) {
            if (OneArray[i] > Max) {
                Max = OneArray[i];
                System.out.println("最大值=" + Max + "\n");
            }
        }

        int Min = OneArray[0];
        for (int i = 0; i < OneArray.length; i++) {
            if (OneArray[i] < Min) {
                Min = OneArray[i];
            }
        }
        System.out.println("最小值=" + Min + "\n");

        int sum = 0;
        for (int i = 0; i < OneArray.length; i++) {
            OneArray[i] = (int) (Math.random() * (99 - 10) + 10);
            sum += OneArray[i];
        }
        System.out.println("总和" + sum + "\n");
        System.out.println("平均数" + sum / OneArray.length);
    }
}

class CopyTest {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 541, 4, 5989, 6565, 21, 2, 5, 23, 3};

        //将array1'复制'给array2 ----->  arr1[i]=arr2[i]----两个是独立的
        //将array1'赋值'给array2 ----->  arr1=arr2----------两个是不是独立的
        //如果直接写array1=array2，这样是错误的，这样穿的就是地址了，这样修改array1，array2也会被改变
        //而复制的意义是，array1与array2，是两个独立的个体
        //复制----->修改array1---array2不会被影响，才是复制
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
    }
}

//反转
class reversal {
    public static void main(String[] args) {
        String[] arr = new String[]{"aa", "da", "tr", "gf", "fd", "bb"};
        //这边要除以2， 因为他除以2就已经旋完了，你不除以2，那不久白转了吗，又回去了
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("===" + arr[i]);
        }
    }
}

//线性查找
class LookUp {
    public static void main(String[] args) {
        String[] arr = new String[]{"aa", "da", "tr", "gf", "fd", "bb"};
        String seek = "bb";
        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {
            //下面两个if一样的，只不过--第一个if他是字符串，有简单的方法，如果是int就用第二个if
            if (seek.equals(arr[i])) {
                // if (arr[i] == seek) {
                System.out.println(i + seek);
                isFlag = false;
                break;
            }
        }
        //这边写if (isFlag = ture) {-----不行
        if (isFlag == true) {
            System.out.println("查询无果");
        }
    }
}

//二分法查找
//因为二分法的要求高，所以，一般都是"冒泡+二分法"
class dichotomySearch {
    public static void main(String[] args) {
        //二分法查找，需要顺序有一定规律(从大到小或者从小到大)，比较严格
        int[] arr3 = new int[]{-32, -21, 0, 43, 54, 76, 87, 98};
        int dest2 = -32;
        int head = 0;
        int end = arr3.length;
        boolean isFlag1 = true;

        for (int i = 0; i < arr3.length; i++) {
            int mid = (head + end) / 2;
            if (dest2 == arr3[mid]) {
                System.out.println("找到了，位置为：" + mid);
                break;
            } else if (dest2 > mid) {
                head = mid + 1;
            } else if (dest2 < mid) {
                end = mid - 1;
            } else {
                isFlag1 = false;
            }
        }
        if (isFlag1 == false) {
            System.out.println("对不起，没有找到");
        }
    }
}

class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr2 = new int[]{32, 43, 21, 35, -98, -65, -43, 54, 76};
        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = 0; j < arr2.length - 1 - i; j++) {
                if (arr2[i] > arr2[i + 1]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[i + 1];
                    arr2[i + 1] = temp;
                }
            }
        }
    }
}

//数组的"现成方法"
class ArrayFunc {
    public static void main(String[] args) {
        int[] arr4 = new int[]{2, 3, 4, 5};
        int[] arr5 = new int[]{2, 3, 4, 5};
        int[] arr6 = new int[]{32, 43, 21, 35, -98, -65, -43, 54, 76};
        //1.比较两个'数组'是否一样
        // boolean equals(int[]a ,int []b)
        boolean isEquals = Arrays.equals(arr4, arr5);
        System.out.println(isEquals);

        //2.快速"便利数组"
        //String toString（int[] a） ;输出数组
        System.out.println(Arrays.toString(arr4));

        //3.把数组中，所有的值都替换掉
        //void fill(int[]a,int val)
        Arrays.fill(arr4, 10);
        System.out.println(Arrays.toString(arr4));

        //4.排序
        //Arrays.sort(int []a);
        Arrays.sort(arr6);
        System.out.println(Arrays.toString(arr6));

        //二分法，查找
        //Arrays.binarySearch(int[]a,要找的数字);---->找到的是位置
        int[] arr7 = new int[]{-98, -65, -43, 21, 32, 35, 43, 54, 76};
        int index = Arrays.binarySearch(arr7, 2);
        if (index >= 0) {
            System.out.println("你要找的元素的位置" + index);
        } else {
            System.out.println("没有该元素");
        }

    }
}

class EndArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        //1.冒泡
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        int[] arr2 = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        System.out.println("反转数式-前" + Arrays.toString(arr2));
        for (int i = 0; i < arr2.length / 2; i++) {
            int temp1 = arr2[i];
            arr2[i] = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = temp1;
        }
        System.out.println("反转数式" + Arrays.toString(arr2));

        int CopyArr2[] = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            CopyArr2[i] = arr2[i];
        }
        System.out.println("复制后" + Arrays.toString(CopyArr2));

        int seek1 = 22;
        boolean flag1 = true;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == seek1) {
                System.out.println("你找的数的索引为" + i + "这个数为" + seek1);
                flag1 = false;
                break;
            }
        }
        if (flag1 == true) {
            System.out.println("对不起没有找到");
        }


    }
}








