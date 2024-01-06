#include<iostream>
using namespace std;

int main()
{

    int x=4,y=4;

    int a[x][x]= {
        {0,1,0,0},
        {1,0,0,0},
        {0,0,1,0},
        {0,0,0,1}
    };
    int n=0,s=0,c=0;


    for(int i=0; i<x; i++) {
        for(int j=0; j<x; j++) {

            cout<<a[i][j]<<" ";
        }
        cout<<endl;
    }



    for(int i=0; i<x; i++) {
        for(int j=0; j<x; j++) {
            if(a[i][j]==1) {
                cout<<"for input "<<i<<" "<<j<<endl;
                for(int m=0; m<x; m++) {
                    cout<<a[i][m]<<" " <<a[m][j]<<endl;
                    if(a[i][m]==1 ) {
                        s++;
                    }
                    if(a[m][j]==1) {
                        s++;
                    }
                }
                if(s==2) {
                    n++;
                }
            }
            s=0;
        }
    }

    cout<<n;


}


