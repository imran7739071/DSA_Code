#include<bits/stdc++.h>
using namespace std;

//Q:- find out maximum value of A[j]-A[i] such that j>i
//eg. A=2 3 10 6 4 8 1 o/p:- 8
//eg. A=7 9 5 6 3 2 o/p:- 2
//e.g A=30 10 8 2  o/p:- -2


//soln1.....tc=O(n^2).....sc=O(1)
int maximumDifference_m1(int arr[], int n){
    int maxi=INT_MIN;

    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            maxi=max(maxi, arr[j]-arr[i]);
        }
    }
    return maxi;
}

//soln2.....tc=O(n)....sc=O(1)
int maximumDifference_m2(int arr[], int n){
    int res=arr[1]-arr[0];
    int minValue=arr[0];

    for(int i=1; i<n; i++){
        res=max(res, arr[i]-minValue);
        minValue=min(minValue, arr[i]);
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
        
        cout<<maximumDifference_m2(arr,n);
        cout<<"\n";
    }
    return 0;
}