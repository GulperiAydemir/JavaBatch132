package ssgstatic;

import ssginheritance.Student;

public class Static01 {

    static String cardType;
    long cardNumber;


    public static void main(String[] args) {
        cardType = "Creditcard";
        Static01 c1 = new Static01();
        c1.cardNumber = 656565656565L;


        Static01 c2 = new Static01();
        c2.cardNumber=3445454545L;
        System.out.println(cardType);


    }
}
