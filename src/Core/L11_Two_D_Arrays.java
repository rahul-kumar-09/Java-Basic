package Core;
import java.util.*;
public class L11_Two_D_Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // set number of rows
        System.out.println("Enter the value for rows: ");
        int rows = sc.nextInt();

        // set number of column
        System.out.println("Enter the value for cols: ");
        int cols = sc.nextInt();

        // declare array for row and cols
        int[][] numbers = new int[rows][cols];

        //insert value for row and cols
        // insert Matrix value
        System.out.println("Enter the value in Matrix: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        // Print Matrix
        System.out.println("Print Matrix ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(numbers[i][j] + "  ");
            }
            System.out.println();
        }

        //Which is search in array
        int x = 12;

        //here is search the element
        for (int i = 0; i < rows; i++){
            for (int j = 0; j <cols; j++){
                if (numbers[i][j] == x){
                    System.out.println("X found at location " + i + " " + j );
                }
            }
        }





    }
}
