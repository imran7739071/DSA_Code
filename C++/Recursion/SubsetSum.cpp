#include<bits/stdc++.h>
using namespace std;

//Q->subset sum problem
//need optimization using DP
//soln1.......tc=O(2^n).......sc=O(n)
void subsetSum(vector<int>&set, int sum, int currSum, int &cnt, int pos){
    if(pos==set.size()){
        if(currSum==sum){
            cnt++;
        }
        return;
    }
    
    //including set[pos]
    subsetSum(set,sum,currSum+set[pos],cnt,pos+1);

    //excluding set[pos]
    subsetSum(set,sum, currSum,cnt,pos+1);
}
int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        cin >>n;
        vector<int>set(n,0);
        for(auto &x:set){
            cin>>x;
        }
        int sum;
        cin>>sum;
        int cnt=0;
        subsetSum(set,sum, 0, cnt, 0);
        cout<<cnt;
        cout<<"\n";
    }
    return 0;
}