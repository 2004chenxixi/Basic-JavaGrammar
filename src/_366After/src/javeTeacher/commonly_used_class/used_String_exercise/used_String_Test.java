package _366After.src.javeTeacher.commonly_used_class.used_String_exercise;

/*
String的练习
 */

public class used_String_Test {
    public static void main(String[] args) {
        // 我是对部分字符串，进行反转
        //1-方式一：char[]
        reverse reverse = new reverse();
        String str = "abcdefg";
        String reverse1 = reverse.reverse1(str, 2, 5);
        System.out.println("我是对部分字符串，进行反转=  " + reverse1);


    }
}

class getMaxSomeString {
    //获取两个字符串中----"最大"的"相同"子串
    //str1="qwehellozxc"   ----   str2="poihell"
    public String getMaxSomeString(String str1, String str2) {
        if (str1 != null && str2 != null) {
            String MaxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String MinStr = (str1.length() < str2.length()) ? str1 : str2;
            int length = MinStr.length();
            for (int i = 0; i < length; i++) {

                for (int x = 0, y = length - i; y <= length; y++) {

                    String subString = MinStr.substring(x, y);
                    if (MaxStr.contains(subString)) {
                        return subString;
                    }
                }
            }
            return null;
        }
        return null;
    }
}

class reverse {
    //1- 字符串--部分进行反转
    public String reverse(String str, int startIndex, int endIndex) {
        if (str != null && str.length() != 0) {
            //1-将String --> char[]
            char[] arr = str.toCharArray();
            for (int x = startIndex, y = endIndex; x < y; x++, y--) {
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    //2- 方式二： 使用String的拼接
    public String reverse1(String str, int startIndex, int endIndex) {
        if (str != null && str.length() != 0) {
            //第一部分
            String reverseOne = str.substring(1, startIndex);
            //第二部分
            for (int i = endIndex; i >= startIndex; i--) {
                reverseOne += str.charAt(i);
            }
            //第三部分
            reverseOne += str.substring(endIndex + 1);
            return reverseOne;
        }
        return null;
    }

}




