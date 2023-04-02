package javaquestionbank;

public class Ternary09 {
    /*
    Print 'Even' for even integers, print ‘Odd’ for odd integers by using ternary
     */
    public static void main(String[] args) {
        int x=15;
        String oddornot=x%2==0 ?  "even"   : "odd"   ;
        System.out.println(oddornot);
    }
}
