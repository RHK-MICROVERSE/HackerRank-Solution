import java.util.ArrayList;

// Print all the subsets of a set of first n natural numbers
// set of 3 natual numbers are 1, 2, 3
// For string please do the subsequnce
// Time complexcity 2^n




public class D_SubSet {
    public static void findSubset(int numSet, ArrayList<Integer> subSet){
        // BaseCase
        if(numSet == 0){
            printSubSet(subSet);
            return;
        }
        // adding the number from the set if comes
        subSet.add(numSet);
        findSubset(numSet-1, subSet);

        // not adding if the number does not come
        subSet.remove(subSet.size()-1);
        findSubset(numSet - 1, subSet);
    }

    public static void printSubSet(ArrayList <Integer> subSet){
        for (int i=0; i<subSet.size(); i++){
            System.out.print(subSet.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){

        int numSet = 3;
        ArrayList<Integer> subSet = new ArrayList<Integer>();
        findSubset(numSet, subSet);


    }
    
}
