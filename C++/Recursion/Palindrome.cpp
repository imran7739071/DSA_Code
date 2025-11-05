#include<bits/stdc++.h>
using namespace std;

//check given string is palindrom or not using recursion
//s="abbcbba" -palindrome
//s="abba" -palindrome
//tc=O(n).......sc=O(n)-sc due to recursion call stack
string reverse(string s){
    if(s.size()<=1)return s;

    return reverse(s.substr(1))+s[0];
}
bool isPalindrome(string s, int l, int r){
    //return reverse(s)==s;
    if(l==r || l>r){
        return true;
    }

    if(s[l]!=s[r])return false;
    else{
        return isPalindrome(s, l+1, r-1);
    }


}
int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        string s;
        if(!(cin>>s))return 0;
        //string res=reverse(s);
        bool res=isPalindrome(s, 0, s.size()-1);
        cout<<res<<"\n";
    }
    return 0;
}