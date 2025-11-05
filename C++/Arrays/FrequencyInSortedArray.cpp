#include<bits/stdc++.h>
using namespace std;

//Q:- find out the frequency of each elem in sorted array

//soln1.....tc=O(n).....sc=O(n)
void printFrequency_m1(int *arr, int n){
    map<int,int>m;
    for(int i=0; i<n; i++){
        m[arr[i]]++;
    }
    for(auto it:m){
        cout<<it.first<<"->"<<it.second<<"\n";
    }
    return;
}

//soln2........O(n)........sc=O(1)
void printFrequency_m2(int *arr, int n){
    int i=0;
    while(i<n){
        int item=arr[i];
        int cnt=0;
        while(i<n && item==arr[i]){
            i++;
            cnt++;
        }
        cout<<item<<"->"<<cnt<<"\n";
    }
    return;
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
        
        printFrequency_m2(arr,n);
        cout<<"\n";
    }
    return 0;
}