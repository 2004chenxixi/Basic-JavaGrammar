package _366After.src.javeTeacher.IO.other;

import org.testng.annotations.Test;

import java.io.*;

/*
其他流的使用
1- 输入、输出流
输入流：System.in(因为它是字符流，要用转化器，转成字节流)
 */
public class Other {
    public static void main(String[] args) {
        //1- 标准的输入，输出流
        BufferedReader bufferedReader = null;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            bufferedReader = new BufferedReader(inputStreamReader);

            while (true) {
                System.out.println("请输入内容");
                String date = bufferedReader.readLine();
                if ("e".equals(date) || "exit".equals(date)) {
                    System.out.println("你已经输入e/exit，退出");
                    break;
                }
                String upperCase = date.toUpperCase();//将内容转化成大写
                System.out.println(upperCase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null)
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    //2- 打印流
    //打印流--会使本来应该出现在终端的文件，出现在你"规定的文件"里面
    @Test
    public void test2() {
        PrintStream printStream = null;
        try {
            //常规打印流操作（开头的这一段，可以不用修改）
            FileOutputStream fileOutputStream = new FileOutputStream(new File("/Users/ccc/Desktop/testIO/I_Love.txt"));
            printStream = new PrintStream(fileOutputStream, true);
            if (printStream != null) {
                System.setOut(printStream);
            }
            //具体出现的内容(下面这段，循环操作的，内容，可以修改成你需要的--代码)
            for (int i = 0; i <= 100; i++) {
                System.out.println("我爱你");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (printStream != null)
                try {
                    printStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }

    }

    //3- 数据流
    //DateInputStream 和 DataOutputStream
    //作用：用于"读取"或者"写出"基本数据类型的变量或者字符串（使数据持久化，就把它变成一个文件的形式）
    @Test
    //注：这里的异常，还是应该ry-catch，我只是为了，代码块的简洁，才用throws
    public void test() throws IOException {
        //持久化文件的路径
        DataOutputStream dateOutputStream = new DataOutputStream(new FileOutputStream("/Users/ccc/Desktop/testIO/DataPersistence.txt"));
        dateOutputStream.writeUTF("陈谢谢");
        dateOutputStream.flush();
        dateOutputStream.write(17);
        dateOutputStream.flush();
        dateOutputStream.writeBoolean(true);
        //注意：这样生成的文件，不能"双击打开直接读"，应该用--DateInputStream来读(在下面)
    }

    @Test
    public void test1() throws IOException {
        //1-读取"上面"持久化文件的路径
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("/Users/ccc/Desktop/testIO/DataPersistence.txt"));
        //2- 按顺序，从头到尾，读取信息
        String s = dataInputStream.readUTF();
        int i = dataInputStream.readInt();
        boolean b = dataInputStream.readBoolean();
        System.out.println(s);
        System.out.println(i);
        System.out.println(b);

        dataInputStream.close();
    }

    //4- 对象流


}
