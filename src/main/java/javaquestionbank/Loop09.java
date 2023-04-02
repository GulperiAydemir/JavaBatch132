package javaquestionbank;

public class Loop09 {
    public static void main(String[] args) {
        /*
        Type code to print all lowercase characters in a String with an asterix.
                For example; 'Ali Can?' ==> l*i*a*n*

         */
        String n = "Ali Can";
        String s = "";
        String lName = n.replaceAll("[^a-z]", "");

        for (int i = 0; i < lName.length(); i++) {
            String c = lName.substring(i, i + 1);
            System.out.print(c + "*");

        }


        }

    }


