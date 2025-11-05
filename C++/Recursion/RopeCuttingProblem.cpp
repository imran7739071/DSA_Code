#include<bits/stdc++.h>
using namespace std;

//Q:- we need to cut the rope in the pieces. the length of every piece after cut should be in set {a,b,c}
//return the number of piece as output
//this problem has better soln using DP

//soln1.......tc=O(3^n).........sc=O(n/min(a,b,c))
int ropeCutting_m1(int n, int a,int b, int c){
    if(n==0)return 0;
    if(n<0)return -1;


    int resA=ropeCutting_m1(n-a, a, b, c);
    int resB=ropeCutting_m1(n-b, a, b, c);
    int resC=ropeCutting_m1(n-c, a, b, c);

    int res=max({resA, resB, resC});

    if (res == -1) return -1;  // no valid cut possible
    return res + 1;            // add current cut
}


//soln2......memoization / Top-down DP.....tc=O(n).......sc=O(n)
int ropeCutting_m2(int n, int a,int b, int c,vector<int>&dp){
    if(n==0)return 0;
    if(n<0)return -1;

    if(dp[n]!=-2)return dp[n];


    int resA=ropeCutting_m2(n-a, a, b, c,dp);
    int resB=ropeCutting_m2(n-b, a, b, c,dp);
    int resC=ropeCutting_m2(n-c, a, b, c,dp);

    int res=max({resA, resB, resC});

    dp[n]=res==-1?-1:res+1;

    return dp[n];
}


int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n,a,b,c;
        cin>>n>>a>>b>>c;
        //int res=ropeCutting_m1(n, a, b, c);

        vector<int>dp(n+1,-2);
        int ans=ropeCutting_m2(n,a,b,c,dp);
        cout<<ans<<"\n";
    }
    return 0;
}