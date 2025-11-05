package Introduction;
import java.util.Scanner;

public class SumOfNaturalNumber{

    public static void sumOfNaturalNumber1(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                sum++;
            }
        }
        System.out.println("sum: "+sum);
    }

    public static void sumOfNaturalNumber2(int n){
        int sum=0;
        for(int i=0; i<=n; i++){
            sum+=i;
        }
        System.out.println("sum: "+sum);
    }

    public static void sumOfNaturalNumber3(int n){
        int sum=0;
        sum=n*(n+1)/2;
        System.out.println("sum: "+sum);
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
            sumOfNaturalNumber2(n);
            testcase--;
        }
        sc.close();
    }
}