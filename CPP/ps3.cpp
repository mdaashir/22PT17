#include<iostream>
using namespace std;
/*
//prg1
inline void series(int n)
{
    long sum=0;
    for(int i=1;i<n+1;i++)
    {
        sum+=i;
    }
    cout<<"The sum = "<<sum<<endl;
}
*/
inline void pascal(int n)
{
    for(int i=0;i<n+1;i++)
    {   for(int k=0;k<n-i;k++)
            {
                cout<<" ";
            }
        int val=1;
        for(int j=0;j<i;j++)
        {

            cout<<" "<<val;
        }
        cout<<endl;
    }

}
int main()
{
/*
    //prg1
    int n;
    cout<<"Enter the value of 'n': ";
    cin>>n;
    series(n);
*/
    int n;
    cout<<"Enter the value of 'n': ";
    cin>>n;
    pascal(n);
    return (0);
}
