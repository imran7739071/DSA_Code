#include<bits/stdc++.h>
using namespace std;
//find sum of digit using recursion
//tc=O(digits).......sc=O(digits)-sc due to recursion call stack
int sumOfDigit(int n){
    if(n<=9)return n;
    return (n%10)+sumOfDigit(n/10);
}
int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        if(!(cin>>n))return 0;
        
        int res=sumOfDigit(n);
        cout<<res<<"\n";
    }
    return 0;
}