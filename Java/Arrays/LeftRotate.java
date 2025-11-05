package Arrays;
import java.util.*;

//Q:- Left rotate array by one
//eg. A=1 2 3 4 5  o/p:- A=2 3 4 5 1
//eg. A=2 4 5 6 4  o/p:- A=4 5 6 4 2

public class LeftRotate{

    //soln1....tc=O(n)......sc=O(1)
    public static void leftRotate(int []arr, int n){
        if(n<=1)return;
        int temp=arr[0];
        for(int i=1; i<n; i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return ;
    }

    //Q;- Left rotate by d
    //eg. A=1 2 3 4 5  d=2  o/p:- A=3 4 5 1 2

    //soln1.......tc=O(n)......sc=O(d)
    public static void leftRotateByD_m1(int []arr, int n, int d){
        if(n<=1)return;

        int temp[]=new int[d];
        for(int i=0; i<d; i++){
            temp[i]=arr[i];
        }

        for(int i=d; i<n; i++){
            arr[i-d]=arr[i];
        }

        for(int i=0; i<d; i++){
            arr[n-d+i]=temp[i];
        }
        
        return ;
    }


    //soln2.......tc=O(n*d)......sc=O(1)
    public static void leftRotateByD_m2(int []arr, int n, int d){
        if(n<=1)return;
        for(int i=0; i<d; i++){
            int temp=arr[0];
            for(int j=1; j<n; j++){
                arr[j-1]=arr[j];
            }
            arr[n-1]=temp;
        }
        return ;
    }

    public static void reverse(int []arr, int left, int right){
        while(left<right){
            //swap(arr[left], arr[right]);
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return;
    }

    //soln3.......tc=O(n)......sc=O(1)
   public static void leftRotateByD_m3(int []arr, int n, int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
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

            int d=sc.nextInt();
            
            leftRotateByD_m3(arr,n,d);
            for(int a:arr){
                System.out.print(a+" ");
            }
            System.out.println();
            testcase--;
        }
        sc.close();
    }
}