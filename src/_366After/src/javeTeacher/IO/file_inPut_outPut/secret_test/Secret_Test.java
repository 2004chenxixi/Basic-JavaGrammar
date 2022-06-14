package _366After.src.javeTeacher.IO.file_inPut_outPut.secret_test;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
对图片进行加密操作
 */
public class Secret_Test {
    @Test
    //加密操作
    public void secretTest() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1- 实例化文件
            File srcFile = new File("方园.jpeg");
            File destFile = new File("方园Secret.jpeg");
            //2- 创建一个读入和写出的流
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(destFile);

            //3- 复制操作+加密操作
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1) {
                //加密--就是在读入的时候，加一个改变的循环
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }
                fileOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4- 关闭流
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
    //对加密和解密--进行封装
    //1- 这里src表示原文件，dest表示 复制原文件，产生的加密文件
    //2- 如果要解密，就把"被加密的文件放在src位置，dest出来的就是解密的文件"
    public void SecretAndDecode(String src, String dest) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1- 实例化文件
            File srcFile = new File(src);
            File destFile = new File(dest);
            //2- 创建一个读入和写出的流
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(destFile);

            //3- 复制操作+加密操作
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1) {
                //加密--就是在读入的时候，加一个改变的循环
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }
                fileOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4- 关闭流
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
    //对上面，封装的加密和解密，进行测试
    public void test3() {
        SecretAndDecode("方园Secret.jpeg", "方园decode.jpeg");
    }
}
