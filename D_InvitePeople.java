// Find the number of ways in which you can invite n number
// of people to your party condition applies single or in pairs.


public class D_InvitePeople {
    public static void main(String[] args){
        int n = 4;
        int result = invitePeople(n);
        System.out.println(result);
    }
    
    public static int invitePeople(int n) {
        if(n <= 1){
            return 1;
        }


        // Call in Single 
        int ways1 = invitePeople(n-1);
        // Call in pairs
        int ways2 = (n-1) * invitePeople(n-2);
        return ways1 + ways2;


    }
    
}
