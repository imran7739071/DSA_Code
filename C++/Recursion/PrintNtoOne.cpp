#include<bits/stdc++.h>
using namespace std;

//print n to 1
void print(int n){
    if(n==0)return;
    cout<<n<<"\n";
    print(n-1);
}

int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        if(!(cin>>n))return 0;
        
        print(n);
        cout<<"\n";
    }
    return 0;
}