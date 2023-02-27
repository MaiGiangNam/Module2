import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int n, i;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nguyen to ban muon in ra ");
        n = Integer.parseInt(scanner.nextLine());
        while (count < n) {

            for (i = 2; ; i++) {
                int count1 = 0;
                for (int j = 2; j <= i - 1; j++) {
                    if (i % j == 0) count1++;
                }
                if (count1 == 0) {
                    System.out.printf("%d ", i);
                    count++;
                }
                if (count == n) break;
            }

        }
    }
}
