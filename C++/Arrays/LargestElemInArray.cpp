#include<bits/stdc++.h>
using namespace std;

//soln1.....tc=O(n)......sc=O(1)
int largestElem_m1(int arr[], int n){
    if(n<=0)return -1;
    
    int large=arr[0];
    for(int i=1; i<n; i++){
        large=max(large, arr[i]);
    }
    return large;
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

        cout<<largestElem_m1(arr,n);
        cout<<"\n";
    }
    return 0;
}