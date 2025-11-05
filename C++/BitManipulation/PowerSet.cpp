#include<bits/stdc++.h>
using namespace std;
//Power set using bitwise operator
// subset using bitwise operator

void powerSet_m1(string &s){
    int n=s.size();
    int powSize=pow(2, n);

    for(int i=0; i<powSize; i++){
        string subset="";
        for(int j=0; j<n; j++){
            if( (i& (1<<j)) !=0){ // checking jth bit is set or not in i
                subset+=s[j];
            }
        }
        cout<<subset<<"\n";
    }
    return; 
}

int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        string s;
        cin>>s;
        
        powerSet_m1(s);
        cout<<"\n";
    }
    return 0;
}