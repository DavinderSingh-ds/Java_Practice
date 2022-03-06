class ArrayTraversal_ForEach{
    static void func1(int a[]){
        for (int i : a) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int a[] = {1,3,2,4,5,7};
        func1(a);
    }
}