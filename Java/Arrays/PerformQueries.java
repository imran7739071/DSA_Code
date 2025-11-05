package Arrays;
import java.util.*;

//Q:-Given fixed size array and multiple queries of following types on the array, how to efficently perform these queries
//arr = [7, 2, 8, 3, 9, 6, 5, 4]
//Queries = (0,2), (1,3), (2,6)
// 1
// 7 2 8 3 9 6 5 4
// 3
// 0 2
// 1 3
// 2 6


public class PerformQueries{
    //soln1.........tc=O(n).........sc=O(n)
    public static void performQueries_m1(int []arr, int n, Scanner sc){
        int [] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1; i<n; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        
        int q=sc.nextInt();
        while(q>0){
            int l=sc.nextInt();
            int r=sc.nextInt();

            int sum=l==0? prefix[r]:prefix[r]-prefix[l-1];
            System.out.println(sum);
            q--;
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

            performQueries_m1(arr,n, sc);
            System.out.println();
            testcase--;
        }
        sc.close();
    }
}