package Arrays;
import java.util.*;

//Q:- find out the frequency of each elem in sorted array


public class FrequencyInSortedArray{
    

    //soln1.....tc=O(n).....sc=O(n)
    public static void printFrequency_m1(int []arr, int n){
        Map<Integer, Integer>m=new HashMap<>();
        for(int i=0; i<n; i++){
            m.put(arr[i], m.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer, Integer>it:m.entrySet()){
            System.out.println(it.getKey()+"->"+it.getValue());
        }
        return;
    }

    //soln2........O(n)........sc=O(1)
    public static void printFrequency_m2(int []arr, int n){
        int i=0;
        while(i<n){
            int item=arr[i];
            int cnt=0;
            while(i<n && item==arr[i]){
                i++;
                cnt++;
            }
            System.out.println(item+"->"+cnt);
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

            printFrequency_m2(arr,n);
            System.out.println();
            testcase--;
        }
        sc.close();
    }
}