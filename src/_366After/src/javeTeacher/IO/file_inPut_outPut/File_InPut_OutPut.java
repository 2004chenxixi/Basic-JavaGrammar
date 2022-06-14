package _366After.src.javeTeacher.IO.file_inPut_outPut;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//字节流
//优点，可以读视频和图片
public class File_InPut_OutPut {
    @Test
    // 复制"图片"
    public void test1() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1- 读，写的两个文件-实例化
            File srcFile = new File("方园.jpeg");
            File destFile = new File("方园1.jpeg");

            //2- 给读取，写出--一个流
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(destFile);
            //3- 复制操作
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
            }
            System.out.println("复制成功---Success");
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

    //指定路径下的文件复制(----- 方法的封装)
    public void copyFile(String srcPath, String destPath) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1- 读，写的两个文件-实例化
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            //2- 给读取，写出--一个流
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(destFile);
            //3- 复制操作
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
            }
            System.out.println("复制成功---Success");
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
    public void Copy() {
        long start = System.currentTimeMillis();
        copyFile("方园.jpeg", "方园2.jpeg");
        long end = System.currentTimeMillis();
        //执行了多少秒
        System.out.println("复制一份文件，执行了 = " + (end - start) + " 秒");

    }
}
