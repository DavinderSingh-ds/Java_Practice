public class StringBuilderInJava {
    public static void main(String[] args) {
        // it takes so much time to run so we can use stringbuilder in java
        // it makes so much strings in java due to this previious string is deleted then new String is created
        String str = "Da";
        String str2 = str + "vi";
        String str3 = str2+"nder";
        System.out.println(str3);
        
        // StringBuilder
        // it points to only one String

        StringBuilder sb = new StringBuilder("Davinder");
        System.out.println(sb);
    }
}
