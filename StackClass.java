class StackClass{
    //creating stack 
    //use always linkedlist or arraylist in Stack bcz stack is so much hectic in array
    public static Node head;
    //if head == null return true else false
    public static boolean isEmpty(){
        return head == null;
    }
    public static class Node{
        int data;
        Node next;
        public Node(int d){
            this.data = d;
            next = null;
        }
    } 
    public void push(int d){
        //firstly we created a new Node with data and next value
        Node newNode = new Node(d);
        // if  head is empty or isEmpty is true then head = newNode
        if (isEmpty()) {
            head = newNode;
            return;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    public static int pop(){
        if (isEmpty()) {
            return -1;
        }
        else{
            int top = head.data;
            head = head.next;
            return top;
        }
    }
    public static int peek(){
        if (isEmpty()) {
            return -1;
        }
        else{
            return head.data;
        }
    }
    
    public static void main(String[] args) {
        StackClass s = new StackClass();
        s.push(2);
        s.push(5);
        s.push(43);
        s.push(90);
        //here 90 is on peek so that is popped out
        StackClass.pop();
        s.push(23);
        s.push(54);

        while(!StackClass.isEmpty()){
            System.out.println(StackClass.peek());
            StackClass.pop();
        }
    }
}