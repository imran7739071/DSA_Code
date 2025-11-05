package Arrays;
import java.util.*;

//Q:- Trapping rain water
// 3
// 5 4 6 5 3 8
// 3 3 2 1
// 6 4 2 0 3 2 5

public class TrappingRainWater{
   

    //soln1....tc=O(n).......sc=O(n)
    public static int trappingRainWater_m1(int []arr, int n){
        int leftMax[]=new int[n];
        int rightMax[]=new int[n];
        int water=0;

        leftMax[0]=arr[0];
        rightMax[n-1]=arr[n-1];

        for(int i=1; i<n; i++){
            leftMax[i]=Math.max(arr[i], leftMax[i-1]);
            rightMax[n-i-1]=Math.max(arr[n-i-1], rightMax[n-i]);
        }

        for(int i=0; i<n; i++){
            //cout<<leftMax[i]<<"-"<<rightMax[i]<<endl;
            water+=(Math.min(leftMax[i], rightMax[i])-arr[i]);
        }
        return water;
    }


    //soln2.......tc=O(n)......sc=O(1)
    public static int trappingRainWater_m2(int []arr, int n){
        int leftMax=0;
        int rightMax=0;
        int water=0;

        int left=0, right=n-1;
        while(left<right){
            if(arr[left]<arr[right]){
                leftMax=Math.max(leftMax, arr[left]);
                water+=(leftMax-arr[left]);
                left++;
            }else{
                rightMax=Math.max(rightMax, arr[right]);
                water+=(rightMax-arr[right]);
                right--;
            }
        }
        return water;
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

            int res=trappingRainWater_m1(arr,n);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}