package BitManipulation;
import java.util.Scanner;
//Power set using bitwise operator
// subset using bitwise operator

public class PowerSet{
    public static void powerSet_m1(String s){
        int n=s.length();
        int powSize=(int)Math.pow(2, n);

        for(int i=0; i<powSize; i++){
            String subset="";
            for(int j=0; j<n; j++){
                if( (i& (1<<j)) !=0){ // checking jth bit is set or not in i
                    subset+=s.charAt(j);
                }
            }
           System.out.println(subset);
        }
        return; 
        
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

            powerSet_m1(s);
            System.out.println();
            testcase--;
        }
        sc.close();
    }
}