package day08ternaryswitch;

public class NestedTernary {
    public static void main(String[] args) {
        //Type java code by using nested ternary.
        //Write a program to check if a year is leap year or not.
        //If the year is divisible by 100 then it must be divisible by 400.
        //If a year is not divisible by 100 then it must be divisible by 4.

        int year=1997;

        String r1=year%100==0  ? (year%400==0 ? "leap" : "not leap"):   (year%4==0   ? "leap" : "not leap" ) ;
        System.out.println("Is the year leap year? "+ r1);

        /*
        Type code to check the password
        If it has more than 8 characters, initial should be ‘i’
        If it has no more than 8 characters initial should be ‘K’
        Solve the task by using nested-ternary


         */
     String pwd="ia1b3c";
     String r2=pwd.length()>8?(pwd.startsWith("i")?"Valid Password":"Invalid password"):(pwd.startsWith("K")?"Valid Password":"Invalid password");
        System.out.println(r2);



    }
}
