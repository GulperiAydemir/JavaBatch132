package ssgloop;

public class Swap {
    public static void main(String[] args) {

        int x=5;
        int b=7;

//        int sum=x;
//        x=b;
//        b=sum;
//        System.out.println(x);
//        System.out.println(b);
        //2.way;

        x=x+b;
        b=x-b;
        x=x-b;
        System.out.println(x);
        System.out.println(b);

    }
}
