#include<bits/stdc++.h>
using namespace std;

//Q:-given n ranges, find the maximum appearing element in the ranges.
// 1
// 4
// 1 2 5 15
// 5 8 7 18



    
//soln1.........tc=O(n*maxRange).........sc=O(maxUniqueElem)
int maxAppearingElemInRanges_m1(int *L, int *R, int n){
    map<int,int>m;
    for(int i=0; i<n; i++){
        int left=L[i];
        int right=R[i];
        while(left<=right){
            m[left]++;
            left++;
        }
    }

    int maxCnt=-1;
    int elem=-1;
    for(auto entry:m){
        if(maxCnt<entry.second){
            elem=entry.first;
            maxCnt=entry.second;
        }
    }
    return elem;

}

//soln2.......tc=O(n)........sc=O(maxRange)
int maxAppearingElemInRanges_m2(int *L, int *R, int n){
    int maxRange=0;
    for(int i=0; i<n; i++){
        maxRange=max(maxRange,R[i]);
    }
    int freq[maxRange+2]={};

    
    for(int i=0; i<n; i++){
        freq[L[i]]++;
        freq[R[i]+1]--;
    }

    int maxCnt=freq[0];
    int elem=0;

    for(int i=1; i<=maxRange; i++){
        freq[i]+=freq[i-1];
        if(freq[i]>maxCnt){
            maxCnt=freq[i];
            elem=i;
        }
    }
    return elem;
}

int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        cin>>n;
        int L[n]={};
        int R[n]={};
        for(int i=0; i<n; i++){
            int x;
            cin>>x;
            L[i]=x;
        }
        for(int i=0; i<n; i++){
            int x;
            cin>>x;
            R[i]=x;
        }
        int res=maxAppearingElemInRanges_m2(L,R,n);
        cout<<res;
        cout<<"\n";
    }
    return 0;
}