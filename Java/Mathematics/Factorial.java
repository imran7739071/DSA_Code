package Mathematics;
import java.util.Scanner;
public class Factorial{
    public static int factorial1(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial1(n-1);
    }

    public static int factorial2(int n){
        if(n==0 || n==1){
            return 1;
        }
        int res=1;
        for(int i=n; i>0; i--){
            res=res*i;
        }
        return res;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int testcase = sc.nextInt();
        while (testcase > 0 && sc.hasNextInt()){
            int n = sc.nextInt();
            int res=factorial1(n);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}