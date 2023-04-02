package practices.practise02;

public class Practisemix2 {
    public static void main(String[] args) {
        //Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
        //Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
        //sembol olmalıdır.
        String sifre = "!1a23b4?es";

        boolean enaz8CharSifre=sifre.replaceAll("\\s","").length()>7;
        boolean enaz1CharSembol=sifre.replaceAll("\\s","").replaceAll("[a-zA-Z0-9]","").length()>0;

        System.out.println("sifre gecerli mi ? " + (enaz8CharSifre && enaz1CharSembol));

        //Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek
        //için kod yazınız.
        //1.Way
        String s = "Java";
        boolean sonuc=s.contains("Java");
        System.out.println("sonuc = " + sonuc);
        boolean sonuc1=s.replaceAll("^v","").length()>0;
        System.out.println("sonuc1 = " + sonuc1);
        boolean sonuc2=s.indexOf("v")>=-1;
        System.out.println("sonuc2 = " + sonuc2);

        //String gomlekFiyat = ‘$12.99’;
        //String kitapFiyat = ‘$35.99’;
        //Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.
        String gomlekFiyat ="$12.99";
        String kitapFiyat ="$35.99";
       String ngomlekFiyat=gomlekFiyat.replaceAll("[$]","");
       String nkitapFiyat=kitapFiyat.replaceAll("[$]","");
       double nk=Double.valueOf(nkitapFiyat);
       double ng=Double.valueOf(ngomlekFiyat);
       double sum=(nk+ng);
        System.out.println("sum = " + sum);
        /*
        Type code to get initials of the first name and the last name of a given name. Middle name
      is out of scope.
        Example: Tom Hanks ==> TH, Mary Star ==> MS


   */
        String n="Tom Hank";
        String firstChar=n.substring(0,1);
        String lastChar=n.split(" ")[1].substring(0, 1);

        System.out.println(firstChar+lastChar);

        int i = 1;
        int j = 0;
        switch (i) {
            case 2 :
                j += 6;
            case 4 :
                j += 1;
            case 1 :
                j += 4;
            default :
                j += 2;
        }
        System.out.println("j = " + j);
        //Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
        //with a space between two consecutive integers


        }

    }

