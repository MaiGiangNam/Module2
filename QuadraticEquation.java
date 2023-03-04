import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDelta() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDelta();
        if (delta < 0) return 0;
        else return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double getRoot2() {
        double delta = getDelta();
        if (delta < 0) return 0;
        else return (-b - Math.sqrt(delta)) / (2 * a);
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap he so a");
            a = Double.parseDouble(scanner.nextLine());
            if (a == 0) System.out.println("nhap lai he so a # 0");
        } while (a == 0);
        System.out.println("nhap he so b");
        b = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap he so c");
        c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDelta();
        if (delta > 0) {
            System.out.println("Nghiệm thứ nhất: " + equation.getRoot1());
            System.out.println("Nghiệm thứ hai: " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép: " + equation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}