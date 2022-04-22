public class EquilibriumIndex {
    public static int sumSubArray(int a[],int start,int end){
            int sum =0;
            for (int i = start;i<=end; i++) {
                sum += a[i];
            }
            return sum;
    }
    public static void main(String[] args) {
        int a[]={9,4,2,5,2};
        
        for (int i = 0; i < a.length-1; i++) {
            int left_sum = sumSubArray(a, 0, i-1);
            int right_sum = sumSubArray(a, i+1, a.length-1);

            if (left_sum == right_sum) {
                System.out.print(i);
                break;
            }
        }
    }
}
