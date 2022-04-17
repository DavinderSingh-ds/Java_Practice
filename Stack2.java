public class Stack2 {
    public static void main(String[] args) {
        StackClass s = new StackClass();
        s.push(23);
        s.push(45);
        s.push(78);
        s.push(67);
        while (!StackClass.isEmpty()) {
            System.out.println(StackClass.peek());
            StackClass.pop();
        }
    }
}
