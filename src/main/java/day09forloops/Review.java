package day09forloops;

public class Review {
    ///Example 1: Type all integers from 11 to 44 "in the same line" with a space between consecutive integers
    //  11 12 13 14 ... 44
    public static void main(String[] args) {
/*
        for(int i=11;i <45;i++){
            System.out.print(i+" ");
            */
        //Example 2:Type "even integers" from 11 to 44 in the same line with a space between consecutive integers
        for (int i = 11; i < 44; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        }

}
