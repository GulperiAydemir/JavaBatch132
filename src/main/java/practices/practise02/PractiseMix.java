package practices.practise02;

public class PractiseMix {

    public static void main(String[] args) {

        //     Create a short variable and convert it to an int variable.

        short shirtPrice=12;
        int shirtPriceInt=12;


        //    Create a long variable and convert it to an int variable.

        long shortPrice=15;
        int sortPriceWrapper=(int)shortPrice;

        //    Create a double variable and convert it to a float variable

        double x=23.34;
        float xFloat=(float)x;
        System.out.println(xFloat);

        //     Create a double variable and convert it to a short variable,
        //     then print the value of the short variable on the console.
        //     Be careful about the output, it will not be a decimal value.
        double a=12.99;
        short aShort=(short)a;
        System.out.println("The value of the short variable "+ aShort);

        //     Create a byte variable and convert it to a double variable,
        //     then print the value of the double variable on the console. Be careful about the output,
        //     it will be a decimal number

        byte b=34;
        double bDouble=b;
        System.out.println(bDouble);

        // Create a float variable, a long variable, and an integer variable for any 3 items.
        // Print the multiplication of the values on the console with a label.
        float se=23.54F;
        long fe=54;
        int fg=65;
        float feL=fe;
        float fgI=fg;
        float multiple=(se*fe*fg);
        System.out.println(multiple);

        // 3- Type a code to find simple interest.
        //     Note: Simple interest formula = principal * rate * numberOfYear / 100
         double numberOfYear=2023;
         double rate=1.23;
         double principal=1.000;
         double simpleInterestFormula=principal * rate * numberOfYear / 100;
        System.out.println(simpleInterestFormula);
        // 4- Create a String and two Long variables.
        //    Print the sum and the multiplication of the long variables with the String on the console.

      String st="Jenny";
      long lg=6877;
      long lg5=67676;
        System.out.println("sum "+(st+lg+lg5));

        //Create two boolean variables whose values are different
        //and print their values in the same line with a space between two consecutive values.

       boolean firstb=true;
       boolean secondb=true;
        System.out.println(firstb+" "+secondb);

        //  6- Create 3 float variables for the price of a book, notebook, and laptop.
        //     Print the total price of 2 books, 4 notebooks and 3 laptops on the console
        float book=3;
        float notebook=2;
        float laptop =5;
        System.out.println(2*book+4*notebook+3*laptop);

        // 7- Type a code to swap two integers.
        int z = 3, y = 5;
                z=z+y;//8
                y=z-y;//3
                z=z-y;
        System.out.println(z+" "+y);

        // 1) Type a code to find the sum of the minimum value of the byte and the maximum value of      short data types.
       byte minValue=Byte.MIN_VALUE;
       byte maxValue=Byte.MAX_VALUE;
        System.out.println(minValue +" "+ maxValue);



        // 2) Type a code to convert “103” String to byte
        //    and to convert “2351” String to short then print the difference on the console.
         byte first=Byte.valueOf("103");
         short second=Short.valueOf("2351");
        System.out.println(second-first);

        //What are the differences between valueOf(String s) and parseByte(String s) methods?

        //1) Create a String variable for city names which have just a single word.
        //Print the city name with the initial is in uppercase and all the other characters
        //String cityName="izmir";
        String cityName = " mIAMI ";
        String updatedCityName = cityName.trim().toLowerCase();
        updatedCityName = updatedCityName.substring(0,1).toUpperCase() +updatedCityName.substring(1);
        System.out.println(updatedCityName);
/*
        Create 3 String variables for people's names. Print the sum of the number of characters in
        all the 3 names except space characters.
        Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.
 */
        String n1="Ali Can";
        String n2="Merve Star";
        String n3="Mark Tom";

         int n1n=n1.replaceAll(" " ,"").length();
         int n2n=n2.replaceAll(" " ,"").length();
         int n3n=n3.replaceAll(" " ,"").length();
        System.out.println(n1n+n2n+n3n);
        /*
       Create a String variable, print the total number of alphabetical and numeric characters in
       the String on the console.
       Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console

         */

        String snt="Miami 33018!!!";

        int sntwithoutPunct=snt.replaceAll("\\s","").replaceAll("[^a-zA-Z0-9]","").length();
        System.out.println(sntwithoutPunct);

        //Create a String variable, print the number of non-digit characters in the String on the
        //console.
        //Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console
        String name="1a3Bcf4!...";
       int nonOfDigit=name.replaceAll("[0-9]","").length();
        System.out.println(nonOfDigit);


















    }

}
