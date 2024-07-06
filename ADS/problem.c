#include <stdio.h>
#include <stdlib.h>
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
// Problem-2
int pos(int stg, int cur)
{
    int ans = 0;
    if (stg == 0)
    {
        cur += 0;
    }
    else if (stg == 1)
    {
        ans += 1;
    }
    else
    {
        ans -= stg;
        pos(stg - 1, cur);
    }
    return ans;
}
int main()
{
    int stage, current = 0;
    printf("Enter the number of stages: ");
    scanf("%d", &stage);
    printf("The position of the dancer: %d", pos(stage, current));
    return (0);
}
