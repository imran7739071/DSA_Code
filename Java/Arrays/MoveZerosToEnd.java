package Arrays;
import java.util.*;

//Q:- move zeros to the end without disturbing the order of the elem
//eg. A=8 5 0 10 0 20  o/p:- A=8 5 10 20 0 0

public class MoveZerosToEnd{

    //soln1....tc=O(n)......sc=O(1)
    public static void moveZerosToEnd(int []arr, int n){
        int x=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                int temp=arr[x];
                arr[x]=arr[i]; 
                arr[i]=temp;
                x++;
            }
        }
        return ;
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
            
            moveZerosToEnd(arr,n);
            for(int a:arr){
                System.out.print(a+" ");
            }
            System.out.println();
            testcase--;
        }
        sc.close();
    }
}