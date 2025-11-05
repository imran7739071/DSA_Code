#include<bits/stdc++.h>
using namespace std;
void allDivisors1(int n){
    for(int i=1; i<=n; i++){
        if(n%i==0){
            cout<<i<<" ";
        }
    }
}
void allDivisors2(int n){
    int i=1;
    while(i*i<n){
        if(n%i==0){
            cout<<i<<" ";
        }
        i++;
    }
    
    while(i>=1){
        if(n%i==0){
            cout<<(n/i)<<" ";
        }
        i--;
    }
}
int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        if(!(cin>>n))return 0;
        allDivisors2(n);
        cout<<endl;
    }
    return 0;
}