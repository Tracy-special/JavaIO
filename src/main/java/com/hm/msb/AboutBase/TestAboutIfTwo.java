package main.java.com.hm.msb.AboutBase;

import java.util.Scanner;

/**
 * 小朋友搬桌子
 * 年龄大于7岁，可以搬桌子
 * 如果年龄大于5岁，并且是男生，可以搬桌子
 * 否则不可以搬动桌子，提示：你太小了！
 *
 *
 * 可以查看test/java/pic下的TestAboutIfTwo.png
 *
 */
public class TestAboutIfTwo {
    public static void main(String[] args) {
        int age = 0;
        String sex = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        if (sc.hasNextInt() == true) {
            age = sc.nextInt();
            System.out.println("请输入你的性别：");
            if (sc.hasNext() == true) {
                sex = sc.next();
                // 比较复杂，可以用数字0或者1代替男或者女，进行判断
                if (sex.equals("男") || sex.equals("女")) {
                    if (age >= 7) {
                        System.out.println("可以搬桌子");
                    } else if (age >= 5 && sex.equals("男")) {
                        System.out.println("可以搬桌子");
                    } else {
                        System.out.println("你太小了！");
                    }
                } else {
                    System.out.println("您输入的性别有误请重新输入");
                }
            }
        } else {
            System.out.println("您输入的年龄有误请重新输入");
        }
    }
}
