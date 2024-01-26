package OOPs;
class Shapes{
    public void area(){
        System.out.println("Displays Area");
    }
}
class Triangles extends Shapes{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
public class SingleInheritance {
    public static void main(String[] args){
        Triangles t1 = new Triangles();
        t1.area();
        t1.area(5,5);
    }
}
