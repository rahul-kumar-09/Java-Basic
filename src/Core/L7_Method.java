package Core;

import java.util.*;


public class L7_Method {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       /* String name = sc.next();
        printName(name);*/

        /*
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        */

        /* int sum = sumOfTwoNum(n1, n2);
        System.out.println(sum);*/

      /*  Multiplication(n1, n2);*/


        System.out.print("Enter the value for factorial: ");
        int f = sc.nextInt();
        factorial(f);

    }

    public static void printName(String name){
        System.out.println(name);
        return;
    }

    public static int sumOfTwoNum(int a, int b){
        int sum = a + b;

        return sum;
    }


    public static void Multiplication(int a, int b){
        int mul = a * b;
        System.out.println(mul);
        return;
    }


    public static void factorial(int a){
        int fact = 1;
        for (int i = a; i >= 1; i--){
            fact = i * fact;
        }
        System.out.println("Factroial is: " + fact);
    }

/*

    Function ->    it is call directly
    Method ->      it is call by object of class

*/

}
