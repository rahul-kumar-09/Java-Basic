package OOPs;


class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write Something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class L24_OOps {
    public static void main(String[] args){
/*
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";
        pen1.printColor();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";
        pen2.printColor();
*/

/*
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 19;

        s1.printInfo();
*/

        Student s1 = new Student("Rahul", 20);
        s1.printInfo();

    }
}
