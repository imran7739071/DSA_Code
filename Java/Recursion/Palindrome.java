package Recursion;
import java.util.Scanner;


public class Palindrome{
    //check given string is palindrom or not using recursion
    //s="abbcbba" -palindrome
    //s="abba" -palindrome
    //tc=O(n).......sc=O(n)-sc due to recursion call stack

    
    public static String reverse(String s){
        if(s.length()<=1)return s;
        return reverse(s.substring(1))+s.charAt(0);
    }
    public static boolean isPalindrome(String s, int l, int r){
        //return reverse(s)==s;
        if(l>=r){
            return true;
        }

        if(s.charAt(l)!=s.charAt(r))return false;
        else{
            return isPalindrome(s, l+1, r-1);
        }
    }
    
   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt()){
            sc.close();
            return;
        }
        int testcase=sc.nextInt();
        while(testcase>0){
            String s=sc.next();
            boolean res=isPalindrome(s,0, s.length()-1);
            System.out.println(res);

            //System.out.println(reverse(s));
            testcase--;
        }
        sc.close();
    }
}