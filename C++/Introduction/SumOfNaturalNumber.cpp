#include<bits/stdc++.h>
using namespace std;
//Analysis of algorithms

void sumOfNaturalNumber0(int n){
    int sum=0;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            sum++;
        }
    }
    cout<<"sum: "<<sum<<"\n";
}

void sumOfNaturalNumber1(int n){
    int sum=0;
    for(int i=0; i<=n; i++){
        sum+=i;
    }
    cout<<"sum: "<<sum<<"\n";
}

void sumOfNaturalNumber2(int n){
    int sum=0;
    sum=n*(n+1)/2;
    cout<<"sum: "<<sum<<"\n";
}


int main(){
    int testcase;
    cin>>testcase;
    while(testcase--){
        int n;
        cin>>n;
        sumOfNaturalNumber0(n);
    }
}
