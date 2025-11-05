#include<bits/stdc++.h>
using namespace std;

//Q:-Maximum Circular subarray sum
// 5
// 3 10 5 -5
// 4 5 -2 3 4
// 5 8 -4 3 -5 4
// 4 -3 4 6 -2 
// 6 3 -4 5 6 -8 7



//soln1.......tc=O(n^2).......sc=O(1)
int maxCircularSubarraySum_m1(int *arr, int n){
    int maxSum=INT_MIN;
    int sum=0;

    for(int i=0; i<n; i++){
        sum=arr[i];
        maxSum=max(maxSum, sum);
        int j=(i+1)%n;
        while(j<n && j!=i){
            sum+=arr[j];
            maxSum=max(maxSum, sum);
            j=(j+1)%n;
        }
    }
    return maxSum;
}


int normalMaxSum(int *arr, int n){
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

//soln2.......tc=O(n).......sc=O(1)
int maxCircularSubarraySum_m2(int *arr, int n){
    
    int max_normal=normalMaxSum(arr,n);

    //This correctly avoids the case where all numbers are negative (since circular sum would incorrectly give 0).
    if(max_normal<0)return max_normal;

    int arr_sum=0;
    for(int i=0; i<n; i++){
        arr_sum+=arr[i];
        arr[i]=-arr[i];
    }

    int max_circular=arr_sum+normalMaxSum(arr,n);
    return max(max_circular, max_normal);
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
        
        int res=maxCircularSubarraySum_m2(arr,n);
        cout<<res;
        cout<<"\n";
    }
    return 0;
}