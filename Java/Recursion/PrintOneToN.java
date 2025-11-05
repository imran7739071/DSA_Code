package Recursion;
import java.util.Scanner;


public class PrintOneToN{
    //print 1 to n
    public static void print(int n){
        if(n==0)return;
        print(n-1);
        System.out.println(n);
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