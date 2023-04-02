package practices.practise02;

public class Q04 {

    public static void main(String[] args) {
        /*
        Create a String variable find the sum of ASCII values of the
        first and the last characters of the String
        String s="Miami";

         */
        String s="Miami";
        int indexOfLastChar=s.length()-1;
        int indexOfFirstChar=s.charAt(0);
        int AsciiFirst=s.charAt(0);
        int AsciiLast=s.charAt(indexOfLastChar);
        System.out.println("Total ASCII values of first and last characacters " + (AsciiFirst+AsciiLast));






    }
}
