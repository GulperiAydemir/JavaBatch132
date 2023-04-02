package b132practices.practice01;

public class Q05 {
    public static void main(String[] args) {
        // Write a Java program to break an integer into a sequence of individual digits.
        // Hint: use / and %
        // x: input: 12345
        //    output: 1
        //            2
        //            3
        //            4
        //            5

        int number= 12345;

        int ones=number%10; //take the last character
        System.out.println("ones = " + ones);

        int tens=(number/10)%10;
        System.out.println("tens = " + tens);

        int hundreds=(number/100)%10;
        System.out.println("hundreds = " + hundreds);

        int thousends=(number/1000)%10;
        System.out.println("thousends = " + thousends);

        int tenThousends=(number/10000);
        System.out.println("tenThousends = " + tenThousends);

        System.out.println(tenThousends+"\n" + thousends+"\n"+ hundreds+"\n"+ tens+"\n"+ ones+"\n");


    }
}
