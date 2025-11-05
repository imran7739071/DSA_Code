package Recursion;
import java.util.Scanner;
import java.util.*;

public class SubsetGeneration{
    
    //generate subset using recursion
    //I have solved this problem using bitwise operator
    //soln1........tc=O(n * 2^n)........sc=O(n)
    public static void subsetGeneration(List<Integer>v, List<Integer>subset, List<List<Integer>>ans, int pos){
        if(pos==v.size()){
            ans.add(new ArrayList<>(subset));
            return;
        }

        //include pos elem
        subset.add(v.get(pos));
        subsetGeneration(v, subset,ans, pos+1);


        //exclude pos elem
        subset.remove(subset.size()-1);
        subsetGeneration(v, subset,ans, pos+1);
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
            List<Integer>v=new ArrayList<>();
            for(int i=0; i<n; i++){
                v.add(sc.nextInt());
            }

            
            List<List<Integer>>ans=new ArrayList<>();

            subsetGeneration(v,new ArrayList<>(), ans, 0);

            //printing
            for(List<Integer>subset:ans){
                for(int x:subset){
                    System.out.print(x+",");
                }
                System.out.println();
            }

            System.out.println();
            testcase--;
        }
        sc.close();
    }
}