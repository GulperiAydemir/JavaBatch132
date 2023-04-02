package practices.practice06nt;

public class Q04_Runner {
    public static void main(String[] args) {


        Q04_Volume volume=new Q04_Volume();
        System.out.println("Volume of Cylinder is : "+volume.volumeOfCylinder(5,10));

        System.out.println("Volume of Rectangular  is : ");
        Q04_Area area=new Q04_Area();
        System.out.println("Area of square is:"+area.areaOfSquare(4.5));
    }
}
