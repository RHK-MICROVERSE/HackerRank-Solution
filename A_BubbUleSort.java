// BUBBLE SORT COMPARE THE EACH NUMBER WITH THE NEXT ONE
// AND PRESERVE THE BIGGEST ONE AND PUSH IT AT THE END


public class A_BubbUleSort {
    
    
    public static void printArray(int arr[]){
        for( int i=0; i<arr.length; i++){
            System.out.println(arr[i]+"");
        }
    }
    
    
    public static void main(String[] args){
        int[] intArr = new int[] {7, 8, 3, 1,2 };
        // time complexity = 0(n^2)
        //Bubble sort
        for(int i=0; i<intArr.length-1; i++){
            for (int j=0; j<intArr.length-i-1; j++){
                if(intArr[j]>intArr[j+1]){
                    //Swap
                    int temp = intArr[j];
                    intArr[j] = intArr[j+1];
                    intArr[j+1] = temp;

                }

            }        
        }
        printArray(intArr);        
    }
    
}

/*
 * Sorting 10 elements 1,000 100,000 1,00,000
 * Bubble 414700 5177200 13520189700 N/A
 * Selection 444200 3481500 3583518300 N/A
 * Insertion 446600 2328700 755101400 N/A
 * Merge* 580800 1213000 21902400 210559800
 * Quick 615100 764700 12050700 78305100
 * 
 * Merge Sort* is stable and Quick Sort is unstable.
 * By Stable it each number must be printed in the exact
 * * the same order as they were received as input. ith
 * element will be printed in ith position and jthe
 * element will be printed in the jth position where both
 * the elements are having same value for an example
 * ith element = 1 and jth element = 1.
 * Sorting times are in neno seconds
 */