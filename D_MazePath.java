
// Count total paths in a maze to move from (0,0) to (n,m)
// Can only move on the right and can only move down


public class D_MazePath {
    public static void main(String [] args){
        int n = 3;
        int m = 3;
        int i = 0;
        int j = 0;
        int result = mazePaths(i, j, n, m);
        System.out.println(result);

    }
    public static int mazePaths(int i, int j, int m, int n){
        if( i == n || j == m){
            return 0;
        }
        if(i== n-1 && j == m-1){
            return 1;

        }
        // downword movment
        int downPaths = mazePaths(i+1, j, n, m);
        int rightPaths = mazePaths(i, j+1, n, m);
        return downPaths + rightPaths;
    }
}
