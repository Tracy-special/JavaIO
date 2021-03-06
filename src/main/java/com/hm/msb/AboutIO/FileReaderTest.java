package main.java.com.hm.msb.AboutIO;

import java.io.File;
import java.io.IOException;


/**
 * 完成文件的转移（文件--->程序）
 * 功能分解
 *  1. 将文件内容先copy到程序中
 *    a. 找到文件目录 ----> 创建File类的对象
 *    b. 找一根"管"，连接到源文件上---->创建一个访问文件的字符输入流FileReader对象
 *    c. "吸"----> 读取内容（把内容读取到程序中）----> 因为是字符流所以最后的数据类型是int，并且每次只能读取内容中一个字并把它的ASCII码输出，
 *                                                可运用循环输出所有内容，当到了文件的结尾处时，会输出为-1（读取内容为-1），可以用这个作
 *                                                为循环条件进行判断循环（第一种方法）
 *                                                定义一个数组，这样就可以一次性读取所有。（第二种方法）
 *    d. "管"已经没用了，就不要它了---->关闭流
 */
public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        File file=new File(File.separator+"Users"+File.separator+"zhangyuting"+File.separator+"Downloads"+File.separator+"test.txt");
        java.io.FileReader fileReader=new java.io.FileReader(file);

      /* 方式一
      int read = fileReader.read();// 只读取一个字符
      while(read!=-1){
            System.out.println((char)read);
            read=fileReader.read();
        }
        或者
        int n;
        while((n=fileReader.read())!=-1){
            System.out.println((char) n);
        }
        */
        //方式二 引入一个"快递员"的小车，这个小车一次拉满8个货物
        char[] chars=new char[8];
        int read = fileReader.read(chars);//一次读取8个字符，返回值为这个数组中的有效长度(有效长度意思是，算出这个数组中非空字符为几个)
        while(read!=-1){
           /* 错误方式--->这样会轮流输出文件中的内容直到8个全满，如果文件中没有8个字符只有6个字符，那剩下的两个输出空（如Abc乌拉拉  ）
           for (int i = 0; i < args.length ; i++) {
                System.out.println(chars[i]);
            }*/
           /* 正确方式一
            for (int i = 0; i < read ; i++) {
                System.out.println(chars[i]);
            }*/

            // 正确方式二 从0读取到有效字符数结束
            String s=new String(chars,0,read);
            System.out.println(s);
            read=fileReader.read(chars);
        }
        fileReader.close();
    }
}
