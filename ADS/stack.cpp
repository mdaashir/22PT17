#include<iostream>
using namespace std;
struct stacck
{
    char a[20];
    char b[20];
};
int main(void)
{
    int k;
    cout<<"Enter the number of parathesis: ";
    cin>>k;
    int c[k];
    cout<<"Enter the parathesis: ";
    for(int i=0;i<k;i++)
    {
        cin>>c[i];
    }
    for(int i=0;i<k;i++)
    {
        if(c[i]=='(' || c[i]=='[' || c[i]=='{')
            {
                push(c[i]);
            }
    }
}
void push()
{
    char a[ck]=c[ck];

}
