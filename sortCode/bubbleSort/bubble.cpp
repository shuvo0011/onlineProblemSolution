#include<bits/stdc++.h>
using namespace std;

void bubbleSort();


int main(){
    int arr[5]={58,78,-6,2,7,5};
    bubbleSort(arr);
}


void bubbleSort(*arr){
    int size = arr.length();
    for(int i =0; i<size;i++){
        int swap = 0;
        for(int j=0; j<size-i-1;j++){
            int temp = arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            swap =1;
        }
    }
}
