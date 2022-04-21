// Interface will have no constructor
interface Yogging {
    void walk();    
}
class B implements Yogging{
    @Override
    public void walk() {
        System.out.println("Hi Let's Go!");
    }    
}
public class InterfaceWalk implements Yogging {
    public void walk(){
        System.out.println("Hi Let's Walk!");
    }
    public static void main(String[] args) {
        InterfaceWalk a =  new InterfaceWalk();
        a.walk();
    }
}