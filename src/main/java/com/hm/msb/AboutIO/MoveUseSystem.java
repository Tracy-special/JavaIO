package main.java.com.hm.msb.AboutIO;

import java.io.*;

/**
 * 从控制台输入，存入文件
 */
public class MoveUseSystem {
    public static void main(String[] args) throws IOException {
        // 1. 输入方向
        InputStream inputStream = System.in;
        InputStreamReader isr=new InputStreamReader(inputStream);
        BufferedReader br=new BufferedReader(isr);

        // 2. 输出方向
        File file=new File("/Users/zhangyuting/Downloads/control.txt");
        FileWriter fw=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fw);

        // 3.开始行动
        String readLine = br.readLine();
        while(!readLine.equals("exit")){
            bw.write(readLine);
            bw.newLine();//在文件中换行
            readLine = br.readLine();
        }

        // 4.关闭
        bw.close();
        br.close();

    }
}
