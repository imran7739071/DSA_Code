#include<bits/stdc++.h>
using namespace std;

//Q:- Second largest elem in array, if not exist then return -1
//eg. A=10,10,10   o/p:-  -1
//eg. A=10,8,12,11,12,5    o/p:- 11

//soln1.....tc=O(2n)......sc=O(1)
int secLargestElem_m1(int arr[], int n){
    if(n<=0)return -1;
    
    int large=arr[0];
    for(int i=1; i<n; i++){
        large=max(large, arr[i]);
    }

    int secLarge=-1;
    for(int i=0; i<n; i++){
        if(arr[i]<large){
            secLarge=max(secLarge,arr[i]);
        }
    }
    return secLarge;
}

//soln2.......tc=O(n).....sc=O(1)
int secLargestElem_m2(int arr[], int n){
    if(n<=0)return -1;
    
    int large=arr[0];
    int secLarge=-1;
    for(int i=0; i<n; i++){
        if(arr[i]>large){
            secLarge=large;
            large=arr[i];
        }else if(arr[i]<large){
            secLarge=max(secLarge,arr[i]);
        }
    }
    return secLarge;
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

        cout<<secLargestElem_m2(arr,n);
        cout<<"\n";
    }
    return 0;
}