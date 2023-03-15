package Bai24;

public class Square extends Shape{
    private double length = 1.0;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    public Square(String color, boolean filled, double length) {
        super(color, filled);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return length * length;
    }
    public double getPerimeter(){
        return 4 * length;
    }

    @Override
    public String toString() {
        return  "Square: " + "\n" +
                "length = " + length + "\n" +
                "Area = " + getArea() + "\n" +
                "Perimeter = " + getPerimeter() + "\n" +
                super.toString()
                ;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}