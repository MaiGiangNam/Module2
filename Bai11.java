import java.util.Arrays;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, n;
        do {
            System.out.println("nhap so phan tu cua mang: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) {
                System.out.println("ban da nhap sai, nhap lai voi n>0");
            }
        } while (n <= 0);
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("nhap vao phan tu thu" + (i + 1) + " của mảng : ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mang da nhap la: ");
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (i = 1; i < n; i++) {
            if (min > arr[i]) min = arr[i];
        }
        System.out.print("Phần tử nhỏ nhất trong mảng vừa nhập vào là: " + min);
    }

}
