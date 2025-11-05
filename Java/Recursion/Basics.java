package Recursion;
import java.util.Scanner;


public class Basics{
    public static void print(int n){
        if(n==0)return;

        System.out.println(n);
        print(n-1);
    }
   

    //gues the output for different input
    public static void fun1(int n){
        if(n==0)return;
        System.out.println(n);
        fun1(n-1);
        System.out.println(n);
    }

    public static void fun2(int n){
        if(n==0)return;

        fun1(n-1);
        System.out.println(n);
        fun1(n-1);
    }

    public static int fun3(int n){
        if(n==1)return 0;
        else {
            return 1+fun3(n/2);
        }
    }

    public static void fun4(int n){
        if(n==0)return;
        fun4(n/2);
        System.out.print((n%2)+" ");
    }

    public static void fun5(int n){
        if(n==0)return ;

        fun5((n>>1));
        System.out.print((n&1)+" ");
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
            fun5(n);
            System.out.println();
            testcase--;
        }
        sc.close();
    }
}