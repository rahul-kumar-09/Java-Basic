package Core;

import java.util.*;


public class L7_Method {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       /* String name = sc.next();
        printName(name);*/

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        /* int sum = sumOfTwoNum(n1, n2);
        System.out.println(sum);*/

        Multiplication(n1, n2);


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


}
