package OOPs;


interface Animals{
     public void walks();
}

interface Herbivore {
    void eyes();
}

class Horses implements Animals, Herbivore{

    @Override
    public void walks() {
        System.out.println("Walk on 4 legs");
    }

    @Override
    public void eyes() {
        System.out.println("Animals have 2 eyes");
    }
}


public class Interface {
    public static void main(String[] args){
        Horses h1 = new Horses();
        h1.walks();
        h1.eyes();
    }
}
