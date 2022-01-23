package main.java.com.hm.msb.AboutBase;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 做出日历特效
 */
public class DateTestOne {
    public   static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入日期：（格式为2019-05-07）");
        String dateTime = scanner.next();

        // 1.把String转型成Date
        java.sql.Date date = java.sql.Date.valueOf(dateTime);
        // 2.Date转型成Calender (getInstance相当于创建出一个Calender对象)
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);

        // 后续操作
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        //引入一个计时器 以及获取输入时间上日
        int count = 0;


        int scanDate = calendar.get(Calendar.DATE);
        // 3.算出输入日期最大天数
        int maxDate = calendar.getActualMaximum(calendar.DATE);

        // 7.把日期调为本月的1号，再查询这个一号是本周的第几天（注意是从周日开始的）所以-1相当于前面空出来的天数，位置不可以放在3之前不然报错
        calendar.set(Calendar.DATE, 1);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int day = dayOfWeek - 1;
        for (int i = 1; i <= day; i++) {
            System.out.print("\t");
        }
        count = count + day;
        // 4.遍历1到最大的数字
        for (int i = 1; i <= maxDate; i++) {
            // 6.标注输入的日期+星号
            if (i == scanDate) {
                System.out.print(i + "*" + "\t");
            } else {
                System.out.print(i + "\t");
            }
            count++;//控制台输出一个字，计数器+1
            // 5.一周七天，到7的时候换行操作
            if (count % 7 == 0) {
                System.out.println();
            }
        }

    }

}
