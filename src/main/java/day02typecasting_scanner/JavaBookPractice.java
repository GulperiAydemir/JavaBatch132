package day02typecasting_scanner;

public class JavaBookPractice {
    public static void main(String[] args) {

        //Type a code to find the sum of the minimum value of the byte and the maximum value of
        //short data types.
        byte minValue=Byte.MIN_VALUE;
        short maxValue= Short.MAX_VALUE;
        System.out.println(minValue+maxValue);

        //Type a code to convert “103” String to byte and to convert “2351” String to short then print
        //the difference on the console.

        byte first=Byte.valueOf("103");
        short second=Short.valueOf("2351");
        System.out.println(second-first);

        //Create 3 String variables for people's names. Print the sum of the number of characters in
        //all the 3 names except space characters.
        //Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console

        String n1="Ali Can";
        String n2="Merve Star";
        String n3="Mark Tom";
        int n1Num=n1.replaceAll("\\s","").length();

        int n2Num=n2.replace("\\s","").length();
        int n3Num=n3.replace("\\s","").length();
        System.out.println(n1Num+n2Num+n3Num);


    }
}
