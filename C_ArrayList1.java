
import java.util.ArrayList;
import java.util.Collections;

public class C_ArrayList1 {
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        // Adding an element
        arrList.add(0);
        int alpha = 10;
        arrList.add(alpha);
        arrList.add(13);
        arrList.add(14);
        System.out.println(arrList);

        // Getting the Element inside the ArrayList
        int element1 = arrList.get(0);
        int element2 = arrList.get(0);
        int element3 = arrList.get(0);
        System.out.println(element1);
        System.out.println(element2);
        System.out.println(element3);

        // How to add any integer in between two element as
        // add comman adds an element at the end of the ArrayList
        // requeires two variables first is the index where the element
        // should be added and then the value here idex=1 element = 11
        arrList.add(1, 9);
        System.out.println(arrList);

        // Setting new value of an existing element
        // requeires two variables first is the index where the element
        // should be added and then the value here idex=0 element = 0 to 9
        arrList.set(0,5);
        System.out.println(arrList);

        // Delete an element we will remove the last element
        arrList.remove(arrList.size()-1);
        System.out.println(arrList);
        // Size of the arrList
        System.out.println(arrList.size());

        // Loop to iterrate arrrList
        int lengthList = arrList.size();
        for(int i=0; i<lengthList; i++){
            System.out.println(arrList.get(i));
        }
        // Sorting the list
        Collections.sort(arrList); //Ascending order
        System.out.println(arrList);
        Collections.sort(arrList, Collections.reverseOrder()); // Descending order
        System.out.println(arrList);






    }
    
}
