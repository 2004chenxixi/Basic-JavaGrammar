package _366After.src.javeTeacher.commonly_used_class.used_String_exercise;

/*
String的练习
 */

//总测试
public class used_String_Test {
    public static void main(String[] args) {
        // 1- 我是对部分字符串，进行反转 ----> 3种方式
        reverse reverse = new reverse();
        String str = "abcdefg";
        String reverse1 = reverse.reverse3(str, 2, 5);
        System.out.println("我是对部分字符串，进行反转=  " + reverse1);


        //2- --> 获取一个字符串,在另一个字符串中出现的次数
        getCount getCount = new getCount();
        String mianStr = "abihofdgpjgpdabjfpgjpejabpjgerpgjpe";
        String subStr = "ab";
        int i = getCount.gainCount(mianStr, subStr);
        System.out.println("获取一个字符串,在另一个字符串中出现的次数:=  " + i);


        //3-获取两个字符串中----"最大"的"相同"子串
        getMaxSomeString getMaxSomeString = new getMaxSomeString();
        String str1 = "qwertyuiop1asdfghjkl";
        String str2 = "uiop1";
        String maxSomeString = getMaxSomeString.getMaxSomeString(str1, str2);
        System.out.println("获取两个字符串中----\"最大\"的\"相同\"子串=  " + maxSomeString);
    }
}


//1- 字符串--部分进行反转
class reverse {
    public String reverse1(String str, int startIndex, int endIndex) {
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
    public String reverse2(String str, int startIndex, int endIndex) {
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

    //方式三：使用StringBuild 替换--> String
    public String reverse3(String str, int startIndex, int endIndex) {
        if (str != null && str.length() != 0) {
            //先定义一个StringBulid的长度
            StringBuilder Builder = new StringBuilder(str.length());
            //第一
            Builder.append(str.substring(1, startIndex));
            //第二
            for (int i = endIndex; i >= startIndex; i--) {
                Builder.append(str.charAt(i));
            }
            //第三
            Builder.append(str.substring(endIndex + 1));
            return Builder.toString();
        }
        return null;
    }
}

//2- 获取一个字符串,在另一个字符串中出现的次数
class getCount {
    //获取subStr在mainStr中出现的次数
    public int gainCount(String mainStr, String subStr) {
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;
        if (mainLength >= subLength) {
//方式一
//            while ((index = mainStr.indexOf(subStr)) != -1) {
//                count++;
//                mainStr = mainStr.substring(index + subStr.length());
//            }
//方式二
            while ((index = mainStr.indexOf(subStr, index)) != -1) {
                count++;
                index += subLength;
            }

            return count;
        } else {
            return 0;
        }
    }
}

//3- 获取两个字符串中----"最大"的"相同"子串
class getMaxSomeString {
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







