package Mathematics;
import java.util.Scanner;

public class PrimeFactors{
    public static void primeFactor1(int n){

        for(int i=2; i*i<=n; i++){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        if(n>1){
            System.out.print(n+" ");
        }
        return;
    }

    public static void primeFactor2(int n){
        
        while(n%2==0){
            System.out.print(2+" ");
            n=n/2;
        }

        while(n%3==0){
            System.out.print(3+" ");
            n=n/3;
        }

        for(int i=5; i*i<=n; i+=6){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
            while(n%(i+2)==0){
                System.out.print((i+2)+" ");
                n=n/(i+2);
            }
        }
        if(n>3){
            System.out.print(n+" ");
        }
        return;
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
            primeFactor2(n);
            System.out.println();
            testcase--;
        }
        sc.close();
    }
}