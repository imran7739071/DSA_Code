#include<bits/stdc++.h>
using namespace std;
//n is +ve integer

bool isPowerOfTwo_m1(int n){
    if(n==0)return false;
    while(n!=1){
        if(n%2!=0)return false;
        n=(n>>1);
    }
    return true;
}
bool isPowerOfTwo_m2(int n){
    int setBits=__builtin_popcount(n);
    return setBits==1;
}
bool isPowerOfTwo_m3(int n){
    if(n==0)return false;
    return ((n& (n-1))==0);
}
int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        if(!(cin>>n))return 0;
        bool res=isPowerOfTwo_m3(n);
        cout<<res<<"\n";
    }
    return 0;
}