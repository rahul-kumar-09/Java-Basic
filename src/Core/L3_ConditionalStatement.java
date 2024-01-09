package Core;

import java.util.Scanner;

public class L3_ConditionalStatement {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

 /*       System.out.println("Please Enter your Age. ");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("Congratulation, \n You are eligible for Vote. ");
        } else {
            System.out.println("You are not eligible for Vote. ");
        }
*/

       /* System.out.println("\n\n Please Enter any Number. ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }*/

        System.out.println("Enter any three number. ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println(n1 + " is Greater");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is Greater");
        } else {
            System.out.println(n3 + " is Greater");
        }


    }

}
