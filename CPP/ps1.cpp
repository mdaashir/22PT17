#include <bits/stdc++.h>
// #include <iostream>
// #include <string.h>
// #include <strings.h>
// #include <string>
using namespace std;
class travel
{
    float basic_salary;
    char name[20], designation[20], department[20];
    void getdata()
    {
        cout << "Enter the Name,Designation,Department and Basic Salary : " << endl;
        cin >> name >> designation >> department >> basic_salary;
    }
    void putdata()
    {
        cout << "\nThe Name: " << name << "\nDesignation: " << designation << "\nDepartment: " << department << "\nBasic Salary : " << basic_salary << endl;
    }
    void checkdata()
    {
        if (strcmp(strlwr(designation), "secretary") == 0 || strcmp(strlwr(designation), "additional_secretary") == 0):
                cout<<"\nAir Travel is allowed."<<endl;
        if (strcmp(strlwr(designation), "joint_secretary") == 0 || strcmp(strlwr(designation), "deputy_secretary") == 0):
                cout<<"\nAir Travel is allowed if salary is above Rs.20000."<<endl;
        if (strcmp(strlen(designation), "under_secretary") == 0):
                cout<<"\nAir Travel is allowed with prior sanction."<<endl;
    }

public:
    travel()
    {
        getdata();
        putdata();
        checkdata();
    }
} t;
int main()
{
    return (0);
}
