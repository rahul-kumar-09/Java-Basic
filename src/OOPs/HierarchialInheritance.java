package OOPs;


class baseClass{
    int a,b;
    String fName,lName;

}
class derivedClass extends baseClass{
    public void name(){
        fName = "Rahul";
        lName = "Kumar";
        System.out.println(fName + " " + lName);
    }
}
class derivedClass2 extends baseClass{
    public void num(){
        a = 10;
        b = 20;
        System.out.println(a + " " + b);

    }


}
public class HierarchialInheritance {
    public static void main(String[] args){
        derivedClass2 ob = new derivedClass2();
        ob.num();

        derivedClass ob1 = new derivedClass();
        ob1.name();

    }
}
