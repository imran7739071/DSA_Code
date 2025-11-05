#include<bits/stdc++.h>
using namespace std;

//Q:- N-bonacci number, print first m N-bonacci number
// 4
// 2 7
// 3 8
// 4 10
// 5 15


//soln1......tc=O(m).......sc=O(m)
void nbonacciNum_m1(int n, int m){
    vector<int>fibs(m,0);
    fibs[n-1]=1;
    int sum=1;
    int l=0;
    for(int r=n; r<m && l<r; r++){
        fibs[r]=sum;
        sum=sum+fibs[r]-fibs[l];
        l++;
    }

    for(int x:fibs){
        cout<<x<<" ";
    }
}

//soln2........tc=O(m).....sc=O(n)
void nbonacciNum_m2(int n, int m){
    deque<int> window(n, 0);
    window.back() = 1;
    for(auto x: window){
        cout<<x<<" ";
    }

    int sum = 1;

    for (int i = n; i < m; i++) {
        int next = sum;
        cout<<next<<" ";
        sum += next - window.front();
        window.pop_front();
        window.push_back(next);
    }
}
   

int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n,m;
        cin>>n>>m;
        nbonacciNum_m2(n,m);
        cout<<"\n";
    }
    return 0;
}