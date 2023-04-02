package practices;

public class practicepassbyvalue {
    public static void main(String[] args) {

        int gomlek=100;

         indirim("ogrenci",gomlek);
         indirim("Gazi",gomlek);
         indirim("Yasli",gomlek);

        System.out.println(indirim("ogrenci",gomlek));
        System.out.println(indirim("gazi",gomlek));
        System.out.println(indirim("yasli",gomlek));

    }

    private static int indirim(String durum, int gomlek) {
        switch(durum){
            case"ogrenci":
           gomlek=gomlek-10;
           break;
            case "Gazi":
           gomlek=gomlek-15;
           break;

            case "yasli":
           gomlek=gomlek-5;
           break;
            default:
               gomlek=gomlek;


        }
        return gomlek;

    }


}

