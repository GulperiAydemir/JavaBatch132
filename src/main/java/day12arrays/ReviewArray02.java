package day12arrays;

import java.util.Arrays;

public class ReviewArray02 {
    public static void main(String[] args) {
        //Example 2: Create an integer array, type code to find the sum of the min and the max value.
        //           [12, 45, 9, 56] ==> 9+56=65


        int number[]=new int[4];

        number[0]=12;
        number[1]=45;
        number[2]=9;
        number[3]=56;
        System.out.println(Arrays.toString(number));
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        int sumofminmax=number[0]+number[number.length-1];
        System.out.println(sumofminmax);


        /*
        int minValue=number[0];

      int maxValue=number[0];


        for(int w:number){
            minValue=Math.min(minValue,w);
           maxValue=Math.max(maxValue,w);

            System.out.println(minValue+maxValue);

         */

        }
    }

