#include<bits/stdc++.h>
using namespace std;
int fib(int n){
    if(n==0 || n==1)return n;

    return fib(n-1)+fib(n-2);
}
int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        if(!(cin>>n))return 0;
        
        int res=fib(n);
        cout<<res<<"\n";
    }
    return 0;
}