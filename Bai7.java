import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap vao n la so phan tu cua mang");
            n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) System.out.println("ban da nhap sai, hay nhap lai voi n>0");
        } while (n <= 0);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap vao phan tu thu arr[" + i + "]:");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < n; i++) System.out.print(arr[i] + "\t");
        System.out.println(Arrays.toString(arr));
        System.out.println("nhap phan tu ban muon xoa");
        int x = Integer.parseInt(scanner.nextLine());
        int indexOfX = -1;
        for (int i = 0; i < n; i++) if (arr[i] == x) indexOfX = i;
        if (indexOfX == -1) System.out.println("phan tu ban muon xoa khong co trong mang");
        else {
            for (int i = indexOfX; i < n - 1; i++) arr[i] = arr[i + 1];
        }
        arr = Arrays.copyOf(arr, arr.length - 1);
        System.out.println("mang sau khi xoa la");
        System.out.println(Arrays.toString(arr));

    }
}
