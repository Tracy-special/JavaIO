package main.java.com.hm.msb.AboutBase;
public class RandomT {
    public static void main(String[] args) {
        //随机数都在Math方法中
        double rOne = Math.random();//[0,1)大于等于0，小于1
        System.out.println(rOne);
        double rTwo = Math.random() * 6;//[0,5]大于等于0，小于等于5
        System.out.println(rTwo);
        int rThree = (int) (Math.random() * 6) + 1;//[1,6]大于等于1，小于等于6，并强转为int类型。
        System.out.println(rThree);

        //练习 32-98的随机数,[0,66]+32
        int v = (int)(Math.random() * 67) + 32;
    }
}
