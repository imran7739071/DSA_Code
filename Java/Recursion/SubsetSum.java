package Recursion;
import java.util.Scanner;
import java.util.*;
//Q:-Subset Sum problem
//need optimization using DP

public class SubsetSum{
    
    //soln1.....tc=O(2^n)........sc=O(n)
    public static int subsetSum(int set[], int sum, int currSum,int pos){
        if(set.length==pos){
            if(currSum==sum){
                return 1;
            }
            return 0;
        }

        //including set[pos]
        int include=subsetSum(set,sum,currSum+set[pos],pos+1);

        //excluding set[pos]
        int exclude=subsetSum(set,sum, currSum,pos+1);

        return include+exclude;
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
            int []set=new int[n];
            for(int i=0; i<n; i++){
                set[i]=sc.nextInt();
            }
            int sum=sc.nextInt();
            int cnt=subsetSum(set,sum,0,0);
            System.out.println(cnt);
            testcase--;
        }
        sc.close();
    }
}