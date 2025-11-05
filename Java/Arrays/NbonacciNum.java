package Arrays;
import java.util.*;

//Q:- N-bonacci number, print first m N-bonacci number
// 4
// 2 7
// 3 8
// 4 10
// 5 15 


public class NbonacciNum{

    //soln1......tc=O(m).......sc=O(m)
    public static void nbonacciNum_m1(int n, int m){
        int [] fibs=new int [m];
        Arrays.fill(fibs,0);

        fibs[n-1]=1;
        int sum=1;
        int l=0;
        for(int r=n; r<m && l<r; r++){
            fibs[r]=sum;
            sum=sum+fibs[r]-fibs[l];
            l++;
        }

        for(int x:fibs){
            System.out.print(x+" ");
        }
    }

    //soln2......tc=O(m).......sc=O(m)
    public static void nbonacciNum_m2(int n, int m){
        Deque<Integer>window=new ArrayDeque<>();
        for(int i=0;i<n-1; i++){
            window.addLast(0);
            System.out.print(0+" ");
        }
        window.addLast(1);
        System.out.print(1+" ");
        int sum=1;
        
        for(int r=n; r<m; r++){
            int next=sum;
            System.out.print(next+" ");

            sum=sum+next-window.peekFirst();
            window.pollFirst();
            window.addLast(next);
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
            int m=sc.nextInt();

            nbonacciNum_m2(n,m);
            System.out.println();
            testcase--;
        }
        sc.close();
    }
}