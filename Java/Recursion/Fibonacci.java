package Recursion;
import java.util.Scanner;


public class Fibonacci{
    public static int fib(int n){
        if(n==0 || n==1)return n;

        return fib(n-1)+fib(n-2);
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
            int res=fib(n);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}