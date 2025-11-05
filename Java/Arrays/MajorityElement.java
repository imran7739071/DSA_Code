package Arrays;
import java.util.*;
//Q:-find out majority element if it exist and return index of that
// 5
// 5 8 3 4 8 8
// 6 3 7 4 7 7 5
// 7 20 30 40 50 50 50 50
//3 3 9 3
//5 6 8 7 6 5

public class MajorityElement{
    //soln1......tc=O(n^2)......sc=O(1)
    public static int majorityElement_m1(int []arr, int n){
        int cnt;
        for(int i=0; i<n; i++){
            cnt=0;
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            if(cnt>n/2)return i;
        }
        return -1;
    }

    //soln2.......tc=O(n)..........sc=O(1)
    public static int majorityElement_m2(int []arr, int n){
        int candidate=arr[0];
        int vote=1;

        for(int i=1; i<n; i++){
            if(candidate==arr[i]){
                vote++;
            }else{
                vote--;
            }

            if(vote==0){
                candidate=arr[i];
                vote=1;
            }
        }

        int ans=-1;
        int cnt=0;
        
        for(int i=0; i<n; i++){
            if(candidate==arr[i]){
                cnt++;
                ans=i;
            }
        }
        //System.out.print(candidate+" "+cnt+" ");
        if(cnt>n/2)return ans;
        return -1;

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

            int res=majorityElement_m2(arr,n);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}