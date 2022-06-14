package _366After.src.javeTeacher.IO.other.object;

import org.testng.annotations.Test;

import java.io.*;

/*
对象流
1- ObjectInputStream 和 ObjectOutputStream
ObjectInputStream -- 序列化---"保存""基本数据类"或者"对象"的机制
ObjectOutputStream --反序列化 --"读取""基本类型数据"或者"对象"的机制

2- 作用：用于"储存和读取--基本数据类型"或者"对象"的处理流。他的强大之处就是可以吧java中的对象写到数据源中
     也可以吧对象从数据源汇总还原回来。
 */
public class Object_InputOutputStreamTest {
    @Test
    public void testObjectOutputStream() {
        //序列化
        //-将终端中的java对象，保存到文件形式 --（写出的形式）
        ObjectOutputStream objectOutputStream = null;
        try {
            //1-
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("Object.txt"));
            //2-
            objectOutputStream.writeObject(new String("我爱你-我滴宝"));
            //3-
            objectOutputStream.flush();//刷新
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream != null) {
                try {
                    //4-
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } //创建的-Object.txt不能"双击"直接打开看，如果想看，要用"反序列化"来看
    }

    @Test
    public void testObjectInputStream() {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(new File("Object.txt")));
            Object read = objectInputStream.read();
            //String s = (String) read;
            System.out.println("对上面的文件，进行反序列化的内容 = " + read);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream != null)
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
    //附加：如果那些要对"自定义类"，进行，反序列化操作  eg：person、account
    //1- 在"自定义类"上要实现 --接口：Serializable
    //2- 单曲类提供一个，全局变量：serialVersionUID
    //3- 除了"第一个类person"如果后面还有dog、cat类，都需要执行（上面1-2）操作，必须保证内部属性也是必须可序列号的
    //（默认情况，基本数据类型可序列号）

}
