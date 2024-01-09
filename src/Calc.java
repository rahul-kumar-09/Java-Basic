import java.util.*;
public class Calc {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2st Number: ");
        int n2 = sc.nextInt();

        System.out.print("Please select +, -, * and / :  ");
        char os = sc.next().charAt(0);

        switch (os) {

            case '+' -> System.out.println("Sum of Two Number: " + (n1 + n2));
            case '-' -> System.out.println("Sub of Two Number: " + (n1 - n2));
            case '/' -> System.out.println("Div of Two Number: " + (n1 / n2));
            case '*' -> System.out.println("Mul of Two Number: " + (n1 * n2));
            default -> System.out.println("Invalid Option selected ");
        }

    }
}
