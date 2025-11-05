#include<bits/stdc++.h>
using namespace std;

//Q->print all permuation of string
//soln1.......tc=O(n!).......sc=O(n)
void permutations(string & s, int pos){
    if(pos==s.size()-1){
        cout<<s<<" ";
        return;
    }

    for(int i=pos; i<s.size(); i++){
        swap(s[pos], s[i]);
        permutations(s, pos+1);
        swap(s[pos], s[i]);
    }
}
int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        string s;
        cin>>s;

        permutations(s,0);
        cout<<"\n";
    }
    return 0;
}