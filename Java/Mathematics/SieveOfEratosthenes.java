package Mathematics;
import java.util.Scanner;
import java.util.Arrays;
public class SieveOfEratosthenes{
    public static boolean isPrime(int n){
        if(n==1)return false;
        if(n==2 || n==3)return true;
        if(n%2==0 || n%3==0)return false;
        
        for(int i=5; i*i<=n; i+=6){
            if(n%i==0 || n%(i+2)==0)return false;
        }
        return true;
    }
    public static void primeNumbers1(int n){
        if(n<=1)return;
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    //implementation of SieveOfEratosthenes algorithms
    public static void primeNumbers2(int n){
        if(n<=1)return;

        boolean prime[]=new boolean[n+1];
        Arrays.fill(prime, true);

        // Arrays.fill(prime, 1);
        // for(int i=2; i<=n;i++){
        //     prime[i]=1;
        // }
        
        for(int i=2; i<=n; i++){
            if(prime[i]==true){
                System.out.print(i+" ");
                int x=i*i;
                while(x<=n){
                    prime[x]=false;
                    x+=i;
                }
            }
        }

        // for(int i=2; i<=n; i++){
        //     if(prime[i]==1){
        //         System.out.print(i+" ");
        //     }
        // }
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
            primeNumbers2(n);
            System.out.println();
            testcase--;
        }
        sc.close();
    }
}