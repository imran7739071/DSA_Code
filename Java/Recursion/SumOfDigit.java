package Recursion;
import java.util.Scanner;
//find sum of digit using recursion
//tc=O(digits).......sc=O(digits)-sc due to recursion call stack

public class SumOfDigit{
    
    public static int sumOfDigit(int n){
        if(n<=9)return n;
        return (n%10)+sumOfDigit(n/10);
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
            int res=sumOfDigit(n);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}