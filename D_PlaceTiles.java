// Place Tiles of size 1xm in a floor of size nxm



public class D_PlaceTiles {
    public static void main(String [] args){
        int n = 4;
        int m = 2;
        int totalPaths = placeTiles(n,m);
        System.out.println(totalPaths);

    }
    public static int placeTiles(int n, int m){
        // BaseCase
        if(n == m){
            return 2;            
        }
        if(n<m){
            return 1;
        }
        // vertical placement
        int verticalPlacement = placeTiles(n-m, m);
        // jorizontel placement
        int horizontalPlacement = placeTiles(n-1, m);

        return verticalPlacement + horizontalPlacement;

    }
    
}
