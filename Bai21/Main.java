package Bai21;

public class Main {
    public static void main(String[] args) {
        Point2D point2 = new Point2D();
        point2.setXY(2,5);
        System.out.println(point2.toString());

        Point3D point3 = new Point3D();
        point3.setXYZ(4,7,9);
        System.out.println(point3.toString());
    }
}
