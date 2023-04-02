package practices.practise02;

public class QH03 {
    /*
         String shirtPrice=" $ 12.99";
         String bookPrice="$35.99";
         Type code to find the sum of the shirt and bookprices.


          */
    public static void main(String[] args) {

        String shirtPrice=" $ 12.99";
        String bookPrice="$ 35.99";

        String shirt=shirtPrice.replace("$","");
        String book=bookPrice.replace("$","");

       double s= Double.valueOf(shirt);
       double b=Double.valueOf(book);


        System.out.println(shirt+book);

    }

}
