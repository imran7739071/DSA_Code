package Recursion;
import java.util.Scanner;
import java.util.*;
//Q:- tower of Hanoi

public class TowerOfHanoi{
    
    //soln1.......tc=O(n^2).......sc=O(n)
    public static void towerOfHanoi(int n, char A, char B, char C){
        if(n==1){
            System.out.println("move disc "+n+" from "+A+" to "+C);
            return;
        }
        
        
        //Move n-1 disks from A → B (using C as auxiliary).
        towerOfHanoi(n-1, A, C, B); 

        //Move the nth (largest) disk from A → C.
        System.out.println("move disc "+n+" from "+A+" to "+C);


        //Move n-1 disks from B → C (using A as auxiliary)
        towerOfHanoi(n-1, B, A, C);

    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt()){
            sc.close();
            return;
        }
        int testcase=sc.nextInt();
        while(testcase>0){
            int n=sc.nextInt();
           
            towerOfHanoi(n, 'A', 'B', 'C');

            System.out.println();
            testcase--;
        }
        sc.close();
    }
}