package ssg10forloop;

public class ForLoop07 {
    public static void main(String[] args) {

        String name = "Merhaba";
        for (int i = 0; i < name.length(); i++) {
            String c=name.substring(i,i+1);
            if (name.indexOf(c) == name.lastIndexOf(c)) {
                System.out.print(name.charAt(i)+ " ");

            }

        }
    }
}
