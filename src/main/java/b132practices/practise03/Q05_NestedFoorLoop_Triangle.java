package b132practices.practise03;

import java.util.Scanner;

public class Q05_NestedFoorLoop_Triangle {
    public static void main(String[] args) throws InterruptedException {
        /*
        Take the number of rows from user and print on console the shape based on rows.
                 *
                * *
               * * *
              * * * *
             * * * * *
   */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row number");
        int row=scanner.nextInt();

        for (int i = 0; i < row; i++) {//row control
            for(int space=row-i; space>1; space--){
                Thread.sleep(300);
                System.out.print("-");
            }


            for (int j=0; j<=i;j++) {//column control
                Thread.sleep(300);
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
