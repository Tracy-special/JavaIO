package com.hm.msb.AboutIO;

import java.io.*;

/**
 * 将基本数据类型以及对象写入内存
 */
public class AboutObjectOutputStream {
    public static void main(String[] args) throws IOException {
        Person person=new Person("lili",18);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/Users/zhangyuting/Downloads/test1.txt")));
        // 将内存中的字符串写入文件中
       oos.writeObject(person);
        // 关闭流
        oos.close();
    }
}
