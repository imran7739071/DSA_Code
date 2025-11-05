#include<bits/stdc++.h>
using namespace std;

int oddOccurenceNum_m1(vector<int>&v){
    int res=0;

    for(int i=0; i<v.size(); i++){
        res=(res^v[i]);
    }
    return res;
}

//A[n]=[1....n+1], all num is exactly once so one num must be missing find out missing num
//n=3, A[]={1,4,3}, output=2
int oddOccurenceNum_m2(vector<int>&v){
    int n=v.size();
    int res=n+1;

    for(int i=0; i<v.size(); i++){
        res=res^v[i]^(i+1);
    }
    return res;
}

int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        if(!(cin>>n))return 0;
        vector<int>v(n);
        for(auto &x:v){
            cin>>x;
        }
       
        int res=oddOccurenceNum_m2(v);
        cout<<res<<"\n";
    }
    return 0;
}