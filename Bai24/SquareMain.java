package Bai24;

public class SquareMain {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(9);
        System.out.println(square);

        square = new Square("Red" , true , 6);
        System.out.println(square);

        square.howToColor();
    }
}
