#include<bits/stdc++.h>
using namespace std;
int trailingZeros(int n){
    int count=0;
    for(int i=5; i<=n; i*=5){
        count=count+(n/i);
    }
    return count;
}

int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        if(!(cin>>n))return 0;

        int res=trailingZeros(n);
        cout<<res<<"\n";
    }
    return 0;
}