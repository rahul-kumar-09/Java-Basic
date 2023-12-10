
// Swapping two number without using 3rd variable.

public class Swapping2 {
    public static void main(String[] args){
        int a = 10, b = 20;

        //Before swapping
        System.out.println("Before Swapping -> " + a + " " + b);

        a = a + b; // 30 = 10 + 20
        b = a - b; // 10 = 30 - 20
        a = a - b; // 20 = 30 - 10

        // After swapping
        System.out.println("After Swapping  -> " + a + " " + b);
    }
}
