#include<bits/stdc++.h>
using namespace std;
void primeFactor1(int n){

    for(int i=2; i*i<=n; i++){
        while(n%i==0){
            cout<<i<<" ";
            n=n/i;
        }
    }
    if(n>1){
        cout<<n<<" ";
    }
    return;
}

void primeFactor2(int n){
    
    while(n%2==0){
        cout<<2<<" ";
        n=n/2;
    }

    while(n%3==0){
        cout<<3<<" ";
        n=n/3;
    }

    for(int i=5; i*i<=n; i+=6){
        while(n%i==0){
            cout<<i<<" ";
            n=n/i;
        }
        while(n%(i+2)==0){
            cout<<(i+2)<<" ";
            n=n/(i+2);
        }
    }
    if(n>3){
        cout<<n<<" ";
    }
    return;
}
int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        if(!(cin>>n))return 0;
        primeFactor1(n);
        cout<<endl;
    }
    return 0;
}