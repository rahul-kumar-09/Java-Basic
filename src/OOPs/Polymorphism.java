package OOPs;


class Students{
    String name;
    int age;

    public void printInform(String name){
        System.out.println(name);
    }
    public void printInform(int age){
        System.out.println(age);
    }
    public void printInform(String name, int age){
        System.out.println(name + " " + age);
    }
}
public class Polymorphism {
    public static void main(String[] args){
        Students s1 = new Students();
        s1.age = 19;
        s1.name = "Rahul Kumar";
        s1.printInform(s1.age);
        s1.printInform(s1.name);
        s1.printInform(s1.name, s1.age);

    }
}
