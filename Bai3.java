import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Usd value : ");
        usd = Double.parseDouble(scanner.nextLine());
        double converter = usd * vnd;
        System.out.println("Vnd value : " + converter + "vnd");
    }
}



