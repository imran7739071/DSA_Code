package Recursion;
import java.util.Scanner;


public class PrintNtoOne{
    //print n to 1
    public static void print(int n){
        if(n==0)return;

        System.out.println(n);
        print(n-1);
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
            print(n);
            System.out.println();
            testcase--;
        }
        sc.close();
    }
}