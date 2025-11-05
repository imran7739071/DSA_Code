#include<bits/stdc++.h>
using namespace std;

//Q->Josephus problem, circle begin with 0
//soln1.......tc=O(n).......sc=O(n)
int jos(int n, int k){
    if(n==1)return 0;

    else return (jos(n-1, k)+k)%n;
}

//Q->Josephus problem, circle begin with 1
//soln1.......tc=O(n).......sc=O(n)
int josVerson2(int n, int k){
    return jos(n,k)+1;
}
int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n,k;
        cin >> n>>k;

        cout<<josVerson2(n,k);
        cout<<"\n";
    }
    return 0;
}