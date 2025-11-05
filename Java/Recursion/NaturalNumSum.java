package Recursion;
import java.util.Scanner;


public class NaturalNumSum{
    //tc=O(n).......sc=O(n)-sc due to recursion call stack
    public static int naturalNumSum(int n){
        if(n==1)return n;

        return  n+naturalNumSum(n-1);
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
            int res=naturalNumSum(n);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}