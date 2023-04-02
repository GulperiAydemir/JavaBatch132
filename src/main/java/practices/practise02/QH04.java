package practices.practise02;

public class QH04 {
    public static void main(String[] args) {

             /*
              Create a String variable find the sum of ASCII values of the
        first and the last characters of the String
        String s="Miami";

              */

        String s="Miami";

        int fChar=s.charAt(0);
       int lChar=s.length()-1;

       int Asciil=s.charAt(lChar);
        System.out.println(fChar+Asciil);







    }
}
