
/*  HackerRank: VARARGS - SIMPLE ADDITION
    JAVA 7
    Problem no: 52
 */

import java.lang.reflect.Method;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;

//\Write your code here
class Add {
    public void add(int... arr){
                int total = 0;
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
            if(i==arr.length-1){
                System.out.print(arr[i] + "=");
            }
            else{
                System.out.print(arr[i] + "+");
            }
        }
        System.out.println(total);
    }
}


public class AdditionHRJ7 {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++){
                if(set.contains(methods[i].getName())){
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());
            }
            if(overload) {
                throw new Exception("Overloading not allowed");
                }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
