package Mathematics;
import java.util.Scanner;

public class Divisors{

    public static void allDivisors1(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void allDivisors2(int n){
        int i=1;
        while(i*i<n){
            if(n%i==0){
                System.out.print(i+" ");
            }
            i++;
        }
        
        while(i>=1){
            if(n%i==0){
                System.out.print((n/i)+" ");
            }
            i--;
        }
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
            allDivisors1(n);
            System.out.println();
            testcase--;
        }
        sc.close();
    }
}