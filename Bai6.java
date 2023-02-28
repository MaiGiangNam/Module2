import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int i;
        for (i = 2; i < 100; i++) {
            int count1 = 0;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) count1++;
            }
            if (count1 == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}

