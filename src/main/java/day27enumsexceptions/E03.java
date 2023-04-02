package day27enumsexceptions;

public class E03 {
    public static void main(String[] args) {

        String s1="Java";
        System.out.println(getNumOfCharInString(s1));

        String s2="";
        System.out.println(getNumOfCharInString(s2));

        String s3=" ";
        System.out.println(getNumOfCharInString(s3));

        String s4=null;
        System.out.println(getNumOfCharInString(s4));//NullPointerException
        // Some Methods in String Class create issue when you used them with null
        //Java throws NullPointerException for this issue

        String s="123";
        System.out.println(convertStringToInt(s)+2);


        String t="1a2b";
        System.out.println(convertStringToInt(t)+2);//NumberFormatException
        //If you try to convert s String contains non=digit characters to a number
        //Java throws NumberFormatException


    }
    //Create a method to get the number of characters in a String

    public static int getNumOfCharInString(String s) {
        try {

            return s.length();
        } catch (NullPointerException e) {
            return 0;
        }
    }
    //Example 2:Create a method to convert a String to an Integer
    public static int convertStringToInt(String s){
        try{

        return Integer.valueOf(s);
    }catch(NumberFormatException e){
            System.out.println(s+ "has non-digit characters");
            System.out.println(e.getMessage());//To see technical message from Java use gerMessage()method
            e.printStackTrace();//To get detailed error message use printStackTrace()method

        }
            return 0;
        }
}
