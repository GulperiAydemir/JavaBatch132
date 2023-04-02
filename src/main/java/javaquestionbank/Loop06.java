package javaquestionbank;

public class Loop06 {
    public static void main(String[] args) {
        /*
        Type code to draw the following image by using a for loop.
A
A A
A A A
A A A A
         */
        String s="";
        for(int i=0 ;i<4 ;i++){
            for (int k=1; k<=i;k++){
                s=s+"A";

            }
            System.out.println(s);
        }
    }
}
