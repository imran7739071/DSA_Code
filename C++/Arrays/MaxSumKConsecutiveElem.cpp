#include<bits/stdc++.h>
using namespace std;

//Q:-find maximum sum of k consecutive element
// 2
// 6 1 8 30 -5 20 7 3
// 5 5 -10 6 90 3 2




//soln1......tc=O(n).......sc=O(1)
int maxSumKConsecutiveElem_m1(int *arr, int n, int k){
    if(n<k)return -1;
    int res=INT_MIN;
    int l=0, r=0;
    int sum=0;
    while(r<n){
        sum+=arr[r];
        if((r-l+1)==k){
            res=max(res, sum); 
            sum-=arr[l];
            l++;    
        }
        r++;
    }
    return res;
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
        int k;
        cin>>k;
        int res=maxSumKConsecutiveElem_m1(arr,n,k);
        cout<<res;
        cout<<"\n";
    }
    return 0;
}