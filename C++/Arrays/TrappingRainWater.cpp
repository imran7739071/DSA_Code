#include<bits/stdc++.h>
using namespace std;

//Q:- Trapping rain water
// 3
// 5 4 6 5 3 8
// 3 3 2 1
// 6 4 2 0 3 2 5

//soln1....tc=O(n).......sc=O(n)
int trappingRainWater_m1(int *arr, int n){
    int leftMax[n]={0};
    int rightMax[n]={0};
    int water=0;

    leftMax[0]=arr[0];
    rightMax[n-1]=arr[n-1];

    for(int i=1; i<n; i++){
        leftMax[i]=max(arr[i], leftMax[i-1]);
        rightMax[n-i-1]=max(arr[n-i-1], rightMax[n-i]);
    }

    for(int i=0; i<n; i++){
        //cout<<leftMax[i]<<"-"<<rightMax[i]<<endl;
        water+=(min(leftMax[i], rightMax[i])-arr[i]);
    }
    return water;
}


//soln2.......tc=O(n)......sc=O(1)
int trappingRainWater_m2(int *arr, int n){
    int leftMax=0;
    int rightMax=0;
    int water=0;

    int left=0, right=n-1;
    while(left<right){
        if(arr[left]<arr[right]){
            leftMax=max(leftMax, arr[left]);
            water+=(leftMax-arr[left]);
            left++;
        }else{
            rightMax=max(rightMax, arr[right]);
            water+=(rightMax-arr[right]);
            right--;
        }
    }
    return water;
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
        
        int res=trappingRainWater_m2(arr,n);
        cout<<res;
        cout<<"\n";
    }
    return 0;
}