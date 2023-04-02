package javaquestionbank;

public class Ternary06 {
    /*
Type code to calculate the absolute value of a number
For positive numbers and zero absolute value is the same with the number
For negative numbers to find absolute value multiply the number by -1
     */
    public static void main(String[] args) {
        int number=12;
         int g= number>=0  ? + number : + number * -1;
        System.out.println(g);


    }
}
