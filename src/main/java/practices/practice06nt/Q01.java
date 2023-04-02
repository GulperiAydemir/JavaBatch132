package practices;

public class Q01 {

    public static class practice06nt {

        public static void main(String[] args) {





          /*
   Create a method to calculate 4 students' 6, 4, 3 and 5 exams' average respectively.
    */

            calculateAvarge("Ali", 55, 60, 40, 60, 90, 100);
            calculateAvarge("Aisha", 100, 90, 89, 99, 100);
            calculateAvarge("Fatma",50,60,70);



        }

        public static void calculateAvarge(String stdName, double... mark) {
            double sum = 0;
            for (double w : mark) {


                sum += w;
            }

            System.out.println(stdName + "Avarage of exams: " + String.format("%.3f",sum / mark.length));
        }


    }



}