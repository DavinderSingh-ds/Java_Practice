public class CompareString {
    public static void main(String[] args) {
        String a = "Davinder";
        String b = "Davinder";
        String c = "Singh";
        if (a.compareTo(b)==0) {
            System.out.println("a and b are Equal");
        }else{
            System.out.println("a and b are Not Equal");
        }
        if (a.compareTo(c)==0) {
            System.out.println(" a and c are Equal");
        }else{
            System.out.println("a and c are Not Equal");
        }
    }
}
