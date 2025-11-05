package BitManipulation;
import java.util.Scanner;


public class KthBit{
    public static boolean isSet1(int n, int k){
        k=k-1;
        int res=((n>>k) & 1);
        return res>=1? true:false;
    }
    public static boolean isSet2(int n, int k){
        k=k-1;
        int res=(n& (1<<k));
        return res>=1?true:false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt()){
            sc.close();
            return;
        }
        int testcase=sc.nextInt();
        while(testcase>0 && sc.hasNextInt()){
            int n=sc.nextInt();
            int k=sc.nextInt();
            boolean res=isSet1(n,k);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}