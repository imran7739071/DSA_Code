package Arrays;
import java.util.*;
//Q:-Maximum consecutive 1's
// 4
// 6 0 1 1 0 1 0
// 4 1 1 1 1
// 4 0 0 0 0
// 9 1 0 1 1 1 1 0 1 1

public class MaximumConsecutiveOne{
    //soln1.......tc=O(n).......sc=O(1)
    public static int maximumConsecutiveOne_m1(int []arr, int n){
        int maxCnt=0;
        int cnt=0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                cnt=0;
            }else{
                cnt++;
                maxCnt=Math.max(maxCnt,cnt);
            }
        }
        return maxCnt;
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

            int res=maximumConsecutiveOne_m1(arr,n);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}