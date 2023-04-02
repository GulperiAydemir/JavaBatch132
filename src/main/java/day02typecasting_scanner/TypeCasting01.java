package day02typecasting_scanner;

public class TypeCasting01 {


    public static void main(String[] args) {

        //Example:Create 2 integer variables and 1 String variable
        /*
        Primitve data types are created by java==>byte<short<int<long<float<double--char and boolean

        Non=Primitive data types both values and methods

         */
        int a=13;
        int b=15;
       String name ="Tommy";//You can do some update or change
        String fullname ="Tommy hanks";
        System.out.println (name +( a + b));
        //Type Casting
        /*
        1)AutoWidening=Java can put small types into larger data types automatically
        When you put small data type ,you are widening the small data type
         */
        int m=45;
        System.out.println(m);

        double d=m;
        System.out.println(d);
        /*
        2)Explicitly Narrowing
        Java doesn't put large data type into small data type

         */

       int n=15;
       byte b1= (byte) n;
        System.out.println(n);


    }

}
