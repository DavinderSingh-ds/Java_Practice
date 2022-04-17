public class StringImmutable {
    public static void main(String[] args) {
        // it can't be concatenate with same String
        String a = "Davinder Singh";
        a.concat("From Punjab");
        System.out.println(a);

        String b = "Ketika Sharma";
        String c = a+" "+a;
        System.out.println(c);
        System.out.println(a+" "+b);
    }
}
