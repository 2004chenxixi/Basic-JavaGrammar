package _366After.src.javeTeacher.IO.Buffered;

import org.testng.annotations.Test;

import java.io.*;

/*
1- 对 --字节流，进行"缓冲流"的操作
2- 作用：提供缓冲流来读取和写入
     提高读写速度的原因：内部提供了一个缓冲区
 */
public class File_Buffered_Input_And_OutPut {
    public void test() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1-对文件的实例化
            File srcFile = new File("方园.jpeg");
            File destFile = new File("方园2.jpeg");
            //2- 造-节点流
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(destFile);
            //2.5- 造缓冲流
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            //3- 复制的细节，读取，写入
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer);
            }
            System.out.println("复制成功-Success");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4- 关闭流（只要关闭外层的流）
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (fileOutputStream != null)
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    //把上面--Buffered字节流-的封装
    public void BufferInputAndOutput(String src, String dest) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1-对文件的实例化
            File srcFile = new File(src);
            File destFile = new File(dest);
            //2- 造-节点流
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(destFile);
            //2.5- 造缓冲流
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            //3- 复制的细节，读取，写入
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer);
            }
            System.out.println("复制成功-Success");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4- 关闭流（只要关闭外层的流）
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (fileOutputStream != null)
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    @Test
    //测试上面的封装
    public void test10() {
        long start = System.currentTimeMillis();
        BufferInputAndOutput("方园.jpeg", "方园2.jpeg");
        long end = System.currentTimeMillis();
        //执行了多少秒
        System.out.println("复制一份文件，执行了 = " + (end - start) + " 秒");
    }
}
