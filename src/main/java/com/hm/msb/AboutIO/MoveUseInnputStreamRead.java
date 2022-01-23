package com.hm.msb.AboutIO;

import java.io.*;

/**
 * 运用转换流进行文件的复制
 */
public class MoveUseInnputStreamRead {
    public static void main(String[] args) throws IOException {
        // 1. 找到源文件
        File fileOld = new File("/Users/zhangyuting/Downloads/test.txt");

        // 2.有个目标文件
        File fileNew = new File("/Users/zhangyuting/Downloads/demo.txt");

        // 3.输入"管"----> 一个输入转换流 一个输出字节流
        FileInputStream fis = new FileInputStream(fileOld);
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");

        // 4.输出"管"----> 一个输出转换流 一个输出字节流
        FileOutputStream fos = new FileOutputStream(fileNew);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");

        // 5.开始行动
        char[] chars = new char[20];
        int read = isr.read(chars);
        while (read != -1) {
            for (int i = 0; i < read; i++) {
                osw.write(chars, 0, read);
                read = isr.read();
                System.out.print(chars[i]);
            }
        }

        // 6.关闭
        osw.close();
        isr.close();
    }
}
