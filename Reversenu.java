public class Reversenu {
    static int digit;
    static int count = 0;
    public static void ReverseNumber(int number){
       while (number!=0) {
           digit = number%10;
           number /= 10;
           System.out.print(digit);
       }             
    }
    public static void main(String[] args) {
        System.out.print("Reverse Number is : ");
        ReverseNumber(1234);
        
    }
}