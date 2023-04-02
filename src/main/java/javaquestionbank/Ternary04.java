package javaquestionbank;

public class Ternary04 {
    /*
    Type Apex code by using nested ternary.
Write a program to check if a year is a leap year or not.
If the year is divisible by 100 then it must be divisible by 400.
If a year is not divisible by 100 then it must be divisible by 4.
     */
    public static void main(String[] args) {
        int y=2004;
        String leapy=(y%100==0) ? (y%400==0) ? "Leap" :"Not leap" :(y%4==0) ? "leap":"Not leap";
        System.out.println(leapy);
    }
}
