#include<bits/stdc++.h>
using namespace std;

//Q:- Remove duplicate element from sorted array, return the size of unique elem, 
//eg. A=10,20,20,30,30,30,30   o/p:- 3,  A=10,20,30,-,-,-,-  duplicate elem moved to end
//eg. A=5,8,8,9,11,11,12,15    o/p:- 6  A=5,8,9,11,12,15,11,8, duplicate elem moved to end

//soln1.....tc=O(n)......sc=O(1)
int removeDuplicate(int arr[], int n){
    int x=1;
    for(int i=1; i<n; i++){
        if(arr[i]!=arr[i-1]){
            arr[x]=arr[i];
            x++;
        }
    }
    return x;

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
        int siz=removeDuplicate(arr,n);
        cout<<siz<<"\n";
        for(int x:arr){
            cout<<x<<" ";
        }
        cout<<"\n";
    }
    return 0;
}