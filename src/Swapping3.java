
// How to swap two number without using + and - operator
public class Swapping3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        //Before swapping
        System.out.println("Before swapping: -> " + a + " " + b);

        // Swapping logic using XOR (^) operator
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        //After swapping
        System.out.println("After swapping:  -> " + a + " " + b);

    }
}
