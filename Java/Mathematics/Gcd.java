package Mathematics;
import java.util.Scanner;

public class Gcd{
    public static int gcd1(int a, int b){
        int res=Math.min(a,b);
        while(res>0){
            if(a%res==0 && b%res==0)break;
            res--;
        }
        return res;
    }
    public static int gcd2(int a, int b){
        if(b==0)return a;

        return gcd2(b, a%b);
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
            int res=gcd1(a,b);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}