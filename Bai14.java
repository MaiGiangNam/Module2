import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        String str;
        char ch;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chuoi ban muon");
        str = scanner.nextLine();
        System.out.println("nhap vao ky tu ban muon");
        ch = scanner.nextLine().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) count++;
        }
        System.out.println("so lan xuat hien cua ky tu" + ch + "trong chuoi la :" + count);
    }
}
