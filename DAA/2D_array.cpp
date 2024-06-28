#include <bits/stdc++.h>

int main()
{
    // Initialization of array
    std::vector<std::vector<int>> arr;
    std::vector<int> temp_arr;
    int col_temp = 0;
    while (col_temp != -1)
    {
        std::cout << "Enter column values(-1 to stop) " << std::endl;
        std::cin >> col_temp;
        if (col_temp != -1)
        {
            int row_temp = 0;
            std::cout << "Enter the row values(-1 to stop) " << std::endl;
            while (row_temp != -1)
            {
                std::cin >> row_temp;
                if (row_temp != -1)
                    temp_arr.push_back(row_temp);
            }
        }
        arr.push_back(temp_arr);
        std::cout << "Row values successfully inputed" << std::endl;
    }
    // Display of array
    std::cout << "Final array: " << std::endl;
    for (int i = 0; i < arr.size(); i++)
    {
        for (auto j : arr[i])
            std::cout << j << " ";
        std::cout << std::endl;
    }
    return 0;
}
