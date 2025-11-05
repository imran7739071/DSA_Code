#include<bits/stdc++.h>
using namespace std;
bool isSet1(int n, int k){
    k=k-1;
    return (n>>k)&1;
}

bool isSet2(int n, int k){
    k=k-1;
    return (n& (1<<k));
}

int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n, k;
        if(!(cin>>n))return 0;
        if(!(cin>>k))return 0;
        bool res=isSet2(n,k);
        cout<<res<<"\n";
    }
    return 0;
}