package day08ternaryswitch;

public class Switch01 {
    public static void main(String[] args) {
        /*
        Example 1:For the number of the days,pr'nt the day names
         ...3==>Tuesday....  7==>Saturday
         */
        int dayNumber=12;
        switch(dayNumber){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter Valid Day Number");

        }



    }
}