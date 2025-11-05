#include<bits/stdc++.h>
using namespace std;

int fact(int n){
    if(n==0)return 1;
    return n*fact(n-1);
}

int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        if(!(cin>>n))return 0;
        
        int res=fact(n);
        cout<<res<<"\n";
    }
    return 0;
}