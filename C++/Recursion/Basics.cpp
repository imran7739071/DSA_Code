#include<bits/stdc++.h>
using namespace std;
//gues the output for different input
void fun1(int n){
    if(n==0)return;
    cout<<n<<endl;
    fun1(n-1);
    cout<<n<<endl;
}

void fun2(int n){
    if(n==0)return;

    fun1(n-1);
    cout<<n<<endl;
    fun1(n-1);
}

int fun3(int n){
    if(n==1)return 0;
    else {
        return 1+fun3(n/2);
    }
}

void fun4(int n){
    if(n==0)return;
    fun4(n/2);
    cout<<(n%2)<<" ";
}

void fun5(int n){
    if(n==0)return ;

    fun5((n>>1));
    cout<<(n&1)<<" ";
}

int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        if(!(cin>>n))return 0;
        
        fun5(n);
        
        cout<<"\n";
    }
    return 0;
}