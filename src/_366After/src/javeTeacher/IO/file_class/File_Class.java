package _366After.src.javeTeacher.IO.file_class;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
File类的使用：
File类的一个对象：代表  "一个文件"  或者  "一个文件目录(俗话：文件夹)"

1- 如何创建File文件
    看下面--3种构造器

2-相对路径
  绝对路径

3- 路径分割符号
    window：\\
    unix:/
 */
public class File_Class {
    //获取信息
    public void test1() {
        //1- 构造器一
        File file1 = new File("hello.txt"); //相对路径
        File file2 = new File("/Users/ccc/Desktop/student.java/src/_366After/src/javeTeacher/IO");//绝对路径

        //2- 构造器二
        File file3 = new File("/Users/ccc/Desktop/student.java/src/_366After/src/javeTeacher", "IO");//文件夹
        File file4 = new File("/Users/ccc/Desktop/student.java/src/_366After/src/javeTeacher", "hi.txt");//文件

        //3- 构造器三
        File file5 = new File(file3, "hi.txt");

    }

    @Test
    //1- --------->  获取文件基本信息
    public void test2() {
        File file1 = new File("hello.txt"); //相对路径
        System.out.println(file1.getAbsoluteFile());//获取"绝对路径"
        System.out.println(file1.getPath());//获取文件的路径
        System.out.println(file1.getName());//获取文件名称
        System.out.println(file1.getParent());//获取上层文件目录的路径，如果无，返回null
        System.out.println(file1.length());//获取文件长度，不能获得目录的长度
        System.out.println(new Date(file1.lastModified()));//最后修改时间
    }

    @Test
    //-------- >  获取某个"文件夹"内部文件
    //2- 适用与 --文件夹
    //public  String[]  list();
    //public File[]  listFiles();
    public void test() {
        //1- 获取，该路径下的文件
        File file = new File("/Users/ccc/Desktop/student.java");
//内容一、
        String[] list = file.list();
        for (String file1 : list) {
            System.out.println("获取某个文件的信息，= " + file1);
        }

        System.out.println("————————————————————————");
//内容二、（推荐）
        File[] files = file.listFiles();
        for (Object file1 : files) {
            System.out.println("获取某个文件的信息，= " + file1);
        }
    }

    @Test
    //------->  文件的移动
    public void test3() {
        /*
        public boolean  renameTo（File dest）：把文件转移到的另一个文件路径
           比如：file1.renameTo(file2)
               要保证true，file1在硬盘中是存在的，file2不能存在
         */

        //细节(file1,真是存在)---内容写：（某个文件夹下的--某个文件）
        File file1 = new File("/Users/ccc/Desktop/testIO/hi.txt");
        //细节(file2,这个文件不能存在，但是文件夹要真是存在，我下面写的"hiiii.txt"，是迁移顺便改名，如果不想改名，和原文件名一样就可以)
        File file2 = new File("/Users/ccc/Desktop/testIO2/hiiii.txt");

        boolean b = file1.renameTo(file2);
        System.out.println(b);//true，转移成功
    }

    @Test
    // ----->  判断，某个文件的基本信息
    public void test4() {
        File file = new File("/Users/ccc/Desktop/testIO2/hiiii.txt");
        System.out.println(file.isDirectory()); //判断是否是文件目录
        System.out.println(file.isFile());//判断是否是文件
        System.out.println(file.exists());//判断是否可读
        System.out.println(file.canRead());//判断是否可写
        System.out.println(file.canWrite());//判断是否是隐藏文件
    }

    @Test
    //------>  创建文件
    /*
    creatNewFile:----创建"文件"，如果文件存在，就不创建，返回false
     */
    public void test5() throws IOException {

        //1- 文件的创建
        File file = new File("hello.txt");
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("创建成功");
        } else {
            file.delete();
            System.out.println("删除成功");
        }
    }

    /*
    总结：mkdir、mkdirs
            创建单个目录 --mkdir
            创建多个目录 --mkdirs
     */
    @Test
    public void test6() {
        //1- ---创建目录--mkdir
        /*
        mkdir():----创建"文件目录"如果文件目录存在，就不创建
         */
        File file1 = new File("/Users/ccc/Desktop/testIO/dao1");
        boolean mkdir = file1.mkdir();
        if (mkdir) {
            System.out.println("创建成功1");
        } else {
            System.out.println("你已经有该文件，不需要创建");
        }
    }

    @Test
    //2- 创建目录--mkdirs
    /*
    mkdirs():----创建"文件目录"如果文件目录存在，就不创建
     */
    public void test7() {
        //2- mkdir():和mkdirs():的区别
        File file2 = new File("/Users/ccc/Desktop/testIO/dao1/dao2");
        //1- 我要求在testIO/dao1/dao2，如果使用mkdir--> 会因为没有dao1，而创建失败
        boolean mkdir2 = file2.mkdir();
        if (mkdir2) {
            System.out.println("创建成功---mkdir");
        } else {
            System.out.println("创建失败");
        }

        //2- 我要求在testIO/dao1/dao2，如果使用mkdirs--> 不会因为没有dao1，而创建失败，他会创建dao1，再创建dao2
        File file3 = new File("/Users/ccc/Desktop/testIO/dao3/dao4");
        boolean mkdir3 = file3.mkdirs();
        if (mkdir3) {
            System.out.println("创建成功--mkdirs");
        } else {
            System.out.println("你已经有该文件，不需要创建");
        }


    }
}
