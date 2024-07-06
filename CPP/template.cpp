#include<iostream>
#include<ctime>
using namespace std;
int main()
{
    clock_t time;
    time = clock();
    for(int i=0;i<1000;i++)
    {
        cout<<"aaple";
    }
    cout<<time<<endl;
    cout<<clock()<<endl;
    cout<<clock()-time<<endl;
    return(0);
}
