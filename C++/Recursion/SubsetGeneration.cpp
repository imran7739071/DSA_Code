#include<bits/stdc++.h>
using namespace std;

//generate subset using recursion
//I have solved this problem using bitwise operator
//soln1........tc=O(n*2^n)........sc=O(n)
void subsetGeneration(vector<int>&v, vector<int>&subset, vector<vector<int>>&ans, int pos){
    if(pos==v.size()){
        ans.push_back(subset);
        return;
    }

    //include pos elem
    subset.push_back(v[pos]);
    subsetGeneration(v, subset,ans, pos+1);


    //exclude pos elem
    subset.pop_back();
    subsetGeneration(v, subset,ans, pos+1);
}
int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        cin>>n;
        vector<int>v(n);
        for(auto &x:v){
            cin>>x;
        }

        vector<int>subset;
        vector<vector<int>>ans;
        subsetGeneration(v, subset, ans, 0);

        for(int i=0; i<ans.size(); i++){
            for(int x: ans[i]){
                cout<<x<<",";
            }
            cout<<"\n";
        }
        
        cout<<"\n";
    }
    return 0;
}