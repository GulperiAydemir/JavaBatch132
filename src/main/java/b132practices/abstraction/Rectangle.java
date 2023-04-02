package b132practices.abstraction;

public class Rectangle extends Area {

    @Override
    double calculateArea(double height, double lenght) {
        return height*lenght;
    }
}

