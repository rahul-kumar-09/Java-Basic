package Core;
import java.util.*;

public class L8_Practice_Question {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three number for find Average: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        findAverage(n1, n2, n3);



    }

    private static void findAverage(int n1, int n2, int n3) {
        int ave = (n1 + n2 + n3)/2;
        System.out.print("The Average of three Number is: " + ave);

    }


}
