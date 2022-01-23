package main.java.com.hm.msb.AboutBase;

public class TestAboutWhile {
    public static void main(String[] args) {
        /**
         * 1. 用while从1加到100
         */
        // int i = 0;
        // int sum = 0;
        // while (i <= 100) {
        //     sum += i;
        //     i++;
        // }
        // System.out.println(sum);


        /**
         * 2. 用while从2+4+6+8...+998+1000
         */
        // int i = 2;
        // int sum = 0;
        // while (i <= 1000) {
        //     sum += i;
        //     i +=2;
        // }
        // System.out.println(sum);


        /**
         * 3. 用while从5+10+15+。。。100
         */
        // int i=5;
        // int sum=0;
        // while(i<=100){
        //     sum+=i;
        //     i+=5;
        // }
        // System.out.println(sum);


        /**
         * 4. 用while从1*3*5*7*9*11*13
         */
        int i = 1;
        int product = 1;
        while (i <= 13) {
            product *= i;
            i += 2;
        }
        System.out.println(product);
    }


}
