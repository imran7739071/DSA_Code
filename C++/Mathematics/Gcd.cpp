#include<bits/stdc++.h>
using namespace std;
int gcd1(int a, int b){
    int res=min(a,b);
    while(res>0){
        if(a%res==0 && b%res==0)break;
        res--;
    }
    return res;
}
int gcd2(int a, int b){
    if(b==0)return a;

    return gcd2(b, a%b);
}

int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int a,b;
        if(!(cin>>a))return 0;
        if(!(cin>>b))return 0;

        int res=gcd1(a,b);
        cout<<res<<"\n";
    }
    return 0;
}