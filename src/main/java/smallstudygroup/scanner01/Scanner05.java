package smallstudygroup.scanner01;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        // Question 6) ask from  user's name and surname and print the initials of his name and surname.
        //output ALi Can :The first letter of the name and surname you entered: A C
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter name");
        char name=input.next().charAt(0);

        System.out.println("Please enter surname");
        char surName=input.next().charAt(0);



        System.out.println(name+ " "+surName);


    }
}
