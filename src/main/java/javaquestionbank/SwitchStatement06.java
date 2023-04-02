package javaquestionbank;

public class SwitchStatement06 {
    public static void main(String[] args) {
        /*
        Use switch statement to create a simple calculator which does addition, subtraction,
multiplication, and division with any 2 numbers
         */
        double a=2;
        double b=3;

        String operator = "+";
        switch(operator){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid operator");
        }
        }
    }

