package main.java.com.hm.msb.AboutBase;

public class DoubleAdd {
    public static void main(String[] args) {
        // ++单独使用的时候，无论在前或者在后，都是+1操作
        int a = 1;
        ++a;
        System.out.println(a);

        int b = 1;
        b++;
        System.out.println(b);


        // ++使用到运算中，看++在前还是在后，如果在前：先+1后运算，如果在后：先运算后+1
        a = 1;
        int c = a++ + 2; // 先运算（c=a+2） 在+1（a=a+1）
        System.out.println("c=" + c);// 3
        System.out.println("a=" + a);// 2

        a = 1;
        int d = ++a + 2;// 先+1（a=a+1） 在运算（d=a+2）
        System.out.println("d=" + d);// 4
        System.out.println("a=" + a);// 2


        /**
         * 练习
         * ++的优先级大于+
         * e++是先运算5，后e+1=6，后 e变成7
         */
        int e = 5;
        System.out.println(e++ + e++);// 5+6=11，e则变成7
        System.out.println(e++ + ++e);// 7+9=16，e变成9
        System.out.println(++e + e++);//10+10=20，e变成11
        System.out.println(++e + ++e);//12+13=25，e变成13
        System.out.println(e);//13


        ////////////////////////////////////////////////////////////////////////////

        int sum = 0;
        int o = 6;
        sum += o;//相当于 sum =  sum + o； 输出：6
        System.out.println(sum);
        sum /= o;//相当于 sum =  sum / o； 输出：1
        System.out.println(sum);
        sum -= o;//相当于 sum =  sum - o； 输出：-5
        System.out.println(sum);
        sum *= o;//相当于 sum =  sum * o； 输出：-30
        System.out.println(sum);
    }
}
