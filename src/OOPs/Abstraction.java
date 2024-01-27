package OOPs;


abstract class Animal{  //abstract class
    Animal(){
        System.out.println("This is constructor of Animal");
    }
    abstract void walk();  // abstract function
    public void eats(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Constructor of Horse");
    }
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class Cock extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.walk();
        horse.eats();

    }
}
