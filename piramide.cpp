#include <iostream.h>


int main (){

int n;

cout<< "ingrese el numero de pisos."<<endl;

cin>>n;

for (int i = n;i>0;i--){
    cout<<endl;
    for(int j=1;j<=n;j++){

    if(j<i)cout<<" ";
    
    else    cout<<" *";
            }
    }
    system ("pause");
}
