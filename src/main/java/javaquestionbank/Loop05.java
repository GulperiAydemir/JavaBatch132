package javaquestionbank;

public class Loop05 {

    // Type code to draw the following image by using a for loop.
    // A A A A A
    // A A A A A
    // A A A A A
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            String s="";
            for(int k=0;k<5;k++){
              s=s+ "A";
            }
            System.out.println(s);
        }

    }



}
