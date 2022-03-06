public class Arrayadv {
        static void func1(int a[],String b,int c[],boolean d){
            for (int i : a) {
                System.out.println(i);
            }
            String ds = b;
            System.out.println(ds);
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
            System.out.println("Next array");
            for (int i : c) {
                System.out.println(i);
            }
            
            System.out.println("Boolean value is : "+d);
        }

        void func2(){    
            System.out.println();
            String a = "Anne Hathaway";
            System.out.println("\t\tCrush is:\s"+a+"\n");
            System.out.println("\t\tCrush is:"+a+"\n");
        }

        public static void main(String[] args) {
            System.err.println("\n\nFirst Array is : ");
            int a[] = {1,3,2,4,5,7};
            String ds = "Davinder Singh";
            int bb[] = new int[] {2,4};
            int arr[] = new int[5];
            arr[2] = 2;
            func1(a,ds,bb,false);

            //object making
            Arrayadv obj = new Arrayadv();
            obj.func2();
        }
    
}
