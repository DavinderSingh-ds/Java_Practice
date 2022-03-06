import java.util.Scanner;

public class Pattern6{
    public static void main(String[] args) {
        System.out.print("Enter value of n : ");
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            for (long i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                long spaces = 2*(n-i);
                for (long j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (long j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (long i = n-1; i >= 1; i--) {
                for (long j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                long spaces = 2*(n-i);
                for (long j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (long j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (long i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                long spaces = 2*(n-i);
                for (long j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (long j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (long i = n-1; i >= 1; i--) {
                for (long j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                long spaces = 2*(n-i);
                for (long j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (long j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }
        
    }
}
