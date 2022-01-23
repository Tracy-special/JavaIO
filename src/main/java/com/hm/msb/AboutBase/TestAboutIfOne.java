package main.java.com.hm.msb.AboutBase;

import java.util.Scanner;

/**
 * 可以查看test/java/pic下的TestAboutIfOne.png
 */
public class TestAboutIfOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        // for (int i = 0; i < 8; i++) {  条件语句错误
        System.out.println("请输入会员积分：");
        if (sc.hasNextInt() == true) {
            score = sc.nextInt();
            if (score >= 0) {
                // 方式一
                String discount = "";
                if (score >= 8000) {
                    discount = "6折";
                    // System.out.println("该会员享受的折扣是：6折");有了更简便的方式就不用每次都写这句话了
                } else if (score >= 4000) {
                    discount = "7折";
                    // System.out.println("该会员享受的折扣是：7折");
                } else if (score >= 2000) {
                    discount = "8折";
                    // System.out.println("该会员享受的折扣是：8折");
                } else {
                    discount = "9折";
                    // System.out.println("该会员享受的折扣是：9折");
                }
                System.out.println("该会员享受的折扣是：" + discount);
            } else {
                System.out.println("很抱歉您输入错误请重新输入 ");
            }
        } else {
            System.out.println("很抱歉您输入错误请重新输入 ");
        }
    }
}
