package Mathematics;
import java.util.Scanner;

public class Palindrome{
    public static void isPalindrome1(int n){
        if(n < 0){
            System.out.println("It's not a palindrome");
            return;
        }
        String str=Integer.toString(Math.abs(n));
        String rev=new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            System.out.println("Palindrome ");
        }else{
            System.out.println("It's not a palindrom");
        }
    }

    public static void isPalindrome2(int n){
        if(n < 0){
            System.out.println("It's not a palindrome");
            return;
        }
        String str =Integer.toString(n);
        int s=0, e=str.length()-1;
        
        while(s++<=e--){
            if(str.charAt(s)!=str.charAt(e)){
                System.out.println("It's not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome ");

    }

    public static void isPalindrome3(int n){
        if(n < 0){
            System.out.println("It's not a palindrome");
            return;
        }
        int rev=0;
        int temp=n;

        while(temp>0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        if(rev==n){
            System.out.println("Palindrome ");
            return;
        }else{
            System.out.println("It's not a palindrome");
            return;
        }

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
            isPalindrome2(n);
            testcase--;
        }
        sc.close();
    }
}