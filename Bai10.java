import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        int row, col;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap vao so dong cua ma tran");
            row = Integer.parseInt(scanner.nextLine());
            if (row < 1) System.out.println("ban da nhap sai, hay nhap lai voi row >1");
            System.out.println("nhap vao so cot cua ma tran");
            col = Integer.parseInt(scanner.nextLine());
            if (col < 1) System.out.println("ban da nhap sai, hay nhap lai voi col >1");
        } while (row < 1 || col < 1);
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("arr[" + i + "," + j + "]=:");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("ma tran vua nhap la");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[j][j] > arr[0][0]) max = arr[j][j];
            }
        }
        System.out.println("phan tu lon nhat cua ma tra la" + max);
    }
}
