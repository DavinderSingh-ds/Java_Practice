public class SearchInArray {
    public static void main(String[] args) {
        int a[] = new int[4];
        a[0] = 23;
        a[1] = 45;
        a[2] = 6;
        a[3] = 77;
        int x = 6;
        System.out.println(a[3]);
        for (int i = 0; i < a.length; i++) {
            if (a[i]==x) {
                System.out.println("Number is found at index " + i);
            }
        }
    }
}
