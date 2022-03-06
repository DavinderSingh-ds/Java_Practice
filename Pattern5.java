import java.util.Scanner;

public class Pattern5{
    public static void main(String[] args) {
        System.out.print("Enter value of n : ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n==65) {
                return;
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                int spaces = 2*(n-i);
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = n-1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                int spaces = 2*(n-i);
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                int spaces = 2*(n-i);
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = n-1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                int spaces = 2*(n-i);
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
