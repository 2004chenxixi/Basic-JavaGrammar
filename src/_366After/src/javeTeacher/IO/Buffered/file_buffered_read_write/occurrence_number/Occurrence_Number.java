package _366After.src.javeTeacher.IO.Buffered.file_buffered_read_write.occurrence_number;

import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
获取文本上"每个字符"出现的次数
提示：便利文本的每个字符；字符及出现的此次保存在Map中；将Map中的数据写入文件
 */
public class Occurrence_Number {
    @Test
    public void test() {
        //1- 创建Map集合
        HashMap<Character, Integer> map = new HashMap<>();

        //2- 便利每一个字符。每一个字符出现的次数，放到Map中
        //获取--XXX文件
        try {
            FileReader fileReader = new FileReader("/Users/ccc/Desktop/testIO/hello.txt");
            int c = 0;
            while ((c = fileReader.read()) != -1) {
                //int 还原 char ：比如读的时候是int = 97 --> 变为char = a
                char ch = (char) c;
                if (map.get(ch) == null) {
                    map.put(ch, 1);
                } else {
                    map.put(ch, map.get(ch) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object obj = iterator1.next();
            //entrySet集合中的元素都是entry
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + " ----> " + entry.getValue());
        }


    }
}


