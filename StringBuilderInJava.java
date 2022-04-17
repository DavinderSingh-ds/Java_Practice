public class StringBuilderInJava {
    public static void main(String[] args) {
        // it takes so much time to run so we can use stringbuilder in java
        // it makes so much strings in java due to this previious string is deleted then new String is created
        String str1 = "Da";
        String str2 = str1 + "vi";
        String str3 = str2+"nder";
        System.out.println(str3);
        
        // StringBuilder
        // it points to only one String

        StringBuilder str = new StringBuilder();
        // add the String to StringBuilder Object
        str.append("Davi");
        char ch = str.charAt(1);
        System.out.println("StringBuilder Object" + " contains = " + str);
        System.out.println("Character at Position 1" + " in StringBuilder = " + ch);
    }
}
