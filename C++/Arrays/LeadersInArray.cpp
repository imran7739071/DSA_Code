#include<bits/stdc++.h>
using namespace std;

//Q:- AN elem is leader if all the elem in right is lesser than this
//eg. A=1 2 3 4 5  o/p:- 5
//eg. A=2 4 5 6 4  o/p:- 6 4
//e.g A=7 10 18 10 16 12  o/p:- 18 16 12


//soln1.....tc=O(n).....sc=O(1)
void leaders_m1(int arr[], int n){
    int maxi=arr[n-1];
    cout<<maxi<<" ";

    for(int i=n-2; i>=0; i--){
        if(arr[i]>maxi){
            maxi=arr[i];
            cout<<maxi<<" ";
        }
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
        
        leaders_m1(arr,n);
        cout<<"\n";
    }
    return 0;
}