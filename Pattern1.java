import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j<=i; j++) {
                    int sum = i+j;
                    if (sum%2==0) {
                        System.out.print("0");
                    }
                    else{
                        System.out.print("1");
                    }
                }
                System.out.println();
            }
        
        }
       finally{
           System.out.println("done");
       }
    }
}
