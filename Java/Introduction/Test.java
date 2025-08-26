package Introduction;
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: \n");
        int a = sc.nextInt();

        System.out.print("Enter second number: \n");
        int b = sc.nextInt();

        // Processing
        int sum = a + b;

        // Giving output
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
