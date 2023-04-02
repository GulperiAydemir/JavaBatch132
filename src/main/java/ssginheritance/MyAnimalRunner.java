package ssginheritance;

import ssginheritance2.Snack;

public class MyAnimalRunner {
    public static void main(String[] args) {

        Mycat objC=new Mycat();
        objC.miaw();



        Mybird objB=new Mybird();
        objB.animalEat();
        Mybird.chic();


        Snack mySnack=new Snack();

        mySnack.tiss();
        mySnack.animalDrink();



    }
}
