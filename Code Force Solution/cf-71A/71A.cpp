//#include <bits/stdc++.h>

#include<iostream>
using namespace std;


int main(){

    int n;
    string s;
    cin>>n;

    while(n!=0){
        cin>>s;
        if(s.length()>10){
            cout<<s[0]<<s.length()-2<<s[s.length()-1]<<endl;
        }
        else{
            cout<<s<<endl;
        }
        n--;
    }
}
