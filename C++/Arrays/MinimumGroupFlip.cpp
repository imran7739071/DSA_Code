#include<bits/stdc++.h>
using namespace std;

//Q:-minimum group flip to make the each binary element same
// 6
// 11 1 0 0 0 1 0 0 1 1 1 1
// 3 1 1 1 
// 2 0 1
// 11 1 1 0 0 0 1 1 1 0 0 1
// 11 0 0 1 1 0 0 0 1 1 0 0
// 11 0 0 1 1 1 0 0 0 0 1 1

//soln1......tc=O(n).......sc=O(1)
void flip_m1(int * arr, int n){
    int zeros=0;
    int ones=0;
    if(arr[0]==0)zeros=1;
    else{
        ones=1;
    }
    int last=arr[0];

    for(int i=0; i<n; i++){
        if(last!=arr[i]){
            last=arr[i];
            if(last==0)zeros++;
            else{
                ones++;
            }
        }
    }

    int minFlip=min(zeros,ones);
    int elem;
    if(minFlip==zeros)elem=0;
    else{
        elem=1;
    }

    for(int i=0; i<n; i++){
        if(arr[i]==elem){
            int s=i;
            while(i<n && arr[i]==elem)i++;
            int end=i-1;
            cout<<"From "<<s<<" to "<<end<<"\n";
        }
    }
}

//soln2.......tc=O(n)........sc=O(1)
void flip_m2(int * arr, int n){
    for(int i=1; i<n; i++){
        if(arr[i]!=arr[i-1]){
           if(arr[i]!=arr[0]){
                cout<<"From "<<i<<" to ";
           }else{
                cout<<(i-1)<<"\n";
           }
        }
    }
    if(arr[n-1]!=arr[0]){
        cout<<(n-1)<<"\n";
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
        
        flip_m1(arr,n);
        cout<<"\n";
    }
    return 0;
}