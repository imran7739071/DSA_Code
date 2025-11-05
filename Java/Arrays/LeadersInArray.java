package Arrays;
import java.util.*;

//Q:- AN elem is leader if all the elem in right is lesser than this
//eg. A=1 2 3 4 5  o/p:- 5
//eg. A=2 4 5 6 4  o/p:- 6 4
//e.g A=7 10 18 10 16 12  o/p:- 18 16 12

public class LeadersInArray{

    //soln1.....tc=O(n).....sc=O(1)
    public static void leaders_m1(int []arr, int n){
        int maxi=arr[n-1];
        System.out.print(maxi+" ");

        for(int i=n-2; i>=0; i--){
            if(arr[i]>maxi){
                maxi=arr[i];
                System.out.print(maxi+" ");
            }
        }
        return;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt()){
            sc.close();
            return;
        }
        int testcase=sc.nextInt();
        while(testcase>0){
            int n=sc.nextInt();
            
            int [] arr=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }

            leaders_m1(arr,n);
            System.out.println();
            testcase--;
        }
        sc.close();
    }
}