package Core;

import java.util.*;


public class L4_loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int num = sc.nextInt();


     //   table(num);
     //   sumNaturalNum(num);
     //   forLoop();
     //   whileLoop();
     //   doWhile();


    }

    private static void doWhile() {
        //do while
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i < 10);
    }



    private static void whileLoop(){
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
    }


    private static void forLoop(){
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }


    private static void sumNaturalNum(int num){
        int sum = 0;
        for (int i = 0; i <= num; i ++){
            sum = i + sum;
        }
        System.out.println(sum);
    }


    private static void table(int num){
        //print table
        System.out.println("Table of " + num);
        for (int i = 1; i <= 10; i ++){
            int sum = i * num;
            System.out.println(sum);
        }
    }



}
