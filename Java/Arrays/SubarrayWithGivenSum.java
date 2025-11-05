package Arrays;
import java.util.*;

//Q:-given unsorted array of non -ve int. find if there is a subarray with given sum
// 4
// 6 1 4 20 3 10 5 33
// 7 1 4 0 0 3 10 5 7
// 2 2 4 3
// 3 2 4 3 3


public class SubarrayWithGivenSum{
    //soln1......tc=O(n).......sc=O(1)
    public static boolean subarrayWithGivenSum_m1(int arr[], int n, int k){
                
        int l=0, r=0;
        int sum=0;
        while(r<n){
            sum+=arr[r];
            while(l<r && sum>k){
                sum-=arr[l];
                l++;
            }
            if(sum==k)return true;
            r++;
        }
        return false;
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

            boolean res=subarrayWithGivenSum_m1(arr,n,k);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}