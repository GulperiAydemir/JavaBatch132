package replit;

public class ReplitArray01 {
    /*
    Write a return method to reverse number.

Input  : 12345

Output : 54321
     */


    public static void main(String[] args) {

//1.Way

//        StringBuilder num= new StringBuilder("12345");
//        num.reverse();
//        System.out.println(num);
//2.way
        reversenum("12345");

    }
    public static void reversenum(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }


    }
}
