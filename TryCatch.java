import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter value of a : ");
                int a = sc.nextInt();
                System.out.println("Enter value of b : ");
                int b = sc.nextInt();
                System.out.println("Division is : ");
                int c = a/b;
                System.out.println(c);
                System.out.println("Remainder is : ");
                int d = a%b;
                System.out.println(d);
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        finally{
            System.out.println("Problem Solved");
        }
    }
}
