#include<bits/stdc++.h>
using namespace std;


//Q:-given unsorted array of non -ve int. find if there is a subarray with given sum
// 4
// 6 1 4 20 3 10 5 33
// 7 1 4 0 0 3 10 5 7
// 2 2 4 3
// 3 2 4 3 3


//soln1......tc=O(n).......sc=O(1)
bool subarrayWithGivenSum_m1(int *arr, int n, int k){
            
    int l=0, r=0;
    int sum=0;
    while(r<n){
        sum+=arr[r];
        while(l<r && sum>k){
            sum-=arr[l];
            l++;
        }
        if(sum==k)return true;
        r++;
    }
    return false;
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
        int res=subarrayWithGivenSum_m1(arr,n,k);
        cout<<res;
        cout<<"\n";
    }
    return 0;
}