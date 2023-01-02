
// LinkedList under the COLLECTION FRAMEWORK format


import java.util.LinkedList;

public class ELinkedList2 {
    public static void main(String [] args){
        // Create a linkedList
        LinkedList <String> lList = new LinkedList<String>();
        
        // Adding element in the LinkedList in the start/beginning
        lList.addFirst("a");
        lList.addFirst("is");
        // Print the LinkedList
        System.out.println(lList);

        // Adding am element at the end
        lList.addLast("List");
        System.out.println(lList);

        // Adding an element at the start
        lList.addFirst("This");
        System.out.println(lList);

        // Adding an element at the start
        lList.addFirst("Alpha");
        System.out.println(lList);

        // Deleteing an element at the start
        lList.removeFirst();
        System.out.println(lList);

        // Adding an element at the end
        lList.addLast("Romeo");
        System.out.println(lList);

        // Deleting an element at the end
        lList.removeLast();
        System.out.println(lList);

        // Size does not count Null as a node
        System.out.println("Size of the LinkedList is: " + lList.size());

        // how to iterat a LinkedList
        for(int i=0; i<lList.size(); i++){
            System.out.print(lList.get(i) + " -> ");
        }
        System.out.println("NULL");

    }
    
}
