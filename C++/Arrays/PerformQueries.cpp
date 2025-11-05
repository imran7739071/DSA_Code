#include<bits/stdc++.h>
using namespace std;


//Q:-Given fixed size array and multiple queries of following types on the array, how to efficently perform these queries
//arr = [7, 2, 8, 3, 9, 6, 5, 4]
//Queries = (0,2), (1,3), (2,6)
// 1
// 7 2 8 3 9 6 5 4
// 3
// 0 2
// 1 3
// 2 6



//soln1.........tc=O(n).........sc=O(n)
void performQueries_m1(int *arr, int n){
    int prefix[n];
    prefix[0]=arr[0];
    for(int i=1; i<n; i++){
        prefix[i]=prefix[i-1]+arr[i];
    }
    
    int q;
    cin>>q;
    while(q>0){
        int l,r;
        cin>>l>>r;

        int sum=l==0? prefix[r]:prefix[r]-prefix[l-1];
        cout<<sum<<endl;
        q--;
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
        performQueries_m1(arr,n);
        cout<<"\n";
    }
    return 0;
}