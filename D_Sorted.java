

// Finding if an array is purely sorted in terms of increasing element
public class D_Sorted {
    public static void main(String[] args){
        int [] arr = {1, 2, 4, 4, 5};
        boolean result = isSorted(arr, 0);
        System.out.println(result);

    }
    public static boolean isSorted(int arr[], int idex){
        //BaseCase
        if(idex == arr.length-1){
            return true;
        }

        if(arr[idex] < arr[idex+1]){
            //arr is sorted until finished
            return isSorted(arr, idex+1);
        }
        else{
            return false;
        }

    }
    
}
