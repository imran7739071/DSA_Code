package Arrays;
import java.util.*;
//Q:-Maximum subarray sum
// 6
// 7 2 3 -8 7 -1 2 3
// 3 5 8 3
// 3 -6 -1 -8
// 3 6 -2 5
// 7 -5 1 -2 3 -1 2 -2
// 6 -3 8 -2 4 -5 6

public class MaxSubarraySum{
    //soln1.......tc=O(n).......sc=O(1)
    public static int maxSubarraySum_m1(int []arr, int n){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            maxSum=Math.max(maxSum,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
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

            int res=maxSubarraySum_m1(arr,n);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}