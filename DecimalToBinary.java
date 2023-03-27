import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type random number here");
        int decimal = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();

        while (decimal != 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }

        System.out.println("Binary representation : ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
