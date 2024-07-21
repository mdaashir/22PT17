#include <bits/stdc++.h>
using namespace std;

const int row =10, col =10, tid =10;
int matA[row][col], matB[row][col], matC[row][col];
int i = 0;

void* multi(void* arg)
{
	int z = i++;
	for (int j = 0; j < col; j++)
	{
		for (int k = 0; k < row; k++)
		{
			matC[z][j] += matA[z][k] * matB[k][j];
		}
	}
	return arg;
}

int create()
{
	for (int z = 0; z < row; z++) 
	{
		for (int j = 0; j < col; j++)
		{
			matA[z][j] = rand() % 10;
			matB[z][j] = rand() % 10;
		}
	}
	return 0;
}

int display()
{
	cout << endl << "Matrix A" << endl;
	for (int z = 0; z < row; z++)
	{
		for (int j = 0; j < col; j++)
		{
			cout << matA[z][j] << " ";
		}
		cout << endl;
	}

	cout << endl << "Matrix B" << endl;
	for (int z = 0; z < row; z++)
	{
		for (int j = 0; j < col; j++)
		{
			cout << matB[z][j] << " ";
		}
		cout << endl;
	}
	return 0;
}

int result()
{
	cout << endl << "Multiplication of A and B" << endl;
        for (int z = 0; z < row; z++)
	{
                for (int j = 0; j < col; j++)
		{
                        cout << matC[z][j] << " ";
		}
                cout << endl;
        }
	return 0;
}

int main()
{
	create();
	display();
	pthread_t threads[tid];
	for (int z = 0; z < tid; z++)
	{
		int* arg;
		pthread_create(&threads[z], NULL, multi, arg);
	}

	for (int z = 0; z < tid; z++)
	{
		pthread_join(threads[z], NULL);
	}
	result();
	return 0;
}
