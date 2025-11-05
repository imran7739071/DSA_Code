#include<bits/stdc++.h>
using namespace std;
bool isPrime(int n){
    if(n==1)return false;
    if(n==2 || n==3)return true;
    if(n%2==0 || n%3==0)return false;
    
    for(int i=5; i*i<=n; i+=6){
        if(n%i==0 || n%(i+2)==0)return false;
    }
    return true;
}
void primeNumbers1(int n){
    if(n<=1)return;
    for(int i=2; i<=n; i++){
        if(isPrime(i)){
            cout<<i<<" ";
        }
    }
}

//implementation of SieveOfEratosthenes algorithms
void primeNumbers2(int n){
    if(n<=1)return;

    vector<bool>prime(n+1, true);
    
    for(int i=2; i<=n; i++){
        if(prime[i]==true){
            cout<<i<<" ";
            int x=i*i;
            while(x<=n){
                prime[x]=false;
                x+=i;
            }
        }
    }
}
int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        if(!(cin>>n))return 0;
        primeNumbers2(n);
        cout<<endl;
    }
    return 0;
}