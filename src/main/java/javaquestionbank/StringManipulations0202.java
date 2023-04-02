package javaquestionbank;

public class StringManipulations0202 {
    public static void main(String[] args) {
          /*
        Create a String variable, print the total number of alphabetical and numeric characters in
the String on the console.
Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.
String
         */

        String r=" Miami 33018!!! " ;
        int r1=r.replaceAll("[^a-zA-Z0-9]","").length();
        System.out.println(r1);
        /*
        Create a String variable, print the number of non-digit characters in the String on the
console.
Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.
         */

        String r2="1a3Bcf4!...";
        int r3=r2.replaceAll("[0-9]","").length();
        System.out.println(r3);
        /*
        Create a String variable and print just the last non-space character on the console for any
String.
Example: For ‘Ali Can’ you should print n
For ‘Miami ’ you should print i etc.
         */

        String name="  Ali Can   ";
        String name1=name.trim();
        System.out.println("name1  " + name1.charAt(name1.length()-1));

       /*
        2.yol

        String n="   Ali Can  ";
        int idxOfLastNonSpace = n.replaceAll("\\s","").trim().length()-1;
        String lastNonSpaceChar =n.substring(idxOfLastNonSpace, idxOfLastNonSpace+1);
        System.out.println("The non-space last character: " + lastNonSpaceChar);
        */

        String s2 = "  Ali Can  ";
        String s3 = s2.trim();
        int idxOfLastNonSpace = s3.length()-1;
        String lastNonSpaceChar = s3.substring(idxOfLastNonSpace, idxOfLastNonSpace+1);
        System.out.println("The non-space last character: " + lastNonSpaceChar);

        //Create a String variable and find the sum of the ASCII values of the first and the last
        //characters of the String.
       // String

        String s = "Miami";
        int s1=s.charAt(0)+ s.charAt(s.length()-1);
        System.out.println(s1);

        //Create a String variable and print all characters except the first character on the console.
        //Example:If the String is ‘Java’ you should print ‘ava’ on the console.

        String x="Java";
        String x1=x.substring(1);
        System.out.println(x1);

        /*Create a String variable and print all characters except the last character on the console in
        uppercases.
                Example:If the String is ‘Java’ you should print ‘JAV’ on the console.
                String s = "Java";

         */

    String n="  Java   ";
    String nn=n.trim();

    String nnn=nn.toUpperCase().substring(0,nn.length()-1);
        System.out.println(nnn);
        /*
        Create a String variable and print all characters except the first character and the last
character on the console in uppercases.
Example:If the String is ‘Java’ you should print ‘AV’ on the console.
         */
 String g="Java";
 String gg=g.toUpperCase().substring(1,g.length()-1);
        System.out.println(gg);

        /*
        Type code to check if a String has just a single space character any position in the middle
Example: For ‘Ali Can’ your code should print false on the console
For ‘ Ali Can ’ your code should print false on the console
For ‘ Ali Can ’ your code should print false on the console
For ‘Ali Can’ your code should print true on the console
         */

        String z = "Tom Hanks";
        boolean z1=z.contains(" ");
        System.out.println(z1);
        //String z2=z.replaceAll("\\S","*");
        //System.out.println(z2);

        //String s3 = " Tom Hanks   ";
        String trimmed = s3.trim();
        String allExceptSpace = trimmed.replaceAll("\\s", "");
        Boolean isThereSingleSpaceInTheMiddle = trimmed.length() - allExceptSpace.length()==1;
        System.out.println("There is a space in the middle: " + isThereSingleSpaceInTheMiddle);

        String d="Gulperi";
        String e="Gul" ;
        boolean bd=d.equalsIgnoreCase(e);
        System.out.println(bd);

        /*
        Type code to check if a String does not have any space character at the beginning and at
the end?
Example: For ‘ Ali ’ your code should print false on the console
For ‘Ali’ your code should print true on the console
String s = " Tom ";
         */

        String eleven = "  Tom   ";
        String eleventrimmed=eleven.trim();
        boolean n2=eleven.length()==eleventrimmed.length();
        System.out.println(n2);

        String trimmedString = s.trim();
        Boolean result = s.equals(trimmedString);
        System.out.println("Is there space at the beginning and/or at the end? " + !result);

        String elevenn = "Tom";
        String eleven1 = elevenn.trim();
        boolean r5 = elevenn.equals(eleven1);
        System.out.println(r5);






    }
}
