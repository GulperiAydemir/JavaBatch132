package replit;

import java.util.Locale;
import java.util.Scanner;

public class IfQuestion2 {

    public static void main(String[] args) {
        /*
     Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
     (Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

    Input :

    John White 1234234534561478

    Output :

    Name : J*** W****

    CCN  : **** **** **** 1478

//        String name1 = "John White";
//        String creditCardNum = "1234 2345 3456 1478";
//        System.out.println("Name : "+name1.charAt(0)+"*** "+ name1.charAt(5)+"****");
//        if(creditCardNum.length()-3==16){
//            System.out.println("CCN : **** **** **** "+creditCardNum.substring(15,19));
//        }else{
//            System.out.println("Invalid credit card number");

         */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String firstName = input.next().toUpperCase();
//
//        System.out.println("Enter your Surname");
//        String lastName = input.next().toUpperCase();
//
//        System.out.println("Enter your credit card number");
//        String ccn = input.next();
//
//        char first = firstName.charAt(0);
//        char last = lastName.charAt(0);
//        String last4Digits = ccn.substring(ccn.length()-4);
//
//        String outputName = "";
//        String outputSurname = "";
//        String outputCcn = "";
//
//        if(ccn.length()==16){
//            for(int i = 0; i<firstName.length(); i++){
//                if(firstName.charAt(i)==first){
//                    outputName= outputName + first;
//                }else{
//                    outputName = outputName + "*";
//                }
//            }
//            for(int k = 0; k<lastName.length(); k++){
//                if(lastName.charAt(k)==last){
//                    outputSurname = outputSurname + last;
//                }else {
//
//                    outputSurname = outputSurname + "*";
//                }
//            }
//            for(int m = 0; m<ccn.length()-4; m++){
//                if(m==3 || m==7 || m==11){
//                    outputCcn = outputCcn + "* ";
//
//                }else{
//                    outputCcn = outputCcn + "*";
//                }
//
//            }
//
//            System.out.println("Name: " + outputName + " " + outputSurname);
//            System.out.println("CCN: " + outputCcn + last4Digits);
//        }else {
//            System.out.println("Invalid credit card number");
//        }

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please Enter your Name");
//        String name =input.next().toUpperCase();
//        String encodeName= name.charAt(0)+""+ name.replaceAll("[A-Za-z]","*");
//
//        System.out.println("Please Enter your SurName");
//        String userName= input.next().toUpperCase();
//        String encodeUserName=   userName.charAt(0)+""+ userName.replaceAll("[A-Za-z]",
//                "*");
//        System.out.println(encodeName +" "+ encodeUserName);

        //public class creditCardValidation {
//            public static boolean validation(long credit_number) {
//                return (sizecheck(credit_number) == 16); //&&
//                //(sumOfEven(credit_number)+sumOfOdd(credit_number)) % 10 == 0);
//            }
//            public static int sizecheck(long c_num) {
//                String num = c_num+"";
//                return num.length();
//            }
//
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//                Long credit_number;
//                System.out.print("Enter credit card number: ");
//                credit_number = sc.nextLong();
//                Long encode=credit_number;
//                String credit = encode.toString(credit_number);
//                sc.close();
//                System.out.println(credit_number + " is "+ (validation(credit_number) ? "valid":"invalid"));
//                String strCardNumber = "11112222";
//                String strReplacement = "************";
//
//                String newString = strReplacement + credit.substring(12);
//                System.out.println(newString);
//
                Scanner input=new Scanner(System.in);
                System.out.println("enter card number");
                String card =input.next();



                String rep="**************";
                String nstring=rep+card.substring(12);
                System.out.println(nstring);


    }
}








