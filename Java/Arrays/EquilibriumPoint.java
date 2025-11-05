package Arrays;
import java.util.*;

//Q:-given an array of integers. find if it has equilibrium point. (sum on left & right side will be equal)
// 4
// 7 3 4 8 -9 20 6
// 3 4 2 -2
// 3 4 2 2
// 3 2 -2 4




public class EquilibriumPoint{
    
    //soln1.....O(n^2).........sc=O(1)
    public static boolean equilibriumPoint_m1(int [] arr, int n){
        int leftSum=0;
        int rightSum;
        for(int i=0; i<n; i++){
            
            rightSum=0;
            for(int j=i+1; j<n; j++){
                rightSum+=arr[j];
            }
            if(leftSum==rightSum)return true;
            leftSum+=arr[i];
        }
        return false;
    }

    //soln2.......tc=(n)......sc=O(n)
    public static boolean equilibriumPoint_m2(int [] arr, int n){
        int [] leftSum=new int[n];
        leftSum[0]=arr[0];
        int [] rightSum=new int[n];
        rightSum[n-1]=arr[n-1];

        for(int i=1; i<n; i++){
            leftSum[i]=leftSum[i-1]+arr[i];
        }
        for(int i=n-2; i>=0; i--){
            rightSum[i]=rightSum[i+1]+arr[i];
        }

        for(int i=0; i<n; i++){
            if(i==0 && rightSum[i+1]==0)return true;
            else if(i==n-1 && leftSum[i-1]==0)return true;
            else if(i!=0 && i!=n-1 && leftSum[i-1]==rightSum[i+1])return true;
        }
        return false;
    }

    //soln3.......tc=(n)......sc=O(1)
    public static boolean equilibriumPoint_m3(int [] arr, int n){
        int totalSum=0;
        for(int i=0; i<n; i++)totalSum+=arr[i];

        int leftSum=0;
        for(int i=0; i<n; i++){
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) return true;
            leftSum += arr[i];
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
            boolean res=equilibriumPoint_m3(arr,n);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}