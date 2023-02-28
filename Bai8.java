import java.util.Arrays;
import java.util.Scanner;

public class Bai8 {
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
        System.out.println("nhap phan tu ban muon them vao");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap vi tri ban muon them vao");
        int indexOf=Integer.parseInt(scanner.nextLine());
        if(1<indexOf&&indexOf<n-1) {for( int i=n-indexOf;i>=indexOf;i--) arr[i+1]=arr[i];
        arr[indexOf]=x;
        System.out.println("mang sau khi them vao la");
        System.out.println(Arrays.toString(arr));}
        else System.out.println("khong chen duoc phan tu vao mang");
    }
}
