package Recursion;
import java.util.Scanner;
import java.util.Arrays;
//Q:- we need to cut the rope in the pieces. the length of every piece after cut should be in set {a,b,c}
//return the number of piece as output
//this problem has better soln using DP

public class RopeCuttingProblem{
    
    //soln1..........tc=O(3^n).........sc=O(n/min(a,b,c))
    public static int ropeCutting_m1(int n, int a,int b, int c){
        if(n==0)return 0;
        if(n<0)return -1;

        int resA=ropeCutting_m1(n-a, a, b, c);
        int resB=ropeCutting_m1(n-b, a, b, c);
        int resC=ropeCutting_m1(n-c, a, b, c);

        int res = Math.max(resA, Math.max(resB, resC));

        if (res == -1) return -1;  // no valid cut possible
        return res + 1;            // add current cut
    }

    //soln2......memoization / Top-down DP.....tc=O(n).......sc=O(n)
    public static int ropeCutting_m2(int n, int a,int b, int c,int []dp){
        if(n==0)return 0;
        if(n<0)return -1;

        if(dp[n]!=-2)return dp[n];


        int resA=ropeCutting_m2(n-a, a, b, c,dp);
        int resB=ropeCutting_m2(n-b, a, b, c,dp);
        int resC=ropeCutting_m2(n-c, a, b, c,dp);

        int res=Math.max(resA, Math.max(resB, resC));

        dp[n]=res==-1?-1:res+1;

        return dp[n];
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
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            //int res=ropeCutting_m1(n, a, b, c);

            int []dp=new int[n+1];
            Arrays.fill(dp, -2);
            int ans=ropeCutting_m2(n, a,b,c,dp);
            System.out.println(ans);
            testcase--;
        }
        sc.close();
    }
}