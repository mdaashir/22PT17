#include <bits/stdc++.h>

int main(){
// Initialization of array
	std::vector<int> arr;
	int temp;
	std::cout << "Enter the values(-1 to stop) " << std::endl;
	while (temp != -1){
		std::cin >> temp;
		if(temp != -1)
			arr.push_back(temp);
		}
	std::cout << "Values Successfully inputed" << std::endl;
// Algorithm starts
	int fst = 0, snd = 1;
	while (fst < snd && snd < arr.size()){
		if(arr[fst] % 2 == 1 && arr[snd] % 2 == 0){
		std::swap(arr[fst],arr[snd]);
		fst++, snd++;
		}
		else if(arr[fst] % 2 == 1 && arr[snd] % 2 == 1){
		snd++;
		}
		else{
		fst++,snd++;
		}
	}
// Display of array
	std::cout << "Final array: " << std::endl;
	for (auto i: arr){
		std::cout << i << " ";
	}
	std::cout << std::endl;
	return 0;
}
