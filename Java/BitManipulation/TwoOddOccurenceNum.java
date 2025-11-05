package BitManipulation;
import java.util.Scanner;


public class TwoOddOccurenceNum{
    public static void twoOddOccurenceNum_m1(int v[]){
        int Xor=0, res1=0, res2=0;
        for(int i=0; i<v.length; i++){
            Xor=Xor^v[i];
        }
        int sn=Xor^(~(Xor-1));//right most set bit

        for(int i=0; i<v.length; i++){
            if((v[i]& sn)!=0){
                res1=res1^v[i];
            }else{
                res2=res2^v[i];
            }
        }
        System.out.print(res1+" "+res2);
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
            
            twoOddOccurenceNum_m1(v);
            System.out.println();
            testcase--;
        }
        sc.close();
    }
}