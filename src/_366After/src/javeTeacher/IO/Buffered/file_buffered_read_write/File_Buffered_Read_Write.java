package _366After.src.javeTeacher.IO.Buffered.file_buffered_read_write;

/*
处理流之一：缓冲流的使用

1- 对 --"字符"流，进行"缓冲流"的操作
2- 作用：提供缓冲流来读取和写入
        提高读写速度的原因：内部提供了一个缓冲区

3-处理流：就是"套接"在已有的流的基础上
 */

import org.testng.annotations.Test;

import java.io.*;

public class File_Buffered_Read_Write {
    @Test
    public void test() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            //1- 实例化--文件
            File srcFile = new File("方园.jpeg");
            File destFile = new File("方园2.jpeg");
            //2- 提供一个读取和输入的流
            FileReader fileReader = new FileReader(srcFile);
            FileWriter fileWriter = new FileWriter(destFile);

            //2.5 提供一个"缓冲"流
            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);

            //3- 复制操作
            //方法一、
//            char[] buffer = new char[1024];
//            int len;
//            while ((len = bufferedReader.read(buffer)) != -1) {
//                bufferedWriter.write(buffer);
//            }
            //方法二、
            String data;
            while ((data = bufferedReader.readLine()) != null)
                bufferedWriter.write(data + "\n");
            System.out.println("复制成功-Success");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4- 关闭（外部）的流
            if (bufferedReader != null)
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (bufferedWriter != null)
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }


    }
}
