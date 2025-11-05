#include<bits/stdc++.h>
using namespace std;

//Q:- check if the given array is sorted or not
//eg. A=10,10,20   o/p:-  Yes
//eg. A=10,8,12,11,12,5    o/p:- not

//soln1.....tc=O(n)......sc=O(1)
bool isSorted_m1(int arr[], int n){
    for(int i=1; i<n; i++){
        if(arr[i]<arr[i-1])return false;
    }
    return true;
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

        cout<<isSorted_m1(arr,n);
        cout<<"\n";
    }
    return 0;
}