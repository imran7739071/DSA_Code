#include<bits/stdc++.h>
using namespace std;

//Q:- move zeros to the end without disturbing the order of the elem
//eg. A=8 5 0 10 0 20  o/p:- A=8 5 10 20 0 0

//soln1....tc=O(n)......sc=O(1)
void moveZerosToEnd(int *arr, int n){
    int x=0;
    for(int i=0; i<n; i++){
        if(arr[i]!=0){
            int temp=arr[x];
            arr[x]=arr[i]; 
            arr[i]=temp;
            x++;
        }
    }
    return ;
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
        moveZerosToEnd(arr,n);
        for(int x:arr){
            cout<<x<<" ";
        }
        cout<<"\n";
    }
    return 0;
}