package ssgmethodcreation;

public class SchoolRunner {
    public static void main(String[] args) {

        School obj=new School();
        System.out.println(obj.okulIsmi);
        System.out.println(obj.isActive);
        System.out.println(obj.year);

        School.okulIsmi("Star okulu");
        School.year(2007);

        System.out.println(School.isakti(false));

    }
}
