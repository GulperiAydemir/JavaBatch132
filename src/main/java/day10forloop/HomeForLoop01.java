package day10forloop;

public class HomeForLoop01 {
    //Example 1: Type code to calculate the multiplication of integers from 3 to 6
    //           3*4*5*6 ==> 360
    public static void main(String[] args) {


        int multiplication=1;
        for(int i=3 ;i<7 ;i++){
            multiplication=i*multiplication;

        }

        System.out.println(multiplication);

        //Example 2: Type code to find  the sum of the digits in a given integer
        //           578 ==> 5+7+8=20

        int num=578;
        int sumOfDigits=0;

        for(int i=num; i>0; i=i/10) {
            sumOfDigits = sumOfDigits + i%10;
        }
        System.out.println(sumOfDigits);
    }

}
