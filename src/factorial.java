import java.util.*;

// Find the factorial input by user.

public class factorial {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number for Factorial: ");
        int num = sc.nextInt();

        int fact = 1;
        for (int i=num; i>=1; i--){
            fact = fact * i;
        }
        System.out.println("Factorial is " + fact);

    }
}
