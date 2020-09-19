/*
Value to be subtracted from array elements to make sum of all elements equals K
https://www.geeksforgeeks.org/value-to-be-subtracted-from-array-elements-to-make-sum-of-all-elements-equals-k/
*/ 

import java.util.Arrays; 

class ValueToBeSubtracted 
{ 
	static int[] height = new int[]{ 1, 2, 1, 2 }; 
	public static int woodCollected(int n, int m) 
	{ 
		int sum = 0; 
		for (int i = n - 1; i >= 0; i--) 
		{ 
			if (height[i] - m <= 0) 
				break; 
			sum += (height[i] - m); 
		} 
		return sum; 
	} 
	public static int collectKWood(int n, int k) 
	{ 
		Arrays.sort(height); 
		int low = 0, high = height[n - 1]; 
		while (low <= high) 
		{ 
			int mid = low + ((high - low) / 2); 
			int collected = woodCollected(n, mid); 
			if (collected == k) 
				return mid; 
			if (collected > k) 
				low = mid + 1; 

			else
				high = mid - 1; 
		} 
		return -1; 
	} 
	public static void main(String[] args) 
	{ 
		int k = 2; 
		int n = height.length; 
		System.out.print(collectKWood(n,k)); 
	} 
} 

