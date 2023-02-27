import java.util.Scanner;

public class Bai2 {
    final static String[] array1 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
            "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    final static String[] array2 = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        number = Integer.parseInt(scanner.nextLine());
        if (number < 20) {
            System.out.println(array1[number]);
        } else if (number < 100) {
            if (number % 10 == 0) {
                System.out.println(array2[number / 10]);
            } else {
                System.out.println(array2[number / 10] + " " + array1[number % 10]);
            }
        } else if (number < 1000) {
            if (number % 100 == 0) {
                System.out.println(array1[number / 100] + "hundred");
            } else if (number % 100 < 20) {
                System.out.println(array1[number / 100] + " hundred and " + array1[number % 100]);
            } else {
                System.out.println(array1[number / 100] + " hundred and " + array2[(number % 100) / 10] + " " + array1[number % 10]);
            }
        } else if (number >= 1000) {
            System.out.println("out of ability");
        }
    }
}

