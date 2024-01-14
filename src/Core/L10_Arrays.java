package Core;
import java.util.*;
public class L10_Arrays {
    //Linear Search Algo.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       // simpleArray();
       // predefinedArray();

        System.out.print("Enter the size of Array ");
        int size = sc.nextInt();
        int[] number = new int[size];

        //Enter the element by user
        System.out.println("\n Enter the value of Array: ");
        for (int i = 0; i < size; i ++){
            number[i] = sc.nextInt();
        }

        //found the element by user
        System.out.println("Found the Elements: ");
        int x = sc.nextInt();

        // print the element, Which entered by user
        for (int i = 0; i < number.length; i++){
            if (number[i] == x){
                System.out.println(x + " found at index : " + i);
            }
        }




   /*     System.out.println("Entered Arrays");
        for (int i = 0; i < size; i ++){
            System.out.println(number[i]);  //Automatic initialization null -> 0,  because it is declared in int type
        }
*/


    }



    private static void predefinedArray() {
        int[] marks = {98, 88, 89};
        for (int i = 0; i < 3; i ++){
            System.out.println(marks[i]);
        }
    }

    private static void simpleArray() {
        int[] marks = new int[3];
      //  int marks[] = new int[3];

        marks[0] = 98;
        marks[1] = 88;
        marks[2] = 89;

        for (int i = 0; i < 3; i ++){
            System.out.println(marks[i]);
        }

        // System.out.print(marks[0]);
    }

}
