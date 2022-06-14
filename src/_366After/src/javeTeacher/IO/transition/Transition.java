package _366After.src.javeTeacher.IO.transition;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
这个是转换流
将"字节流"和"字符流"相互转化
InputStreamReader --> 将"字节流"转换为"字符流"。是"字节流"通向"字符流"的桥梁
OutputStreamWriter -->将"字符流"转换为"字节流"。(这里注意是将"字符流")是"字符流"通向"字节流"的桥梁



 */
public class Transition {
    @Test
    //本来为了安全，应该要写try-catch，为了代码简洁，略了
    public void test() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("/Users/ccc/Desktop/testIO/hello.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/ccc/Desktop/testIO/hello-Translation.txt");

        //包一个"转化流"
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "gbk");

        //读写
        char[] cbuf = new char[1024];
        int len;
        while ((len = inputStreamReader.read(cbuf)) != -1) {
            outputStreamWriter.write(cbuf);
        }
        inputStreamReader.close();
        outputStreamWriter.close();


    }
}
