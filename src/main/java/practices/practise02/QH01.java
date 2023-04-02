package practices.practise02;

public class QH01 {
    public static void main(String[] args) {

        //Type code to check if a String does not have any space character at the beginning and at the end
        //Example==> ' Ali ' should print false on the console
        //            'Ali' should print true on the console

        String str= " Tom ";

        String checkStr=str.trim();
        boolean checkStrResult=str.equals(checkStr);

        System.out.println("checkStrResult = " + checkStrResult);

        // 1- Create double variables for the prices of any 3 items.
        //    Print the sum of the prices on the console with a label.

        double shirtPrice=12.43;
        double tshirtPrice=11.54;
        double cyclePrice=10.54;
        double sum=(shirtPrice+tshirtPrice+cyclePrice);

        System.out.println(sum);



        //  1) Create a short variable and convert it to an int variable.
        short age=12;
        int ageInt=age;





    }
}
