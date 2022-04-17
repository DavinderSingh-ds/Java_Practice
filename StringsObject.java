public class StringsObject {
    //Strings are objects in java
    // so new string not equal
    public void StringsEquality(){
        if (new String("Davinder") == new String("Davinder")) {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    } 
    public static void main(String[] args) {
       StringsObject obj = new StringsObject();
       obj.StringsEquality();
    }
}
