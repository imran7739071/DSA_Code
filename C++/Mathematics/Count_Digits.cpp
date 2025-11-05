#include<bits/stdc++.h>
using namespace std;
void countDigits1(int n){
    int count=0;
    while(n){
        n=n/10;
        count++;
    }
    cout<<"didgit count: "<<count<<endl;
}

void countDigits2(int n){
    int count=log10(n)+1;
    cout<<"didgit count: "<<count<<endl;
}

int main(){
    int testcase;
    cin>>testcase;
    while(testcase--){
        int n;
        cin>>n;
        countDigits1(n);
    }
    return 0;
}