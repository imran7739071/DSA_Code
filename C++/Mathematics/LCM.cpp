#include<bits/stdc++.h>
using namespace std;
int gcd(int a, int b){
    if(b==0)return a;
    return gcd(b, a%b);
}

int lcm1(int a, int b){
    for(int i=max(a,b); i<=a*b; i++){
        if(i%a==0 && i%b==0)return i;
    }
    return a*b;
}

int lcm2(int a, int b){
    int hcf=gcd(a,b);
    int lcm=(a*b)/hcf;
    return lcm;
}
int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int a,b;
        if(!(cin>>a))return 0;
        if(!(cin>>b))return 0;

        int res=lcm1(a,b);
        cout<<res<<"\n";
    }
    return 0;
}