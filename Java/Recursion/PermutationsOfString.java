package Recursion;
import java.util.Scanner;
import java.util.*;
//Q->print all permuation of string

public class PermutationsOfString{
    
    public static String swap(String s, int i, int j){
        StringBuilder sb=new StringBuilder(s);
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
        s=sb.toString();
        return s;
    }

    //soln1.....tc=O(n!)........sc=O(n)
    public static void permutations(String s, int pos){
        if(pos==s.length()-1){
            System.out.print(s+" ");
            return;
        }

        for(int i=pos; i<s.length(); i++){
            s=swap(s, pos, i);
            permutations(s, pos+1);
            s=swap(s, pos, i);
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
            permutations(s,0);
            System.out.println();
            testcase--;
        }
        sc.close();
    }
}