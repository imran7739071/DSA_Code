package Mathematics;
import java.util.Scanner;

public class LCM{
    public static int gcd(int a, int b){
        if(b==0)return a;

        return gcd(b, a%b);
    }
    public static int lcm1(int a, int b){
        for(int i=Math.max(a,b); i<=a*b; i++){
            if(i%a==0 && i%b==0)return i;
        }
        return a*b;
    }
    
    public static int lcm2(int a, int b){
        int hcf=gcd(a,b);
        int lcm=(a*b)/hcf;
        return lcm;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int testcase = sc.nextInt();
        while (testcase > 0 && sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res=lcm1(a,b);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}