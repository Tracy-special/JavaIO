package main.java.com.hm.msb.AboutIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 完成文件的转移（程序--->文件）
 * 功能分解
 * 2.将程序中的文字内容输送到文件中
 * a.首先得有个文件-->如果目标文件不存在，会自动创建文件。如果存在,
 * b.将"管"插入到文件中
 * c.开始输出到文件
 */
public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/zhangyuting/Downloads/demo.txt");
        FileWriter fileWriter = new FileWriter(file);
        String s = "你好呀hhh";
        for (int i = 0; i < s.length(); i++) {
            fileWriter.write(s.charAt(i));
        }
        fileWriter.close();
    }
}
