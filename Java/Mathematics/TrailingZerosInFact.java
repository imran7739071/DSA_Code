package Mathematics;
import java.util.Scanner;
public class TrailingZerosInFact{
    public static int trailingZeros(int n){
        int count=0;
        for(int i=5; i<=n; i*=5){
            count=count+(n/i);
        }
        return count;
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
            int res=trailingZeros(n);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}