#include <bits/stdc++.h>

int main()
{
	// Initialization of array
	std::unordered_map<int, int> arr;
	int temp;
	std::cout << "Enter the values(-1 to stop) " << std::endl;
	while (temp != -1)
	{
		std::cin >> temp;
		if (temp != -1)
			arr[temp]++;
	}
	std::cout << "Values Successfully inputed" << std::endl;
	int count = 0;
	for (auto i : arr)
	{
		if (i.second > arr.size() / 2)
		{
			count = 1;
			std::cout << "Majority found :- " << i.first << std::endl;
			break;
		}
	}
	if (count == 0)
		std::cout << "No Majority element" << std::endl;
	// Display of array
	std::cout << "Final array: " << std::endl;
	for (auto i : arr)
	{
		std::cout << i.first << " ";
	}
	std::cout << std::endl;

	return 0;
}
