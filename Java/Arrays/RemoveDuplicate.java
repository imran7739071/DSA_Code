package Arrays;
import java.util.*;
//Q:- Remove duplicate element from sorted array, return the size of unique elem, 
//eg. A=10,20,20,30,30,30,30   o/p:- 3,  A=10,20,30,-,-,-,-  duplicate elem moved to end
//eg. A=5,8,8,9,11,11,12,15    o/p:- 6  A=5,8,9,11,12,15,11,8, duplicate elem moved to end


public class RemoveDuplicate{
    //soln1.....tc=O(n)......sc=O(1)
    public static int removeDuplicate(int []arr, int n){
        int x=1;
        for(int i=1; i<n; i++){
            if(arr[i]!=arr[i-1]){
                arr[x]=arr[i];
                x++;
            }
        }
        return x;
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
            
            int siz=removeDuplicate(arr,n);
            System.out.println(siz);
            for(int a:arr){
                System.out.print(a+" ");
            }
            System.out.println();
            testcase--;
        }
        sc.close();
    }
}