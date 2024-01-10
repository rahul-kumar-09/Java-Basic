package Core;
import java.util.*;

public class L5_Patterns {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       // SolidRectangle();
       // HollowRectangle();
       // HalfPyramid();
       // InverseHalfPyramid();
       // InverseHalfRotated180Pyramid();
       // HalfPyramidWithNumber();
       // InverseHalfPyramidWithNumber();
       // FloydsTriangle();
        BinaryTriangle();
    }

    private static void BinaryTriangle() {
        int n = 5;
        for (int i = 1; i <= n; i ++){
            for (int j = 1; j <= i; j ++){
                int sum = i + j;
                if (sum % 2 == 0){
                    System.out.print("0 ");
                }else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }

    private static void FloydsTriangle() {
        int n = 5, number = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    private static void InverseHalfPyramidWithNumber() {
        int n = 5;
        for (int i = 1; i <= n; i ++){
            for (int j = 1; j <= n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void HalfPyramidWithNumber() {
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void InverseHalfRotated180Pyramid() {
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    private static void InverseHalfPyramid() {
        int n = 5;
      for (int i = n; i >= 1; i --){
          for (int j = 1; j <= i; j ++){
              System.out.print("*");
          }
          System.out.println();
      }
    }


    private static void HalfPyramid() {
        int n = 5;
        for (int i = 1; i <= n; i ++){
            for (int j = 1; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    private static void HollowRectangle() {
        int n = 8;
        int m = 9;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <=m; j++){
                if (i == 1 || j == 1 || i == n || j == m){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    private static void SolidRectangle() {
        int n = 4;
        int m = 5;
        for (int i = 1; i <= n; i++){
            for (int j =1; j<= m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
