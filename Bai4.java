import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri so hang m cua hinh");
        n = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap gia tri so cot n cua hinh");
        m = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf(" * ");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(" * ");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
        for (int i = m; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(" * ");
            }
            System.out.printf("\n");
        }
    }
}
