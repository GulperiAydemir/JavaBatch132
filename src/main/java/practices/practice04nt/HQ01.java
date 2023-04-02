package practices.practice04nt;

import java.util.Scanner;

public class HQ01 {
    public static void main(String[] args) {

        //Type a code to print its season after getting a month from the user

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a month");
        String month=input.next().toLowerCase();

        if (month.equals("September")|| month.equals("October")|| month.equals("November")){
            System.out.println("Autumun");
        }else if(month.equals("December")|| month.equals("january")|| month.equals ("February")){
            System.out.println("Winter");

        }else if(month.equals("March")|| month.equals("April")|| month.equals ("may")) {
            System.out.println("spring");
        }else{
            System.out.println("please enter valid name");
        }




    }
}
