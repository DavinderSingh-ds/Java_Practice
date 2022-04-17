//COunt number of digits excluding 5

public class Exc5 {
    public static void main(String[] args) {
     int number = 10234587;
     int count = 0;
     while (number!=0) 
     {
         int digit = number%10;
         if (digit!=5) {
             count++;
         }
         number /= 10;

     }   
     System.out.println("\nNumber of digits excluding 5 are : "+count+"\n");
    }
}