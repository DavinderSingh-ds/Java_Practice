public class Pattern4{
    public static void main(String[] args) {
        int n = 5;
        //upper portion

        for (int i = 1; i <= n; i++) {
            //1st part stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //2nd part stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower portion
        //only upper for loop is changed else code remains same as upper portion
        for (int i = n-1; i >= 1; i--) {
            //1st part stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //2nd part stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



        
    }
}
