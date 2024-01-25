package OOPs;

// based class
class Shape{
    String color;
}

// derived class
class Triangle extends Shape{

}
public class Inheritance {
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.color = "Red";
        System.out.println(t1.color);
    }
}
