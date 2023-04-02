package javaquestionbank;

public class Ternary08 {
    /*
    If the number has 3 digits, the output will be “This number has 3 digits.” Otherwise, the
output will be “This number has no 3 digits.”
     */
    public static void main(String[] args) {
        int a=123;
        String number3= a>99 &&a<1000 ? "This number has 3 digits."  : "This number has not3 digits.";
        System.out.println(number3);

    }
}
