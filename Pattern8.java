import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter the number : ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n-i; j++) {
                    System.out.print(" ");    
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(i+" ");
                }
                System.out.println();       
            }
        }
    }
}
