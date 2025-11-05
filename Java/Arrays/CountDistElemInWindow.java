package Arrays;
import java.util.*;

//Q:-count distinct element in every window of size k
// 1
// 7 1 2 1 3 4 3 3 4


public class CountDistElemInWindow{
    //soln1......tc=O(n*k).......sc=O(k)
    public static void countDistElemInWindow_m1(int arr[], int n, int k){
        for(int i=0; i<n-k+1; i++){
            Set<Integer>window=new HashSet<>();
            for(int j=i; j<i+k; j++){
                window.add(arr[j]);
            }
            System.out.print(window.size()+" ");
        }

    }

    //soln2......tc=O(n).......sc=O(k)
    public static void countDistElemInWindow_m2(int arr[], int n, int k){
        Map<Integer,Integer>freq=new HashMap<>();
        for(int i=0; i<k; i++){
            freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);
        }
        //// print distinct count for first window
        System.out.print(freq.size()+" ");

        for(int i=k; i<n; i++){
            //remove outgoing element
            int outgoing=arr[i-k];
            freq.put(outgoing, freq.get(outgoing)-1);
            if(freq.get(outgoing)==0){
                freq.remove(outgoing);
            }

            //add incoming element
            int incoming=arr[i];
            freq.put(incoming, freq.getOrDefault(incoming,0)+1);

            //// print distinct count
            System.out.print(freq.size()+" ");
        }
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

            countDistElemInWindow_m2(arr,n,k);
            System.out.println();
            testcase--;
        }
        sc.close();
    }
}