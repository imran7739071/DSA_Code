package Recursion;
import java.util.Scanner;
import java.util.*;
//Q:- Josephus problem

public class Josephus{
    
    //soln1.....tc=O(n)........sc=O(n)
    public static int jos(int n, int k){
        if(n==1)return 0;

        else return (jos(n-1,k)+k)%n;
    }

    //Q->Josephus problem, circle begin with 1
    //soln1.......tc=O(n).......sc=O(n)
    public static int josVerson2(int n, int k){
        return jos(n,k)+1;
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
            int k=sc.nextInt();
            System.out.println(josVerson2(n, k));
            testcase--;
        }
        sc.close();
    }
}