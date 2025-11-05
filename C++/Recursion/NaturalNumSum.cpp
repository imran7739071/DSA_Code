#include<bits/stdc++.h>
using namespace std;

//tc=O(n).......sc=O(n)-sc due to recursion call stack
int naturalNumSum(int n){
    if(n==1)return n;

    return  n+naturalNumSum(n-1);
}
int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        if(!(cin>>n))return 0;
        
        int res=naturalNumSum(n);
        cout<<res<<"\n";
    }
    return 0;
}