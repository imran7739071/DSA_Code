#include<bits/stdc++.h>
using namespace std;
int countSetBit1(int n){
    int res=0;
    while(n){
        res=res+(n&1);
        n=(n>>1);
    }
    return res;
}

int countSetBit2(int n){
    int res=0;
    while(n){
        n=(n& (n-1));
        res++;
    }
    return res;
}

//lookup table method
int table[256]={0};
void initialize(){
    table[0]=0;
    for(int i=1; i<256; i++){
        table[i]= (i&1)+table[i/2];
    }
}
int countSetBit3(int n){
    return table[n& 0xff]+
            table[(n>>8)& 0xff]+
            table[(n>>16)& 0xff]+
            table[(n>>24)& 0xff];
}


int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        if(!(cin>>n))return 0;
        initialize();
        int res=countSetBit3(n);
        cout<<res<<"\n";
    }
    return 0;
}