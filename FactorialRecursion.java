public class FactorialRecursion {
    public static int fact(int n){
        if (n==1||n==0) {
            return 1;
        }
        int fact_Num = fact(n-1);
        int fact_N= n*fact_Num;
        return fact_N;
    }
    public static void main(String[] args) {
        fact(5);
    }
}
