package Arrays;
import java.util.*;

//Q:-minimum group flip to make the each binary element same
// 6
// 11 1 0 0 0 1 0 0 1 1 1 1
// 3 1 1 1 
// 2 0 1
// 11 1 1 0 0 0 1 1 1 0 0 1
// 11 0 0 1 1 0 0 0 1 1 0 0
// 11 0 0 1 1 1 0 0 0 0 1 1

public class MinimumGroupFlip{
    //soln1......tc=O(n).......sc=O(1)
    public static void flip_m1(int [] arr, int n){
        int zeros=0;
        int ones=0;
        if(arr[0]==0)zeros=1;
        else{
            ones=1;
        }
        int last=arr[0];

        for(int i=0; i<n; i++){
            if(last!=arr[i]){
                last=arr[i];
                if(last==0)zeros++;
                else{
                    ones++;
                }
            }
        }

        int minFlip=Math.min(zeros,ones);
        int elem;
        if(minFlip==zeros)elem=0;
        else{
            elem=1;
        }

        for(int i=0; i<n; i++){
            if(arr[i]==elem){
                int s=i;
                while(i<n && arr[i]==elem)i++;
                int end=i-1;
                //cout<<"From "<<s<<" to "<<end<<"\n";
                System.out.println("From "+s+" to "+end);
            }
        }
    }

    //soln2.......tc=O(n)........sc=O(1)
    public static void flip_m2(int [] arr, int n){
        for(int i=1; i<n; i++){
            if(arr[i]!=arr[i-1]){
                if(arr[i]!=arr[0]){
                    System.out.print("From "+i+" to ");
                }else{
                    System.out.println(i-1);
                }
            }
        }
        if(arr[n-1]!=arr[0]){
            System.out.println(n-1);
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

            flip_m2(arr,n);
            System.out.println();
            testcase--;
        }
        sc.close();
    }
}