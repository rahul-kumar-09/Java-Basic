package OOPs;
class  A {
    public void test(){
        System.out.println("This is Base class");
    }
}

class B extends  A{
    public void test(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class C extends B{
    public void test(int l, int h){
        System.out.println(1/2*l*h);
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args){
        C t1 = new C();
        t1.test();
        t1.test(2,4);
    }
}
