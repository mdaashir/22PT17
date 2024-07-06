#include<stdio.h>
#include<stdlib.h>
// #include <string>
#include <strings.h>
#include <string.h>

/*
// Problem-1
int loan(float cost,float pay)
{
    if(cost<=0)
    {
        return 0;
    }
    else
    {
        return(1+loan(cost-pay,pay));
    }
}

int main()
{
    float cost,pay;
    printf("Enter the Amount to be repaid: ");
    scanf("%f",&cost);
    printf("Enter the Amount paid per week: ");
    scanf("%f",&pay);
    printf("Number of week(s) required to repay: %d",loan(cost,pay));
    return(0);
}
*/

/*
// Problem-3
char *rev(char a[30])
{
    int k=0,j=0,i=0;
    char b[3][30];
    for(i=0;i<strlen(a);i++)
    {
        if(strcmp(a[i],'.')==0)
        {
            b[k][j]='\0';
            k++;
            j=0;
        }
        else
        {
            b[k][j]=a[i];
        }
        j++;
    }

}
int main()
{
    char s[30];
    printf("Enter the name of Domain: ");
    scanf("%s",s);
    printf("%s",rev(s));
    return 0;
}
*/

/*
// Program-2
int position(int start,int moves,int add,int p1,int p2)
{
    if(start>moves)
        return add;
    if(start==1)
        return position(start+1,moves,add+1,1,p1);
    else if(start==2)
        return position(start+1,moves,add-2,p1,- 2);
    else
    {
        int ans=p2-p1;
        return position(start+1,moves,add+ans,p2,ans);
    }
}
int main()
{
    int moves;
    printf("Enter the number of moves: ");
    scanf("%d",&moves);
    printf("Current position: %d",position(1,moves,0,0,0));
    return 0;
}
*/

// void reverse(string &str)
// {
//     int i = 0;
//     int j = str.length() - 1;
//     while (i < j)
//     {
//         char temp = str[i];
//         str[i] = str[j];
//         str[j] = temp;
//         i++;
//         j--;
//     }
// }

// int main()
// {
//     int n, i;
//     scanf("%d", &n);
//     char domains[n][100];
//     for (i = 0; i < n; i++)
//     {
//         scanf("%s", domains[i]);
//     }
//     char reverseDomains[n][100];
//     for (i = 0; i < n; i++)
//     {
//         char domain[100] = domains[i];
//         char reverseDomain[100];
//         int j = strlen(domain) - 1;
//         while (j >= 0)
//         {
//             while (j >= 0 && domain[j] != '.')
//             {
//                 reverseDomain += domain[j--];
//             }
//             if (j >= 0)
//             {
//                 reverseDomain += '.';
//                 j--;
//             }
//         }
//         reverse(reverseDomain);
//         reverseDomains[i] = reverseDomain;
//     }
//     sort(reverseDomains.begin(), reverseDomains.end());
//     for (int i = 0; i < n; i++)
//     {
//         string reverseDomain = reverseDomains[i];
//         for (char c : reverseDomain)
//         {
//             if (c == '.')
//             {
//                 cout << ".";
//             }
//             else
//             {
//                 cout << c;
//             }
//         }
//         cout << endl;
//     }
// }
