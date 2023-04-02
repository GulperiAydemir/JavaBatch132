package replit;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter your Name");
        String name = input.next().toUpperCase();
        String encodeName = name.charAt(0) + "" + name.replaceAll("[A-Za-z]", "*");
        String userName = input.next().toUpperCase();
        String encodeUserName = userName.charAt(0) + "" + userName.replaceAll("[A-Za-z]",
                "*");

        System.out.println(encodeName + " " + encodeUserName);

        System.out.println("Enter your credit card number");
        String ccn = input.next();
        String last4Digits = ccn.substring(ccn.length() - 4);
        String outputCcn = "";

        if (ccn.length() == 16) {
            for (int i = 0; i < ccn.length() - 4; i++) {

                if (i == 3 || i == 7 || i == 11) {

                    outputCcn = outputCcn + "* ";
                }else{
                    outputCcn = outputCcn + "*";
                }
            }

            System.out.println("CCN: " + outputCcn + last4Digits);

        }else{

            System.out.println("Invalid credit card number");
        }
    }
}
