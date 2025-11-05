package Arrays;
import java.util.*;

//Q:-find maximum sum of k consecutive element
// 2
// 6 1 8 30 -5 20 7 3
// 5 5 -10 6 90 3 2



public class MaxSumKConsecutiveElem{
    //soln1......tc=O(n).......sc=O(1)
    public static int maxSumKConsecutiveElem_m1(int arr[], int n, int k){
        if(n<k)return -1;
        int res=Integer.MIN_VALUE;
        int l=0, r=0;
        int sum=0;
        while(r<n){
            sum+=arr[r];
            if((r-l+1)==k){
                res=Math.max(res, sum); 
                sum-=arr[l];
                l++;    
            }
            r++;
        }
        return res;
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

            int k=sc.nextInt();

            int res=maxSumKConsecutiveElem_m1(arr,n,k);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}