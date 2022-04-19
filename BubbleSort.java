public class BubbleSort {
    public static void main(String[] args) {
        int arr[]= {12,3,45,32,56,78,3,10,0,1,122};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        // for (int element:arr) {
        //     System.out.print(element+" ");
        // }
        for (int i = 0; i < arr.length; i++) {
            int a=arr[i];
            System.out.print(a+" ");
        }
    }
}
