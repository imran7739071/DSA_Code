#include<bits/stdc++.h>
using namespace std;


//Q:-count distinct element in every window of size k
// 1
// 7 1 2 1 3 4 3 3 4


//soln1......tc=O(n*k).......sc=O(k)
void countDistElemInWindow_m1(int arr[], int n, int k){
    for(int i=0; i<n-k+1; i++){
        set<int>window;
        for(int j=i; j<i+k; j++){
            window.insert(arr[j]);
        }
        cout<<window.size()<<" ";
    }

}

//soln2......tc=O(n).......sc=O(k)
void countDistElemInWindow_m2(int arr[], int n, int k){
    map<int,int>freq;
    for(int i=0; i<k; i++){
        freq[arr[i]]++;
    }
    //// print distinct count for first window
    cout<<freq.size()<<" ";

    for(int i=k; i<n; i++){
        //remove outgoing element
        int outgoing=arr[i-k];
        freq[outgoing]--;
        if(freq[outgoing]==0){
            freq.erase(outgoing);
        }

        //add incoming element
        int incoming=arr[i];
        freq[incoming]++;

        //// print distinct count
        cout<<freq.size()<<" ";
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
        int k;
        cin>>k;
        countDistElemInWindow_m2(arr,n,k);
        cout<<"\n";
    }
    return 0;
}