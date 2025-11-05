#include<bits/stdc++.h>
using namespace std;

//Q:- tower of Hanoi
//soln1.......tc=O(n^2).......sc=O(n)

void towerOfHanoi(int n, char A, char B, char C){
    if(n==1){
        cout<<"move disc "<<n<<" from "<<A<<" to "<<C<<endl; 
        return;
    }
    
    
    //Move n-1 disks from A → B (using C as auxiliary).
    towerOfHanoi(n-1, A, C, B); 

    //Move the nth (largest) disk from A → C.
    cout<<"move disc "<<n<<" from "<<A<<" to "<<C<<endl; 


    //Move n-1 disks from B → C (using A as auxiliary)
    towerOfHanoi(n-1, B, A, C);

}
int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        cin >> n;
        towerOfHanoi(n, 'A', 'B', 'C'); //A-source, B-helper, C-distination
        //cout << "Total moves: " << pow(2, n) - 1 << "\n";
        cout<<"\n";
    }
    return 0;
}