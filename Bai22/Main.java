package Bai22;

public class Main {
    public static void main(String[] args) {
        MoveAblePoint car1 = new MoveAblePoint();
        System.out.println("Setting for car1");
        car1.setX(4);
        car1.setY(5);
        car1.setxSpeed(60);
        car1.setySpeed(80);
        System.out.println(car1);

        System.out.println();

        System.out.println("Setting for car2");
        MoveAblePoint car2 = new MoveAblePoint(3 , 7, 70 ,90);
        System.out.println(car2);
    }
}
