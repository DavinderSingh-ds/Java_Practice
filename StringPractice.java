public class StringPractice {
    public static void main(String[] args) {
        String a = "Tony";
        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i));
        }
        System.out.println();
        System.out.println(a);

        String b = "Tony";
        if (a.compareTo(b)==0) {
            System.out.println("String a and b are Equal");
        }
        else{
            System.out.println("String a and b are Not Equal");
        }
        String c = "Davinder Singh";
        if (a.compareTo(c)==0) {
            System.out.println("String a and c are Equal");
        }
        else{
            System.out.println("String a and c are Not Equal");
        }

        String d = "Hrithik Roshan";
        System.out.println(d);
        System.out.println(d="Jacqueline");

    }
}
