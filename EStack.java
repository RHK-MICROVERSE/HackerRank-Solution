

public class EStack {
    public int size;
    
    EStack(){
        this.size = 0;
    }

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data; // "this" refereces to above instane variable
            this.next = null; // Call the above pointer by "this"
        }
    }

    public static class Stack{
        public static Node head;
        // Checking if linkedList is empty 
        public static boolean isEmpty(){
            return head == null;
        }
    
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }


    public static void main(String[]args){
        new Stack();
        EStack.Stack.push(1);
        EStack.Stack.push(2);
        EStack.Stack.push(3);
        EStack.Stack.push(4);
        while(!EStack.Stack.isEmpty()){
            System.out.println(EStack.Stack.peek());
            EStack.Stack.pop();
            System.out.println(EStack.Stack.peek());
        }
    }
}
