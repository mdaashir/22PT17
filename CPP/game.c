#include <stdio.h>
#include <ctype.h>
#include <math.h>
#include <time.h>
#include <strings.h>
#include <string.h>
#include <stdlib.h>
void sudoku();
void XO();
void hangman();
void wordsearch();
int main()
{
        int ch;
        char retry;
        printf("Game 1:Sudoku\n");
        printf("Game 2:XO\n");
        printf("Game 3:Hangman\n");
        printf("Game 4:Word Search\n");
        while (1)
        {
                scanf("\n%d", &ch);
                switch (ch)
                {
                case 1:
                        sudoku();
                        break;
                case 2:
                        XO();
                        break;
                case 3:
                        hangman();
                        break;
                case 4:
                        wordsearch();
                        break;
                default:
                        printf("Enter numbers from 1 to 4");
                        break;
                }
                printf("Would you like to try again?");
                scanf("\n%c", &retry);
                if (retry == 'y')
                {
                        continue;
                }
                else
                {
                        break;
                }
        }
        return 0;
}

void sudoku()
{
        int flag = 0;
        char name[10];
        printf("Dear user kindly enter your name:");
        scanf("%s", name);
        int m = 9, n = 9;
        int rsep[4] = {0, 2, 5, 8};
        int csep[4] = {0, 2, 5, 8};
        int a[m][n], b[m][n];
        for (int i = 0; i < m; i++)
        {
                for (int j = 0; j < n; j++)
                {
                        a[i][j] = 0;
                }
        }
        a[0][1] = 1;
        a[0][4] = 4;
        a[0][7] = 5;
        a[1][0] = 4;
        a[1][2] = 7;
        a[1][6] = 6;
        a[1][8] = 2;
        a[2][0] = 8;
        a[2][1] = 2;
        a[2][3] = 6;
        a[2][7] = 7;
        a[2][8] = 4;
        a[3][4] = 1;
        a[3][6] = 5;
        a[4][0] = 5;
        a[5][2] = 4;
        a[5][4] = 5;
        a[4][8] = 3;
        a[6][0] = 9;
        a[6][1] = 6;
        a[6][5] = 3;
        a[6][7] = 4;
        a[6][8] = 5;
        a[7][0] = 3;
        a[7][2] = 5;
        a[7][6] = 8;
        a[7][8] = 1;
        a[8][1] = 7;
        a[8][4] = 2;
        a[8][7] = 3;
        for (int i = 0; i < m; i++)
        {
                for (int j = 0; j < n; j++)
                {
                        b[i][j] = a[i][j];
                        printf("%d", a[i][j]);
                        printf("\t");
                }
                printf("\n");
        }
        int row, cnt, coloumn, num;
        for (int i = 0; i < m; i++)
        {
                for (int j = 0; j < n; j++)
                {
                        if (a[i][j] == 0)
                        {
                                cnt += 1;
                        }
                }
        }
        char lvl;
        while (1)
        {
                printf("Enter the row number that you want your number to be entered:");
                scanf("%d", &row);
                printf("Enter the coloumn number that you want your number to be entered:");
                scanf("%d", &coloumn);
                printf("Enter the number that has to be placed:");
                scanf("%d", &num);
                if (num > 0 && num <= 9)
                {
                        if (a[row][coloumn] != 0)
                        {
                                printf("\n You are not allowed to enter the number in that place");
                        }
                        for (int i = 0; i < m; i++)
                        {
                                if (i != row)
                                {
                                        if (a[row][coloumn] == a[i][coloumn])
                                        {
                                                a[row][coloumn] = 0;
                                                printf("\n The number that you have entered is not correctly placed in row");
                                                break;
                                        }
                                        else
                                        {
                                                a[row][coloumn] = num;
                                                for (int j = 0; j < n; j++)
                                                {
                                                        if (j != coloumn)
                                                        {
                                                                if (a[row][coloumn] == a[row][j])
                                                                {
                                                                        a[row][coloumn] = 0;
                                                                        flag = 1;
                                                                        printf("\n The number that you have entered is not correctly placed in coloumn");
                                                                        break;
                                                                }
                                                                else
                                                                {
                                                                        flag = 0;
                                                                        a[row][coloumn] = num;
                                                                        if (row >= 0 && row <= 2 && coloumn >= 0 && coloumn <= 2)
                                                                        {
                                                                                for (int i = 0; i < 3; i++)
                                                                                {
                                                                                        for (int j = 0; j < 3; j++)
                                                                                        {
                                                                                                if (row != i && coloumn != j)
                                                                                                {
                                                                                                        if (a[row][coloumn] == a[i][j])
                                                                                                        {
                                                                                                                printf("\n Not possible");
                                                                                                                a[row][coloumn] = 0;
                                                                                                                flag = 1;
                                                                                                                break;
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                        if (flag == 1)
                                                                                        {
                                                                                                break;
                                                                                        }
                                                                                }
                                                                        }
                                                                        else if (row >= 3 && row <= 5 && coloumn >= 3 && coloumn <= 5)
                                                                        {
                                                                                for (int i = 3; i < 6; i++)
                                                                                {
                                                                                        for (int j = 3; j < 6; j++)
                                                                                        {
                                                                                                if (row != i && coloumn != j)
                                                                                                {
                                                                                                        if (a[row][coloumn] == a[i][j])
                                                                                                        {
                                                                                                                printf("\n Not possible");
                                                                                                                flag = 1;
                                                                                                                a[row][coloumn] = 0;
                                                                                                                break;
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                        if (flag == 1)
                                                                                        {
                                                                                                break;
                                                                                        }
                                                                                }
                                                                        }
                                                                        else if (row >= 6 && row <= 8 && coloumn <= 6 && coloumn <= 8)
                                                                        {
                                                                                for (int i = 6; i < 9; i++)
                                                                                {
                                                                                        for (int j = 6; j < 9; i++)
                                                                                        {
                                                                                                if (row != i && coloumn != j)
                                                                                                {
                                                                                                        if (a[row][coloumn] == a[i][j])
                                                                                                        {
                                                                                                                printf("\n Not possible");
                                                                                                                flag = 1;
                                                                                                                a[row][coloumn] = 0;
                                                                                                                break;
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                        if (flag == 1)
                                                                                        {
                                                                                                break;
                                                                                        }
                                                                                }
                                                                        }

                                                                        else if (row >= 0 && row <= 2 && coloumn >= 3 && coloumn <= 5)
                                                                        {
                                                                                for (int i = 0; i < 3; i++)
                                                                                {
                                                                                        for (int j = 3; j < 6; j++)
                                                                                        {
                                                                                                if (row != i && coloumn != j)
                                                                                                {
                                                                                                        if (a[row][coloumn] == a[i][j])
                                                                                                        {
                                                                                                                printf("\n Not Possible");
                                                                                                                flag = 1;
                                                                                                                a[row][coloumn] = 0;
                                                                                                                break;
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                        if (flag == 1)
                                                                                        {
                                                                                                break;
                                                                                        }
                                                                                }
                                                                        }
                                                                        else if (row >= 0 && row <= 2 && coloumn >= 6 && coloumn <= 8)
                                                                        {
                                                                                for (int i = 0; i < 3; i++)
                                                                                {
                                                                                        for (int j = 6; j < 9; j++)
                                                                                        {
                                                                                                if (row != i && coloumn != j)
                                                                                                {
                                                                                                        if (a[row][coloumn] == a[i][j])
                                                                                                        {
                                                                                                                printf("\n Not possible");
                                                                                                                flag = 1;
                                                                                                                a[row][coloumn] = 0;
                                                                                                                break;
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                        if (flag == 1)
                                                                                        {
                                                                                                break;
                                                                                        }
                                                                                }
                                                                        }
                                                                        else if (row >= 3 && row <= 5 && coloumn >= 0 && coloumn <= 2)
                                                                        {
                                                                                for (int i = 3; i < 6; i++)
                                                                                {
                                                                                        for (int j = 0; j < 3; j++)
                                                                                        {
                                                                                                if (row != i && coloumn != j)
                                                                                                {
                                                                                                        if (a[row][coloumn] == a[i][j])
                                                                                                        {
                                                                                                                printf("\n Not possible");
                                                                                                                flag = 1;
                                                                                                                break;
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                        if (flag == 1)
                                                                                        {
                                                                                                break;
                                                                                        }
                                                                                }
                                                                        }
                                                                        else if (row >= 3 && row <= 5 && coloumn >= 6 && coloumn <= 8)
                                                                        {
                                                                                for (int i = 3; i < 6; i++)
                                                                                {
                                                                                        for (int j = 6; j < 9; j++)
                                                                                        {
                                                                                                if (row != i && coloumn != j)
                                                                                                {
                                                                                                        if (a[row][coloumn] == a[i][j])
                                                                                                        {
                                                                                                                printf("\n Not possible");
                                                                                                                flag = 1;
                                                                                                                break;
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                        if (flag == 1)
                                                                                        {
                                                                                                break;
                                                                                        }
                                                                                }
                                                                        }
                                                                        else if (row >= 6 && row <= 8 && coloumn >= 0 && coloumn <= 2)
                                                                        {
                                                                                {
                                                                                        for (int i = 6; i < 9; i++)
                                                                                        {
                                                                                                for (int j = 0; j < 3; j++)
                                                                                                {
                                                                                                        if (row != i && coloumn != j)
                                                                                                        {
                                                                                                                if (a[row][coloumn] = a[i][j])
                                                                                                                {
                                                                                                                        printf("\n Not possible");
                                                                                                                        flag = 1;
                                                                                                                        break;
                                                                                                                }
                                                                                                        }
                                                                                                }
                                                                                                if (flag == 1)
                                                                                                {
                                                                                                        break;
                                                                                                }
                                                                                        }
                                                                                }
                                                                                else if (row >= 6 && row <= 8 && coloumn >= 3 && coloumn <= 5)
                                                                                {
                                                                                        for (int i = 6; i < 9; i++)
                                                                                        {
                                                                                                for (int j = 3; j < 6; j++)
                                                                                                {
                                                                                                        if (row != i && coloumn != j)
                                                                                                        {
                                                                                                                if (a[row][coloumn] = a[i][j])
                                                                                                                {
                                                                                                                        printf("\n Not possible");
                                                                                                                        flag = 1;
                                                                                                                        break;
                                                                                                                }
                                                                                                        }
                                                                                                }
                                                                                                if (flag == 1)
                                                                                                {
                                                                                                        break;
                                                                                                }
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                        if (flag == 1)
                                                        {
                                                                break;
                                                        }
                                                }
                                        }
                                }
                        }
                        else
                        {
                                printf("Sorry you cant enter that number %s", name);
                        }
                        if (a[row][coloumn] != 0)
                        {
                                printf("\n Finally,%s the number that you have entered is correctly placed\n", name);
                        }
                        printf("%s Sukodo after you have entered the value is:\n", name);
                        for (int i = 0; i < m; i++)
                        {
                                for (int j = 0; j < n; j++)
                                {
                                        printf("%d", a[i][j]);
                                        printf("\t");
                                }
                                printf("\n");
                        }
                        printf("\n %s,do you want to continue playing?(y/n):", name);
                        scanf("\n%c", &lvl);
                        if (lvl != 'y')
                        {
                                break;
                        }
                }
                return;
        }

        void XO()
        {
                int a[3][3] = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};
                int i, j, l = 1;
                while (l <= 9)
                {
                        printf("It's is a 3 * 3 matrix:");
                        printf("Enter row number:");
                        scanf("%d", &i);
                        printf("Enter column number:");
                        scanf("%d", &j);
                        if (l % 2 != 0)
                        {
                                if (a[i][j] > 1)
                                {
                                        a[i][j] = 0;
                                        l++;
                                }
                        }
                        else
                        {
                                if (a[i][j] > 1)
                                {
                                        a[i][j] = 1;
                                        l++;
                                }
                        }
                        for (int k = 0; k < 3; k++)
                        {
                                for (int d = 0; d < 3; d++)
                                {
                                        if (a[k][d] == 0)
                                                printf("O\t");
                                        else if (a[k][d] == 1)
                                                printf("X\t");
                                        else
                                                printf(" \t");
                                }
                                printf("\n");
                        }
                        int sumr = 0, sumc = 0;
                        int f = 0;
                        for (int k = 0; k < 3; k++)
                        {
                                sumr = 0;
                                sumc = 0;
                                for (int d = 0; d < 3; d++)
                                {
                                        sumr += a[k][d];
                                        sumc += a[d][k];
                                }
                                if (sumr == 0 || sumc == 0)
                                {
                                        printf("Player O won");
                                        f = 1;
                                }
                                else if (sumr == 3 || sumc == 3)
                                {
                                        printf("Player X won");
                                        f = 1;
                                }
                        }
                        int sumd = 0;
                        int sumbd = 0;
                        for (int k = 0; k < 3; k++)
                        {
                                sumd += a[k][k];
                                sumbd += a[3 - 1 - k][k];
                        }
                        if (sumd == 0 || sumbd == 0)
                        {
                                printf("Player O won");
                                f = 1;
                        }
                        else if (sumd == 3 || sumbd == 3)
                        {
                                printf("Player X won");
                                f = 1;
                        }
                        if (f == 1)
                        {
                                z
                        }
                }
                printf("Draw");
                return;
        }

        void hangman()
        {
                char l;
                char word[10][5] = {"jazz", "bass", "has", "care", "rash", "hello", "said", "world", "ruler", "the"};
                int c = 0;
                srand(time(NULL));
                int j = rand() % 10;
                int len = strlen(word[j]);
                int check[len];
                for (int i = 0; i < len; i++)
                {
                        check[i] = 0;
                }
                printf("The length of the word is: %d \n", len);
                while (c < 7)
                {
                        int f = -1;
                        printf("Enter the letter:");
                        scanf("\n%c", &l);
                        for (int i = 0; i < len; i++)
                        {
                                if (l == word[j][i] && check[i] == 0)
                                {
                                        word[j][i] = toupper(word[j][i]);
                                        check[i] = 1;
                                        f = 0;
                                }
                                else
                                {
                                        if (f == -1)
                                                f = 1;
                                }
                        }
                        if (f == 1)
                        {
                                c++;
                        }
                        if (c >= 1)
                        {
                                printf("     *\n");
                                printf("   *   *\n");
                                printf("   *   *\n");
                                printf("     *\n");
                        }
                        if (c == 2)
                        {
                                printf("     *\n");
                                printf("     *\n");
                                printf("     *\n");
                        }
                        if (c == 3)
                        {
                                printf(" *   *\n");
                                printf("  *  *\n");
                                printf("   * *\n");
                        }
                        if (c >= 4)
                        {
                                printf(" *   *   *\n");
                                printf("  *  *  *\n");
                                printf("   * * *\n");
                        }
                        if (c >= 5)
                        {
                                printf("     *\n");
                                printf("     *\n");
                        }
                        if (c == 6)
                        {
                                printf("    ***\n");
                                printf("   *\n");
                                printf("  *\n");
                        }
                        if (c >= 7)
                        {
                                printf("    ***\n");
                                printf("   *   *\n");
                                printf("  *     *\n");
                        }
                        int sum = 0;
                        for (int i = 0; i < len; i++)
                        {
                                sum += check[i];
                        }
                        if (sum == len)
                        {
                                printf("Congratulations.Game Over!");
                                return;
                        }
                        else
                        {
                                for (int i = 0; i < len; i++)
                                {
                                        if (check[i] == 1)
                                        {
                                                printf("%c ", word[j][i]);
                                        }
                                        else
                                        {
                                                printf("_ ");
                                        }
                                }
                                printf("\n");
                        }
                }
                printf("You lost");
                return;
        }

        void wordsearch()
        {
                printf("BEACH\t SUMMER\t CAMP\t FUN\n");
                printf("HOT\t SUN\t SWIM\t WATER\n");
                printf("S J C A M P M C\n");
                printf("W G L A M C H M\n");
                printf("I J M M P Y Y Z\n");
                printf("M V K B E A C H\n");
                printf("S U M M E R M S\n");
                printf("M H O T E B H U\n");
                printf("K O I G U F U N\n");
                printf("W A T E R O Q E\n");
                int a[8] = {0};
                int i1, j1, i2, j2;
                for (int l = 0; l < 8;)
                {
                        printf("Enter starting row:");
                        scanf("%d", &i1);
                        printf("Enter starting column:");
                        scanf("%d", &j1);
                        printf("Enter ending row:");
                        scanf("%d", &i2);
                        printf("Enter ending column:");
                        scanf("%d", &j2);
                        if (i1 == 3 && j1 == 3 && i2 == 3 && j2 == 7)
                        {
                                printf("BEACH is found\n");
                                l++;
                        }
                        else if (i1 == 4 && j1 == 0 && i2 == 4 && j2 == 5)
                        {
                                printf("SUMMER is found\n");
                                l++;
                        }
                        else if (i1 == 0 && i2 == 0 && j1 == 2 && j2 == 5)
                        {
                                printf("CAMP is found\n");
                                l++;
                        }
                        else if (i1 == 6 && i2 == 6 && j1 == 5 && j2 == 7)
                        {
                                printf("FUN is found\n");
                                l++;
                        }
                        else if (i1 == 5 && i2 == 5 && j1 == 1 && j2 == 3)
                        {
                                printf("HOT is found\n");
                                l++;
                        }
                        else if (i1 == 4 && i2 == 6 && j1 == 7 && j2 == 7)
                        {
                                printf("SUN is found\n");
                                l++;
                        }
                        else if (i1 == 0 && i2 == 3 && j1 == 0 && j2 == 0)
                        {
                                printf("SWIM is found\n");
                                l++;
                        }
                        else if (i1 == 7 && i2 == 7 && j1 == 0 && j2 == 4)
                        {
                                printf("WATER is found\n");
                                l++;
                        }
                        printf("Congratulations the word is found!");
                }
                printf("Congratulations the Game over");
                return;
        }
