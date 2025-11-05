#include<bits/stdc++.h>
using namespace std;

//we need to cut the rope in the pieces. the length of every piece after cut should be in set {a,b,c}
//return the number of piece as output

//tc=O(n^3).........sc=O(n/min(a,b,c))
int ropeCutting(int n, int a,int b, int c){
    if(n==0)return 0;
    if(n<0)return -1;


    int resA=ropeCutting(n-a, a, b, c);
    int resB=ropeCutting(n-b, a, b, c);
    int resC=ropeCutting(n-c, a, b, c);

    int res=max({resA, resB, resC});

    if (res == -1) return -1;  // no valid cut possible
    return res + 1;            // add current cut
}
int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n,a,b,c;
        cin>>n>>a>>b>>c;
        int res=ropeCutting(n, a, b, c);
        cout<<res<<"\n";
    }
    return 0;
}