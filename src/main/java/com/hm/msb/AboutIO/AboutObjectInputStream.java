package com.hm.msb.AboutIO;

import java.io.*;

public class AboutObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 将文件中保存的字符串读入到内存中
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("/Users/zhangyuting/Downloads/test1.txt")));
        // 读取
        Object s = ois.readObject();
        System.out.println(s);
        
        // 关闭流
        ois.close();
    }
}
