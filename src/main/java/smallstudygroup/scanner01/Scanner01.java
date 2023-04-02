package smallstudygroup.scanner01;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //1st   Scanner
        Scanner input=new Scanner(System.in);
        //2st
        System.out.println("Enter your age");

        //3st
        byte age= input.nextByte();
        //4st
        System.out.println("your age is : "+age);

    }
}
