#include<bits/stdc++.h>
using namespace std;

//Q:-Maximum consecutive 1's
// 4
// 6 0 1 1 0 1 0
// 4 1 1 1 1
// 4 0 0 0 0
// 9 1 0 1 1 1 1 0 1 1


//soln1.......tc=O(n).......sc=O(1)
int maximumConsecutiveOne_m1(int *arr, int n){
    int maxCnt=0;
    int cnt=0;
    for(int i=0; i<n; i++){
        if(arr[i]==0){
            cnt=0;
        }else{
            cnt++;
            maxCnt=max(maxCnt,cnt);
        }
    }
    return maxCnt;
}

int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        cin>>n;
        int arr[n]={};
        for(int i=0; i<n; i++){
            int x;
            cin>>x;
            arr[i]=x;
        }
        
        int res=maximumConsecutiveOne_m1(arr,n);
        cout<<res;
        cout<<"\n";
    }
    return 0;
}