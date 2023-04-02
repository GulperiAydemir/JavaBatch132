package javaquestionbank;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your weight");
        double weight= scan.nextByte();
        System.out.println("Please enter your height");
        double height= scan.nextDouble();
        double BMI=weight/(height*2);
        if(BMI<18.5){
            System.out.println("you're weak");
        } else if (BMI<25 && BMI>18.5) {
            System.out.println("your weight is ideal");
        } else if (BMI>25 && BMI<30) {
            System.out.println("you re fat");

        }else if(BMI>=30){
            System.out.println("you are obese");
        }

    }
}
