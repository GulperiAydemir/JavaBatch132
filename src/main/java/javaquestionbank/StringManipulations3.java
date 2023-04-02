package javaquestionbank;

public class StringManipulations3 {
    public static void main(String[] args) {
  /*
        Type code to check if a String has an uppercase initial and dot at the end.
                Example: For ‘Ali’ your code should print false on the console
        For ‘ali.’ your code should print false on the console
        For ‘ Ali. ’ your code should print false on the console
        For ‘Ali.’ your code should print true on the console
        For ‘ALI.’ your code should print true on the console


   */


        String x = "Tom Hanks.";
        char firstChar = x.charAt(0);
        char lastChar = x.charAt(x.length()-1);
        Boolean x1 = firstChar>='A' && lastChar<='Z';
        Boolean x2 = lastChar=='.';
        Boolean isFirstUpperAndLastDot = x1 && x2;
       System.out.println("Is the first char upper and the last char dot? " + isFirstUpperAndLastDot);

       /*
       Type code to check if a password is valid or not for the following conditions;
       Password must have at least 8 characters different from space character
       Password must have at least 1 symbol
       Example: For ‘A2b!’ your code should print false on the console
       For ‘A2b3cdef’ your code should print false on the console
       For ‘!1a23b4’ your code should print false on the console
       For ‘!1a23b4?es’ your code should print true on the console
       For ‘! a b 3 k’ your code should print false on the console


        */
        String pwd = "!1a23b4?es";

        //Password must have at least 8 characters different from space character
        boolean r1=pwd.length()>=8 && pwd.replaceAll("\\p{Punct}","").length()!=pwd.length();
        boolean r2= pwd.replaceAll("\\s","").length()==pwd.length();
        System.out.println("result " + (r1 && r2));

        /*

        Type code to check if a String has a specific single character or not in three different ways.
         */

   String r5="Java";
   boolean r6=r5.contains("v");
        System.out.println(r6);

        boolean r7=r5.substring(2,3).equals("v");
        System.out.println(r7);

        String s = "Java";
        int  s5= s.indexOf("v");
        System.out.println(s5);

        /*
        String shirtPrice = ‘$12.99’;
        String bookPrice = ‘$35.99’;
        Type code to find the sum of the shirt and book prices




         */

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        String sP=shirtPrice.replaceAll("[$.]","");
        String bP=bookPrice.replaceAll("[$.]","");
        double sPN=Double.valueOf(sP);
        double bPN=Double.valueOf(bP);
        System.out.println((sPN+bPN)/100);




    }
}
