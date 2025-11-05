#include<bits/stdc++.h>
using namespace std;

//Q:- Reverse given array
//eg. A=10,10,20   o/p:-  A=20,10,10
//eg. A=10,8,12,11,12,5    o/p:- A=5,12,11,12,8,10

//soln1.....tc=O(n)......sc=O(1)
void reverse(int arr[], int n){
    int l=0, r=n-1;
    while(l<r){
        swap(arr[l],arr[r]);
        l++;
        r--;
    }
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
        reverse(arr,n);
        for(int x:arr){
            cout<<x<<" ";
        }
        cout<<"\n";
    }
    return 0;
}