import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
        public static void main(String[] args) {
            System.out.print("nhap vao chuoi can kiem tra:");
            Scanner in=new Scanner(System.in);
            String inputString = in.nextLine();
            Queue queue = new LinkedList();
            for (int i = inputString.length()-1; i >=0; i--) {
                queue.add(inputString.charAt(i));
            }
            String reverseString = "";
            while (!queue.isEmpty()) {
                reverseString = reverseString+queue.remove();
            }
            if (inputString.equals(reverseString))
                System.out.println("day la chuoi doi xung.");
            else
                System.out.println("day khong phai la chuoi doi xung.");
        }
}
