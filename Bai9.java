import java.util.Arrays;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap vao n1 la so phan tu cua mang thu nhat ");
            n1 = Integer.parseInt(scanner.nextLine());
            if (n1 <= 0) System.out.println("ban da nhap sai, hay nhap lai voi n1>0");
        } while (n1 <= 0);
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.println("nhap vao phan tu thu" + (i + 1) + ":");
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < n1; i++) System.out.print(arr1[i] + "\t");
        System.out.println(Arrays.toString(arr1));
        do {
            System.out.println("nhap vao n2 la so phan tu cua mang thu hai ");
            n2 = Integer.parseInt(scanner.nextLine());
            if (n2 <= 0) System.out.println("ban da nhap sai, hay nhap lai voi n2>0");
        } while (n2 <= 0);
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.println("nhap vao phan tu thu " + (i + 1) + ":");
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < n2; i++) System.out.print(arr1[i] + "\t");
        System.out.println(Arrays.toString(arr2));
        int n3 = n1 + n2;
        int[] arr3 = new int[n3];
        int index = 0;
        for (int i : arr1) {arr3[index] = i;index++;}
        for (int i : arr2) {arr3[index] = i;index++;}
        System.out.println("mang sau khi gop lai la");
        System.out.println(Arrays.toString(arr3));
    }
}
