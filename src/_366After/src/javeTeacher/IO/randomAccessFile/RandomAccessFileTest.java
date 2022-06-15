package _366After.src.javeTeacher.IO.randomAccessFile;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
RandomAccessFile的使用
1- RandomAccessFile直接继承与java.lang.Object类的实现DataInput和DataOutput接口
2- RandomAccessFile 既可以做一个"输入流"，也可以做一个"输出流"
使用的小细节：
   1- 使用- RandomAccessFile会有两个参数
   2- 参数-mode： r-只能读
                 rw-读入和写出
                 rwd-读入和写出，同步文件内容的更新
                 rws：读入和写出，同步文件内容和原数据的更新

3- 如果使用-RandomAccessFile作为"输出流"时，写出的文件如果不存在，则在执行过程中自动创建
   如果写出到的文件存在，则会对原有文件内容进行覆盖（默认情况下，重头覆盖），重头，可以用-seek方法

4- 可以通过相关操作，实际-RandomAccessFile"插入"数据的效果

 */
public class RandomAccessFileTest {
    @Test
    public void test1() {
        RandomAccessFile randomAccessFile1 = null;
        RandomAccessFile randomAccessFile2 = null;
        try {
            //使用-RandomAccessFile-复制操作（主要测试：r、rw）
            //1-
            randomAccessFile1 = new RandomAccessFile(new File("方园.jpeg"), "r");
            randomAccessFile2 = new RandomAccessFile(new File("方园2.jpeg"), "rw");
            //2-
            byte[] r = new byte[1024];
            int len;
            while ((len = randomAccessFile1.read(r)) != -1) {
                randomAccessFile2.write(r);
            }
            System.out.println("复制成功-Success");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (randomAccessFile1 != null)
                try {
                    randomAccessFile1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (randomAccessFile2 != null)
                try {
                    randomAccessFile2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
/* 3- 4（代码块略）
3- 如果使用-RandomAccessFile作为"输出流"时，写出的文件如果不存在，则在执行过程中自动创建
    如果写出到的文件存在，则会对原有文件内容进行覆盖（默认情况下，重头覆盖），重头，可以用-seek方法

4- 可以通过相关操作，实际-RandomAccessFile"插入"数据的效果
     */
}
