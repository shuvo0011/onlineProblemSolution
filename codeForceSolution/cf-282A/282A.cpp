#include<iostream>

using namespace std;

int main(){

    int a,x=0;
    string s;
    cin>>a;

    while(a--){

        cin>>s;
        if(s[0]=='+' || s[2]=='+'){
            x++;
        }
        else{
            x--;
        }
    }
    cout<<x;
}
