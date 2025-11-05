package BitManipulation;
import java.util.Scanner;


public class PowerOfTwo{
    public static boolean isPowerOfTwo_m1(int n){
        if(n==0)return false;
        while(n!=1){
            if(n%2!=0)return false;
            n=(n>>1);
        }
        return true;
    }
    public static boolean isPowerOfTwo_m2(int n){
        int setBits=Integer.bitCount(n);
        return setBits==1;
    }
    public static boolean isPowerOfTwo_m3(int n){
        if(n==0)return false;
        return (n& (n-1))==0 ? true:false;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt()){
            sc.close();
            return;
        }
        int testcase=sc.nextInt();
        while(testcase>0 && sc.hasNextInt()){
            int n=sc.nextInt();
            boolean res=isPowerOfTwo_m3(n);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}