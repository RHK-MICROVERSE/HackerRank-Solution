

// LAWAYS USE LINKEDLIST WHEN WE NEED TO ADD MORE ELEMENT THEN
// SORTING. AS THE LINKEDLIST ADDING ELEMENT TIME COMPLEXICITY IS
// LESS THAN THAT OF ARRALIST. AND ALWAYS USE ARRAYLIST WHEN 
// WE NEED TO SORT THINGS MORE THAN ADDING NEW ELEMENTS


public class ELinkedList1 {
    // Need to create a HEAD before doing annything. So all the nodes
    // understand what is HEAD
    // Node head;
    private static ELinkedList1.Node head = null;
    // To find the size of the LinkedList creating a private variable
    private int size;
    // Creating a Constructor
    ELinkedList1(){
        this.size = 0;
    }

    //Creating a Node class to identify the pointer and head of the
    // linked list
    class Node{
        // Creating an Instance variable 
        String data;
        // Pointing the next node (If confused check file Pokamon and Main)
        Node next; 

        // Creating a constructor of the class Node
        Node(String data){
            this.data = data; // "this" refereces to above instane variable
            this.next = null; // Call the above pointer by "this"
            // To get the size we will add here the size
            size++;

        }

    }

    
    // We will check four operations

    /* ADDFIRST */
    public void addFirst(String data){
        // Creating the Node first
        Node newNode = new Node(data);
        // Now need to check if any LinkedList exists which we will check
        // through the existence of head
        // if not exists
        if(head == null){
            head = newNode; // head will be assign to newNode
            return;
        }
        // But if LinkedList Exists, the first node of the existing
        // LinkedList which is next to newNode or newNode.next will point
        // its' head towards newNode and head will be assigned to the newNode
        //If exists
        newNode.next = head; // was Point to Null now changed that to next node
        head = newNode;
        }

    /* ADDLAST */
    public void addLast(String data){
        // Creating the  new node first
        Node newNode = new Node(data);
        //and Need to check if LinkedList exists or not
        // if not exists
        if (head == null) {
            head = newNode; // head will be assign to newNode 
            return;
        }
        // If exists we will NEVER manupulate the head but we will
        // create current node and will remain the
        // original first node intact and manupulate the curretn node by
        // changing its value towards the next node until the currentNode next
        // will not become null. And once it is null we can add the new node
        Node currNode = head;
        while (currNode.next != null){
            // changing the current node to next node and going toward end
            currNode = currNode.next; 
        }
            currNode.next = newNode;
    }

    /* PRINT LINKEDLIST */
    public void printLinkedList(){
        // Need to check if the LinkedList exists or not
        if(head == null){
            System.out.println("LinkedList is empty.");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data +" -> ");
            // changing the current node to next node and going toward end
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }
    
    /* DELETEFIRST*/
    public void deleteFirst(){
        // Need to check if the LinkedList exists or not
        if (head == null) {
            System.out.println("LinkedList is empty.");
            return;
        }
        /* Option 1:
        Node currNode = head;
        currNode = currNode.next;
        head = currNode;*/
        // Option 2
        size--;
        head = head.next;
    }

    /* DELETELAST */
    public void deleteLast(){
        // Need to check if the LinkedList exists or not
        if (head == null) {
            System.out.println("LinkedList is empty.");
            return;
        }
        size--;
        // If there is only one Element in the LinkedList
        // then there will no next so to address that we need 
        // to add the  following codes
        if(head.next == null){
            head = null;
            return;
        }
        // To track both last node and last but one node we need to
        // define the followings;
        Node secondLast = head; // Defining the first node as secondLast
        Node lastNode = head.next; // Defining the second node as last node
        // Then we started the transversing by reaching the end
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast =  secondLast.next;
        }
        // Once we reach the end we just make the secondLast to null and
        // through that we have deleted the last node.
        secondLast.next = null;
    }

        /*SIZE OF THE LINKEDLIST */
        public int getSize(){
            return size;
        }

    

    public static void main(String[] args){
        // To create a linkedList we need to create an Object of our
        // own class that is E_LinkedList
         ELinkedList1 lList =  new ELinkedList1();
         // Adding element in the LinkedList in the start/beginning
         lList.addFirst("a");
         lList.addFirst("is");
         // Adding element in the LinkedList at the END
         lList.printLinkedList();
         System.out.println();

        // Adding am element at the end
         lList.addLast("List");
         lList.printLinkedList();
         System.out.println();

        // Adding an element at the start
         lList.addFirst("This");
         lList.printLinkedList();
         System.out.println();

        // Adding an element at the start
         lList.addFirst("Alpha");
         lList.printLinkedList();
         System.out.println();

        // Deleteing an element at the start
         lList.deleteFirst();
         lList.printLinkedList();
         System.out.println();

        // Adding an element at the end
         lList.addLast("Romeo");
         lList.printLinkedList();
         System.out.println();

         //Deleting an element at the end
         lList.deleteLast();
         lList.printLinkedList();
         System.out.println();
        
         // Size does not count Null as a node
         System.out.println("Size of the LinkedList is: " + lList.getSize());




    }
}
