#include<bits/stdc++.h>
using namespace std;

//print 1 to n
void print(int n){
    if(n==0)return;
    print(n-1);
    cout<<n<<"\n";
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