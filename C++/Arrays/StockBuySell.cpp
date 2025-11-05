#include<bits/stdc++.h>
using namespace std;

//Q:- stock buy and sell, you can hold maximum 1 stock at a time
//5 6 5 3 8 12
//11 4 6 5 3 8 12 10 6 18 5 16
//4 20 18 14 15
//5 6 6 9 7 7 

//soln1..........tc=O(n).....sc=O(1)
int stockBuySell_m1(int *arr, int n){
    int bp=arr[0];
    int sp=0;
    int i=1;
    int profit=0;
    while(i<n){
        while(i<n && arr[i]<=arr[i-1]){
            bp=arr[i];
            i++;
        }
        while(i<n && arr[i]>=arr[i-1]){
            sp=arr[i];
            i++;
        }
        
        if(sp>bp){
            profit+=sp-bp;
        }
        sp=0;

    }
    return profit;
}

//soln2.........O(n)....sc=O(1).....samilar concept to above but easy implementation
int stockBuySell_m2(int *arr, int n){
    int profit=0;
    for(int i=1; i<n; i++){
        if(arr[i]>arr[i-1]){
            profit+=arr[i]-arr[i-1];
        }
    }
    return profit;
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
        
        int res=stockBuySell_m1(arr,n);
        cout<<res;
        cout<<"\n";
    }
    return 0;
}