#include<bits/stdc++.h>
using namespace std;

//Q:-Maximum length even odd subarray

// 5
// 5 10 12 13 8 2
// 4 4 6 7 8
// 6 4 7 11 13 10 5
// 8 7 9 3 8 11 14 5 1
// 7 11 6 7 9 12 13 16


//soln1.......tc=O(n^3).......sc=O(1)
int maxLenEvenOddSubaaray_m1(int *arr, int n){
    int maxLen=0;
    int len=0;
    int even=0;

    for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
            len=0;
            even=(arr[i]%2==0)?1:0;
            for(int k=i; k<=j; k++){
                if(arr[k]%2==0 && even==1){
                    even=0;
                    len++;
                    maxLen=max(maxLen, len);
                }else if(arr[k]%2!=0 && even==0){
                    even=1;
                    len++;
                    maxLen=max(maxLen, len);
                }else{
                    maxLen=max(maxLen, len);
                    len=1;
                }
            }
        }
    }
    return maxLen;
}

//soln2.......tc=O(n^2).......sc=O(1)
int maxLenEvenOddSubaaray_m2(int *arr, int n){
    int maxLen=0;
    
    for(int i=0; i<n; i++){
        int currLen=1;
        for(int j=i+1; j<n; j++){
            if((arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j]%2!=0 && arr[j-1]%2==0)){
                currLen++;
            }else{
                break;
            }
        }
        maxLen=max(maxLen, currLen);
    }
    return maxLen;
}


//soln3.......tc=O(n).......sc=O(1)
int maxLenEvenOddSubaaray_m3(int *arr, int n){
    int maxLen=0;
    int len=1;
    for(int i=1; i<n; i++){
        if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){
            len++;
            maxLen=max(maxLen, len);
        }else{
            len=1;
        }
    }
    return maxLen;
}


int main(){
    int testcase;
    if(!(cin>>testcase))return 0;
    while(testcase--){
        int n;
        cin>>n;
        int arr[n]={};
        for(int i=0; i<n; i++){
            int x;
            cin>>x;
            arr[i]=x;
        }
        
        int res=maxLenEvenOddSubaaray_m3(arr,n);
        cout<<res;
        cout<<"\n";
    }
    return 0;
}