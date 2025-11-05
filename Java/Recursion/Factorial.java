package Recursion;
import java.util.Scanner;


public class Factorial{
    public static int fact(int n){
        if(n==0)return 1;
        return n*fact(n-1);
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
            int res=fact(n);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}