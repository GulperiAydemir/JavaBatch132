package javaquestionbank;

public class SwitchStatement07 {
    /*
    Use switch statement to create a converter which converts mile to km, second to hour,
    fahrenheit to celsius. Find the formulas for conversions from Google.
            a) When user entered 10 and mileToKm String, your code should print "16 km" (The number
    will be dynamic) on the console

     */


    public static void main(String[] args) {
   double mile = 5 ;
   int minute=4;
   String calculate="miletoKm";

        switch(calculate){
            case "miletokm" :
                System.out.println(mile*1.6);
                break;
            case "secondtominute" :
                System.out.println(minute*60);
                break;

            default:
                System.out.println("That operation was not defined for that converter");


        }
    }
}
