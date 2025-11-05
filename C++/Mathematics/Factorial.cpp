#include<bits/stdc++.h>
using namespace std;
int factorial1(int n){
    if(n==0 || n==1)return 1;
    return n*factorial1(n-1);
}

int factorial2(int n){
    if(n==0 || n==1)return 1;
    int res=1;
    for(int i=n; i>0; i--){
        res=res*i;
    }
    return res;
}

int main(){
    int testcase;
    if(!(cin >> testcase)) return 0;
    while(testcase--){
        int n;
        if(!(cin >> n)) return 0;
        int res=factorial2(n);
        cout<<res<<"\n";
    }
    return 0;
}