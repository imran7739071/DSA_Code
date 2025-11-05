package Revision;
import java.util.*;

public class Solution{
    public static int soln(int []arr, int sum, int currSum, int i){
        if(i==arr.length){
            if(currSum==sum){
                return 1;
            }
            return 0;
        }

        int include=soln(arr, sum, currSum+arr[i], i+1);
        int exclude=soln(arr, sum, currSum, i+1);
        return include+exclude;
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
            int sum=sc.nextInt();
            int res=soln(arr, sum, 0, 0);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}