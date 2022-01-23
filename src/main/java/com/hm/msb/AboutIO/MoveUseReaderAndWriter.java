package com.hm.msb.AboutIO;

import java.io.*;

/**
 * 最终版本 ，文件的copy
 */
public class MoveUseReaderAndWriter {
    public static void main(String[] args) {
        // 1.找到源文件和目标文件
        File fileOld = new File("/Users/zhangyuting/Downloads/test.txt");
        File fileNew = new File("/Users/zhangyuting/Downloads/demo.txt");

        FileReader fileReader = null;
        FileWriter fileWriter = null;
        // 2. 做好"管"----> 因为需要输出也需要输入所以要有2个管子
        try {
            fileReader = new FileReader(fileOld);
            fileWriter = new FileWriter(fileNew);
            // 3. 制造"快递员",并且获取有效长度----> 做个数组一次性读取和输出(因为是字符流所以char【】)
            char[] charRead = new char[8];
            int read = fileReader.read(charRead);
            // 4. "吸"和"吐"-----> 读取数据和输入数据
            while (read != -1) {
                fileWriter.write(charRead, 0, read);
                read = fileReader.read(charRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 5.关闭"管"----> 先用的后关，后用的先关
            try {
                if (fileWriter!=null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileReader!=null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
