package day02typecasting_scanner;

public class WrapperClass01 {

    public static void main(String[] args) {
        /*
        Wrapper Class
        Non-Primitive data types have "methods" together with values
        We can do many actions by using methods which is very useful.
        But primitives do not have any methods because of that we can  no to do any actions/use methods with primitives
        Java created "Wrapper Classes " to handle this issue .Java created a new structure which has "primitive value"
        and "methods" together.This is called "Wrapper Classes"
        "Wrapper Classes" are Non-Primitive data types


        Wrapper Classes are Non-Primitive data types

        Primitive
        byte short int long float double char boolean

        Wrapper Class

        Byte  Short Integer Long Float Double Character Boolean

         */

        int age=13;//There is no method
        Integer number=59;//There are many useful methods

       float numberf=number.floatValue();
        System.out.println(numberf);

        char c='A';
        Character d= 'A';
        //Autoboxing :When you create wrapper class an object
        // to convert primitive data to wrapper class of the primitive data
        byte b=23;
        Byte wb=b;

        //Unboxing :To convert "wrapper classes" object into its primitive

        Short ws=34;
        short s=ws;










    }

}
