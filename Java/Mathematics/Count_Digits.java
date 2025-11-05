package Mathematics;
import java.util.Scanner;
public class Count_Digits {
    
    public static void countDigits1(int n){
        long val = Math.abs((long)n);
        if (val == 0) {
            System.out.println("Digit count: 1");
            return;
        }
        int count = 0;
        while (val > 0) {
            val = val / 10;
            count++;
        }
        System.out.println("Digit count: " + count);
    }

    public static void countDigits2(int n){
        if (n == 0) {
            System.out.println("Digit count: 1");
            return;
        }
        double val = Math.abs((double) n);
        int count = (int) Math.floor(Math.log10(val)) + 1;
        System.out.println("Digit count: " + count);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int testcase = sc.nextInt();
        while (testcase > 0 && sc.hasNextInt()){
            int n = sc.nextInt();
            countDigits0(n);
            testcase--;
        }
        sc.close();
    }
}