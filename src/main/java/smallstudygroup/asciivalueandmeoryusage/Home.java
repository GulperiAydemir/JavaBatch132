package smallstudygroup.asciivalueandmeoryusage;

public class Home {
    public static void main(String[] args) {
        // a b c d e f
        // a b c d e f
        // a b c d e f
        // a b c d e f
        // a b c d e f



        for (int i = 0; i < 5; i++) {
            for (int j = 'a'; j <= 'f'; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }

        /*

         *
         * *
         * * *
         * * * *
         * * * * *


         */
        char input='f';
        for(char i='a'; i<input; i++){
            for(char j='a'; j<i; j++){
                System.out.println('*'+ " ");

            }
            System.out.println();
        }

    }
}
