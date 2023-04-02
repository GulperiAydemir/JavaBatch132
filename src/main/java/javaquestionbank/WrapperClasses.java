package javaquestionbank;

public class WrapperClasses {
    public static void main(String[] args) {
        byte minValue=Byte.MIN_VALUE;
        System.out.println("minValue = " + minValue);

        byte maxValue=Byte.MAX_VALUE;
        System.out.println("maxValue = " + maxValue);
        short minvalue=Short.MIN_VALUE;
        System.out.println("maxvalue = " + minvalue);
        /*
        Type a code to convert “103” String to byte and to convert “2351” String to short then print
        the difference on the console
        
         */

        byte first=Byte.valueOf("103");
        short sec=Short.valueOf("2351");
        System.out.println(first-sec);



    }
    
  
}
