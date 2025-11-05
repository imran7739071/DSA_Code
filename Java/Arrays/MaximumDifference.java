package Arrays;
import java.util.*;

//Q:- find out maximum value of A[j]-A[i] such that j>i
//eg. A=2 3 10 6 4 8 1 o/p:- 8
//eg. A=7 9 5 6 3 2 o/p:- 2
//e.g A=30 10 8 2  o/p:- -2


public class MaximumDifference{
    //soln1.....tc=O(n^2).....sc=O(1)
    public static int maximumDifference_m1(int arr[], int n){
        int maxi=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                maxi=Math.max(maxi, arr[j]-arr[i]);
            }
        }
        return maxi;
    }

    //soln2.....tc=O(n)....sc=O(1)
    public static int maximumDifference_m2(int arr[], int n){
        int res=arr[1]-arr[0];
        int minValue=arr[0];

        for(int i=1; i<n; i++){
            res=Math.max(res, arr[i]-minValue);
            minValue=Math.min(minValue, arr[i]);
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

            int res=maximumDifference_m1(arr,n);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}