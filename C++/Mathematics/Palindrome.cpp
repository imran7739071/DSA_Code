#include <bits/stdc++.h>
using namespace std;

void isPalindrome1(int n){
    if(n < 0){
        cout << "No\n";
        return;
    }
    string str = to_string(n);
    string rev = str;
    reverse(rev.begin(), rev.end());
    if(str == rev) cout << "Yes\n";
    else cout << "No\n";
}

void isPalindrome2(int n){
    if(n < 0){
        cout << "No\n";
        return;
    }
    string str = to_string(n);
    int s=0, e=str.size()-1;
    
    while(s++<=e--){
        if(str[s]!=str[e]){
            cout<<"No\n";
            return;
        }
    }
    cout<<"Yes\n";

}

void isPalindrome3(int n){
    if(n < 0){
        cout << "No\n";
        return;
    }
    int rev=0;
    int temp=n;

    while(temp){
        rev=rev*10+temp%10;
        temp=temp/10;
    }
    if(rev==n){
        cout<<"yes\n";
        return;
    }else{
        cout << "No\n";
        return; 
    }

}



int main(){
    int testcase;
    if(!(cin >> testcase)) return 0;
    while(testcase--){
        int n;
        if(!(cin >> n)) return 0;
        isPalindrome3(n);
    }
    return 0;
}