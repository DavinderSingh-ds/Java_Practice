public class Recursion1 {
    static void func1(int n){
        if (n==6) {
            return;
        }
        System.out.println(n);
        func1(n+1);       
    }
    public static void main(String[] args) {
        func1(1);
    }
}
