package b132practices.abstraction;

public class Triangle extends Area {

    @Override
    double calculateArea(double height, double base) {
        return height*base/2;
    }
}

