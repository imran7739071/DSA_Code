package Mathematics;
import java.util.Scanner;


public class Pow{
    //It will only work for n>=0
    public static double pow1(int x, int n){
        if(n==0)return 1;

        double res=1;
        while(n>0){
            res=res*x;
            n--;
        }
        return res;
    }

    //working for both +ve & -ve values of n also
    public static double pow2(int x, int n){
        if(n==0)return 1;
        int y=Math.abs(n);

        double res=1;
        while(y>0){
            res=res*x;
            y--;
        }
        return n>=0? res:(1/res);
    }


    //optimal soln
    public static double pow3(int x, int n){
        if(n==0)return 1;
        if(n==-1)return (1.0/x);
        if(n==1)return (x);


        
        double res=pow3(x, n/2);
        if(n<0 && n%2!=0)return res*res*(1.0/x);
        else if(n>0 && n%2!=0)return res*res*x;
        else{
            return res*res;
        }
    }

    public static double pow4(int x, int y){
        int n=Math.abs(y);
        if(n==0)return 1;
        double res=1;
        while(n>0){
            if((n&1)!=0){
                res=res*x;
            }
            x=x*x;
            n=n>>1;
        }
        return y>=0? res:(1/res);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt()){
            sc.close();
            return;
        }
        int testcase=sc.nextInt();
        while(testcase>0 && sc.hasNextInt()){
            int x=sc.nextInt();
            int n=sc.nextInt();
            double res=pow3(x,n);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}