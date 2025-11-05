package BitManipulation;
import java.util.Scanner;


public class CountSetBit{
    public static int countSetBit1(int n){
        int res=0;
        while(n>0){
            res=res+(n&1);
            n=(n>>1);
        }
        return res;
    }

    public static int countSetBit2(int n){
        int res=0;
        while(n>0){
            n=(n& (n-1));
            res++;
        }
        return res;
    }

    //lookup table method
    static int[] table = new int[256];
    public static void initialize(){
        table[0]=0;
        for(int i=1; i<256; i++){
            table[i]= (i&1)+table[i/2];
        }
    }
    public static int countSetBit3(int n){
        return table[n& 0xff]+
                table[(n>>8)& 0xff]+
                table[(n>>16)& 0xff]+
                table[(n>>24)& 0xff];
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
            initialize();
            int res=countSetBit2(n);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}