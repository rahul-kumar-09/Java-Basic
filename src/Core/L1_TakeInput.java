package Core;

import java.util.Scanner;

public class L1_TakeInput {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Number for Addition ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of Two number " + sum);
    }
}
