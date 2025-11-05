package Arrays;
import java.util.*;

//Q:- stock buy and sell, you can hold maximum 1 stock at a time
// 4
// 5 6 5 3 8 12
// 10 4 6 5 3 8 12 10 6 18 5
// 4 20 18 14 15
// 5 6 6 9 7 7 

public class StockBuySell{
    //soln1..........tc=O(n).....sc=O(1)
    public static int stockBuySell_m1(int []arr, int n){
        int bp=arr[0];
        int sp=0;
        int i=1;
        int profit=0;
        while(i<n){
            while(i<n && arr[i]<=arr[i-1]){
                bp=arr[i];
                i++;
            }
            while(i<n && arr[i]>=arr[i-1]){
                sp=arr[i];
                i++;
            }

            if(sp>bp){
                profit+=sp-bp;
            }
            sp=0;
        }
        return profit;
    }

    //soln2.........O(n)....sc=O(1).....samilar concept to above but easy implementation
    public static int stockBuySell_m2(int []arr, int n){
        int profit=0;
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]){
                profit+=arr[i]-arr[i-1];
            }
        }
        return profit;
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

            int res=stockBuySell_m2(arr,n);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}