#include<iostream>
#include<strings.h>
using namespace std;
int i,n;
class amcs
{
    struct student
    {
        string name;
        int number;
        float cutoff;
    };
   // struct student fresh[n];
    get()
    {
        for(i=0;i<n;i++)
        {
            cout<<"Enter a name of student "<<i+1<<": ";
            cin>>fresh[i].name;
            cout<<"Enter phone number of student "<<i+1<<": ";
            cin>>fresh[i].number;
            cout<<"Enter cutoff of student "<<i+1<<": ";
            cin>>fresh[i].cutoff;
        }
    }
    put()
    {
        cout<<string("*",10);
        for(i=0;i<n;i++)
        {
            cout<<fresh[i].name;
        }
    }
    public:
    amcs()
    {
        cout<<"Enter the number of students: ";
        cin>>n;
        struct student fresh[n];
        get();
        put();
    }
}a;
int main()
{
    return(0);
}
