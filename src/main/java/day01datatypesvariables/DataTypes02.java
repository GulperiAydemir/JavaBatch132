package day01datatypesvariables;

public class DataTypes02 {
    //What is  "Data"?
    //Data is used, is stored, is processed in Java
    //What are the Data Types in Java

    //What are the "Primitive data types"?
    //i)"Primitive Data types" were created by Java ,developers cannot create "Primitive data types"
    //ii)"There are 8 "primitive data types"
    //  1)byte 2)short 3)int 4)long 5)float 6)double 7)char 8)boolean

    //byte  "byte is for "whole numbers"
    //      "byte is from -128 to 127 "
    //      We have 256 different values in "byte" primitive data type

    //Let's create a byte variable and assign a value to it
    //"byte stdAge" code i)creates reserved area in memory
    //                  ii)Names it by using the name you gave
    //                 iii)Puts zero (default value) in the reserved area

    //"=" is Not "equal sign",it is "assignment operator"
    //"assignment operator" takes the value from the right puts it into the reserved area on the left
    // ";" is used to end any "Java Sentence"(Statement)
    //Naming Convention of Variables:i)Start with lowers case
    //                               ii)All words except the first should start with upper cases
    //                               That two rules are called "Camel Case"

    byte stdAge=127;


    //2)short:"short" is for whole numbers.
    //        "short" is from negative -32K sth to +32K sth.
    //        "short" is from negative -32K sth to +32K sth.

    short populationInAnApartment =546;

    //3)"int" stands for "Integer "and it is for whole numbers.
    //  "int" is from -2 billion sth to +2 billion sth.

    int populationInACity=650000;

    //4)long :"long" is for whole numbers
    //        Even you make data type "long",Java insists on using "int" to save memory.
    //To insist on Java to make data type "long",put "L" or "l" at the end of value
    //If the value is in"int range" no need to put "L"or "l" to the end of the value but
    //If the value is NOT in"int range" you have to put "L"or "l" to the end of the value

    long populationOfTheWorld=7200000000L;

   //6)double:"double" is for decimal values
   // "double" can have up to 16 digits in decimal part ,it is so sensetive

    double weightOfACell=0.00000000023045;

    //6)float:"float " is for decimal values
    //   "float " has up to 7 seven digits in decimal part
    //    All decimal values are in "double" as default in Java
    //    Even you type "float" as data type ,Java will accept is as "double"
    //   to insist on Java ,it is float put "F" or "f" to the end of the value.

    float shirtPrice=12.99F;

    //7)char: "char" is for "single characters"
    //       A,?,!,s,3 etc.
    //       The value of char data type must be between the single quotes.

    char initial='S';
    char punctuationMark='!';

    // 8)boolean: it is for "true" or "false" answers.

    boolean isRetired=true;
    boolean isOld=false;

    /*
    What did we learn today?
    1)how to crate "project","package","class","variable"
    2)how to name "project","package","class","variable"
    3)Data Types
    4)Primitive Data Types.


     */




}
