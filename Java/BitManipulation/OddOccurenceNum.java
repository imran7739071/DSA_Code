package BitManipulation;
import java.util.Scanner;


public class OddOccurenceNum{
    public static int oddOccurenceNum_m1(int v[]){
        int res=0;

        for(int i=0; i<v.length; i++){
            res=(res^v[i]);
        }
        return res;
    }

    //A[n]=[1....n+1], all num is exactly once so one num must be missing find out missing num
    //n=3, A[]={1,4,3}, output=2
    public static int oddOccurenceNum_m2(int v[]){
        int n=v.length;
        int res=n+1;

        for(int i=0; i<v.length; i++){
            res=res^v[i]^(i+1);
        }
        return res;
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
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt();
            }
            
            int res=oddOccurenceNum_m1(v);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}