package Arrays;
import java.util.*;

//Q:-given n ranges, find the maximum appearing element in the ranges.
// 1
// 4
// 1 2 5 15
// 5 8 7 18


public class MaxAppearingElemInRanges{
    
    //soln1.........tc=O(n*maxRange).........sc=O(maxUniqueElem)
    public static int maxAppearingElemInRanges_m1(int []L, int []R, int n){
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0; i<n; i++){
            int left=L[i];
            int right=R[i];
            while(left<=right){
                m.put(left,m.getOrDefault(left,0)+1);
                left++;
            }
        }

        int res=-1;
        int elem=-1;
        for(Map.Entry<Integer,Integer>entry:m.entrySet()){
            if(res<entry.getValue()){
                elem=entry.getKey();
                res=entry.getValue();
            }
        }
        return elem;

    }

    //soln2.......tc=O(n)........sc=O(maxRange)
    public static int maxAppearingElemInRanges_m2(int []L, int []R, int n){
        int maxRange=0;
        for(int i=0; i<n; i++){
            maxRange=Math.max(maxRange,R[i]);
        }
        int [] freq=new int[maxRange+2];

        
        for(int i=0; i<n; i++){
            freq[L[i]]++;
            freq[R[i]+1]--;
        }

        int maxCnt=freq[0];
        int res=0;

        for(int i=1; i<=maxRange; i++){
            freq[i]+=freq[i-1];
            if(freq[i]>maxCnt){
                maxCnt=freq[i];
                res=i;
            }
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
        while(testcase>0){
            int n=sc.nextInt();
            
            int [] L=new int[n];
            int [] R=new int[n];
            for(int i=0; i<n; i++){
                L[i]=sc.nextInt();
            }
            for(int i=0; i<n; i++){
                R[i]=sc.nextInt();
            }
            
            int res=maxAppearingElemInRanges_m2(L,R,n);
            System.out.println(res);
            testcase--;
        }
        sc.close();
    }
}