package Bai20;

public class Circle {
    private double radius;
    private String color;


    public Circle(){
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateAreaCircle(){
        return Math.PI * getRadius() * getRadius();
    }

       public String toString() {
        return  "Circle:" +
                "Radius = " + radius + "" +
                "Color = " + color + "" +
                "The Area of Circle = " + calculateAreaCircle() + ""
                ;
    }

}


