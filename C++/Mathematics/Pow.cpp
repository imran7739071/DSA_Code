#include<bits/stdc++.h>
using namespace std;

//it will work only for n>=0
double pow1(int x, int n){
    if(n==0)return 1;
    double res=1;
    while(n--){
        res=res*x;
    }
    return res;
}

//it will work for +ve and -ve value of n
double pow2(int x, int n){
    if(n==0)return 1;
    double res=1;
    int y=abs(n);
    while(y--){
        res=res*x;
    }
    return n>=0? res:(1/res);
}

//it will work for +ve and -ve value of n
//optimal soln
double pow3(int x, int n){
    if(n==0)return 1;
    if(n==-1)return (1.0/x);
    if(n==1)return (x);

    double res=pow3(x, n/2);
    if(n<0 && n%2!=0)return res*res*(1.0/x);
    else if(n>0 && n%2!=0)return res*res*x;
    else{
        return res*res;
    }
}

// most optimal soln
double pow4(int x, int y){
    int n=abs(y);
    if(n==0)return 1;
    double res=1;
    while(n>0){
        if(n&1!=0){
            res=res*x;
        }
        x=x*x;
        n=n>>1;
    }
    return y>=0? res:(1/res);
}
int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int x,n;
        if(!(cin>>x))return 0;
        if(!(cin>>n))return 0;
        double res=pow4(x,n);
        cout<<res<<"\n";
    }
    return 0;
}