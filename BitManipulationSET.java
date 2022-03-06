//Set 2nd bit or index 1 of number 0101 which is = 5
public class BitManipulationSET {
        public static void main(String[] args) {
            int n = 5;
            int pos = 1;
            int bitMask = 1<<pos;
            int newNumber = bitMask | n;
                System.out.println(newNumber);
        }
}
