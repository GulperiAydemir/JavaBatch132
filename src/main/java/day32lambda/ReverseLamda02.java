package day32lambda;

import java.util.stream.IntStream;

public class ReverseLamda02 {
    public static void main(String[] args) {

        System.out.println(sum(7,70));
    }
    public static int sum(int start,int finis){
        return IntStream.rangeClosed(start,finis).sum();
    }
    public static int sumEven(int start,int finis){

        return IntStream.rangeClosed(start,finis).filter(t->t%2==0).sum();
    }



}

