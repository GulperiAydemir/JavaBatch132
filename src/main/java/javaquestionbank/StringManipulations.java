package javaquestionbank;

public class StringManipulations {
    public static void main(String[] args) {

        //Create a String variable for city names which have just a single word.
        //Print the city name with the initial is in uppercase and all the other characters
        String cityName = "parIS";//Paris
        String newCityName1 =cityName.substring(0, 1).toUpperCase()+cityName.substring(1).toLowerCase();
        System.out.println(newCityName1);

        String name="  Baku  ";
        String nname=name.trim().toLowerCase()+name.substring(0,1)+name.substring(1);
        System.out.println(nname);

        //Create 3 String variables for people's names. Print the sum of the number of characters in
        //all the 3 names except space characters.
        //Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.

        String name1="Ali Can";
        String name2="Merve Star";
        String name3="Mark Tom";
        String r2=(name1+name2+name3).replace(" ","");
        int r1=r2.length();
        System.out.println(r1);
        //Create a String variable, print the total number of alphabetical and numeric characters in
        //the String on the console.
        //Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console

        String s="Miami 33018!!!";
        String news=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(news.length());

        //Create a String variable, print the number of non-digit characters in the String on the
        //console.
        //Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.
        String t="1a3Bcf4!...";
        int newt=t.replaceAll("[0-9]","").length();
        System.out.println(newt);
        /*
        Create a String variable and print just the last non-space character on the console for any
String.
Example: For ‘Ali Can’ you should print n
For ‘Miami ’ you should print i etc.

         */
    String b="Miami";
    String a=b.substring(b.length()-1);
        System.out.println(a);






    }
}