### IO流
#### io主要：输入和输出
### 对于文本文件（.txt、.java、.c、.c++这些属于文本文件），可以拿-字符流来读
### 对于非文本文件（.jpg、.mp3、.mp4、.avi、.doc、.ppt这些属于非文本文件），可以拿--字节流来读

水池  ---  垃圾水管  --- 垃圾水管外面包透明胶 ---  下水道
文件(总) -----节点流(总)   ---- 处理流(总) -------反馈(总)
              字符流          字符流的缓冲流
              字节流          字节流的缓冲流

二、流的体系结构
抽象基类                      节点流(或者文件流)                                    缓冲流(处理流的一种)
InputStream              FileInputStream(read(byte[] buffer))                    BufferedInputStream(read(byte[] buffer))
OutputStream             FileOutputStream(write(byte[] buffer,0,len))            BufferedOutputStream(write(byte[] buffer,0,len))
Reader                   FileReader(read(byte[] buffer))                         BufferedReader(read(byte[] buffer)/readLine)
Writer                   FileWrite(write(byte[] buffer,0,len))                   BufferedWrite(write(byte[] buffer,0,len))