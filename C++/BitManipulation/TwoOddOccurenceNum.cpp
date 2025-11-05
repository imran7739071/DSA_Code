#include<bits/stdc++.h>
using namespace std;

void twoOddOccurenceNum_m1(vector<int>&v){
    int Xor=0, res1=0, res2=0;
    for(int i=0; i<v.size(); i++){
        Xor=Xor^v[i];
    }
    int sn=Xor^(~(Xor-1));//right most set bit

    for(int i=0; i<v.size(); i++){
        if((v[i]& sn)!=0){
            res1=res1^v[i];
        }else{
            res2=res2^v[i];
        }
    }
    cout<<res1<<" "<<res2;
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
       
        twoOddOccurenceNum_m1(v);
        cout<<"\n";
    }
    return 0;
}