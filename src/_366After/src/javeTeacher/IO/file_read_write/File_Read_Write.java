package _366After.src.javeTeacher.IO.file_read_write;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
一、流的分类
1- 操作数据单位：字节流、字符流
2- 数据流线：输入流、输出流
3- 流的角色：节点流、处理流

二、流的体系结构
抽象基类           节点流(或者文件流)        缓冲流(处理流的一种)
InputStream        FileInputStream       BufferedInputStream
OutputStream       FileOutputStream      BufferedOutputStream
Reader             FileReader            BufferedReader
Writer             FileWrite             BufferedWrite

 */
//下面都是--字符流来处理
//缺点，不能处理图片，视频
//优点，可以读汉字
public class File_Read_Write {
    /*
    一、 "读取"XXX.txt文件到终端(但是，这种效率不高 */

    @Test
    //public void test() throws IOException { ----> throws报，不严谨
    public void test() {
        FileReader fileReader = null;
        try {
            //1-实例话File类的对象，指明要操作的文件
            File file = new File("hello.txt");
            //2-提供一个流(读取文件的Read流)
            fileReader = new FileReader(file);
            //3- 数据的读入
            //read();返回读入的一个字符，如果达到文件末尾，返回-1
            int data = fileReader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fileReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4- 流的关闭
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /*
    二、 "读取"XXX.txt文件到终端( ---> 效率稍微高---用char[]数组) */
    @Test
    public void test2() {
        FileReader fileReader = null;
        try {
            //1-实例话File类的对象，指明要操作的文件
            File file = new File("hello.txt");
            //2-提供一个流(读取文件的Read流)
            fileReader = new FileReader(file);
            //3- 数据的读入
            //read();返回读入的一个字符，如果达到文件末尾，返回-1
            //使用数组
            char[] cbuf = new char[5];
            int len;
            while ((len = fileReader.read(cbuf)) != -1) {
                //方式一
                //            for (int i = 0; i < len; i++) {
                //                System.out.print(cbuf[i]);
                //            }
                //方式二、
                String str = new String(cbuf, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4-关闭流
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    /*
    "写出"
    上面是，"读取"，读取桌面文件
    现在是，输出出去 --> 从内存写出数据到硬盘中

细节：2-提供FileWriter的对象，用于数据的写出---用FileWriter流的细节
     如果流使用的构造器是：FileWriter(file, flase) / FileWriter(file); 会对原来的文件覆盖
     如果流使用的构造器是：FileWriter(file, true)  不会对原来的文件覆盖，而是在原来的文件基础追加内容

     */
    public void test3() throws IOException {

        //1- 体验File类的对象，指明 --> 写出到的文件
        File file = new File("/hello.txt");
        //2-提供FileWriter的对象，用于数据的写出---用FileWriter流
        FileWriter fileWriter = new FileWriter(file, true);
        //3-写出的操作
        fileWriter.write("我需要辟邪剑法\n");
        fileWriter.write("不\n");
        fileWriter.write("你需要葵花宝典");
        //4- 关闭流
        fileWriter.close();
    }

    @Test
    /*
    文件的复制
     */
    public void test4() {
        //1- 指明，输入和输出的文件
        /*
        下面对文件复制的使用：
        1- 选择需要复制的文件 --pwd，知道他的路径
        2-如我下面的例子，我是在testIO，里面复制已有文件-hello.txt  ---- 复制到"同目录下"取名为-hello2.txt
        所以，我("/Users/ccc/Desktop/testIO","hello2.txt"),前面部分是文件路径，后面是要取名的文件
         */
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            File FileSrc = new File("/Users/ccc/Desktop/testIO/hello.txt");
            File FileDest = new File("/Users/ccc/Desktop/testIO", "hello2.txt");
            //2- 创建输入和输出的--流
            fileReader = new FileReader(FileSrc);
            fileWriter = new FileWriter(FileDest);

            //3-数据的-读/写操作

            char[] sbuf = new char[13];
            int len;
            while ((len = fileReader.read(sbuf)) != -1) {
                fileWriter.write(sbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //4- 关闭流--两个close，分别try-catch就可以
        try {
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
