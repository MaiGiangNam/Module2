package Bai20;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateAreaCylinder(){
        return Math.PI * getRadius() * getRadius() * height;
    }

    public String toString() {

        return  "Cylinder: " +
                "Height = " + height + "" +
                "The Area of Cylinder = " + calculateAreaCylinder() + ""
                ;
    }
}
