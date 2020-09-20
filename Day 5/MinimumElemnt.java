/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MinimumElemnt
{
        public static int findmin(int arr[], int low, int high){
                if(high<low) {
                        return arr[0];
                }
                if(high==low) {
                        return arr[low];
                }
                int mid = low + (high-low)/2;
                
                if(mid<high && arr[mid]>arr[mid+1]) {
                        return arr[mid+1];
                } else if(mid>low && arr[mid]<arr[mid-1]) {
                        return arr[mid];
                } else if(arr[high]>arr[mid]){
                        return findmin(arr, low, mid-1);
                }
                return findmin(arr, mid+1, high);
        }
        
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr1[] =  {5, 6, 1, 2, 3, 4}; 
                int n1 = arr1.length; 
                System.out.println("The minimum element is "+ 
                                        findmin(arr1, 0, n1-1));
	}
}
