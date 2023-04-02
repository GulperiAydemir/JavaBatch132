package day17methodoverloadingdatetimeclasses;

public class MethodCreation {
    public static void main(String[] args) {
        //Actual values used in method paranthesis are called "arguments"

       int r1=addTwoInt(3,5);
       System.out.println(r1);//8

       String r2=firstAndLastChar("Angelina Jolie");
       System.out.println(r2);

       int r3=getSumOfAsciis("Ajda");
        System.out.println(r3);


    }

    //Example1:Create a method adds two integers
    //Variables used in method paranthesis are called"parameters"
    public static int addTwoInt(int a, int b){
        return a+b;


    }
    //Create a method prints the first and the last character on the console
    public static String firstAndLastChar(String s){
    String result=s.charAt(0)+ " "+s.charAt(s.length()-1);
    return result;
    }

    //Create a method prints the sum of the ASCII values of characters in a String


    public static int getSumOfAsciis(String s){
        int sumOfAscii=0;
        for(int i=0; i<s.length();i++){
            sumOfAscii=sumOfAscii+s.charAt(i);

        }
        return sumOfAscii;
    }


}
