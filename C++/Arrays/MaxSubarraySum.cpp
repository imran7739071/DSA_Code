#include<bits/stdc++.h>
using namespace std;

//Q:-Maximum subarray sum
// 6
// 7 2 3 -8 7 -1 2 3
// 3 5 8 3
// 3 -6 -1 -8
// 3 6 -2 5
// 7 -5 1 -2 3 -1 2 -2
// 6 -3 8 -2 4 -5 6


//soln1.......tc=O(n).......sc=O(1)
int maxSubarraySum_m1(int *arr, int n){
    int maxSum=INT_MIN;
    int sum=0;
    for(int i=0; i<n; i++){
        sum+=arr[i];
        maxSum=max(maxSum,sum);
        if(sum<0){
            sum=0;
        }
    }
    return maxSum;
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
        
        int res=maxSubarraySum_m1(arr,n);
        cout<<res;
        cout<<"\n";
    }
    return 0;
}