package Bai28;

import java.util.Scanner;

public class Validatetion {
    private static Scanner sc = new Scanner(System.in);



    public static int checkInputIntLimmit(int min, int max){
        while (true){
            try {
                int result = Integer.parseInt((sc.nextLine().trim()));
                if (result < min || result > max){
                    throw  new NumberFormatException();
                }
                return  result;
            }catch (NumberFormatException ex){
                System.out.println("Enter again");
                System.err.println("Please input number in rage ["+ min + ", "+ max+ "]");
            }
        }
    }



    public static String  checkInputString(){
        while (true){
            String result = sc.nextLine().trim();
            if(result.isEmpty()){
                System.err.println("NOT EMPTY");
                System.out.println("Enter again");
            }else{
                return result;
            }
        }

    }


    public static int checkInputInt(){
        while (true){
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            }catch (NumberFormatException ex){
                System.err.println("Please input number integer !");
                System.out.println("Enter again");
            }
        }
    }
}