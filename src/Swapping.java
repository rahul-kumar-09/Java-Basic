
// Swapping two number
public class Swapping {
    public static void main(String[] args){
        //Initialization
        int a = 10, b = 20;

        System.out.println("Before Swapping ");
        System.out.println("Value of a -> " + a);
        System.out.println("Value of b -> " + b);

        //Swapping using 3rd variable

        int c;
        c = a;
        a = b;
        b = c;

        System.out.println("Before Swapping ");
        System.out.println("Value of a -> " + a);
        System.out.println("Value of b -> " + b);

    }
}
