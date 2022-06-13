package _366After.src.javeTeacher.IO.file_read_write;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
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
public class File_Read_Write {
    @Test
    //读取XXX.txt文件到终端
    public void test() throws IOException {
        //1-实例话File类的对象，指明要操作的文件
        File file = new File("hello.txt");
        //2-提供一个流(读取文件的Read流)
        FileReader fileReader = new FileReader(file);
        //3- 数据的读入
        //read();返回读入的一个字符，如果达到文件末尾，返回-1
        int data = fileReader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fileReader.read();
        }
    }
}
