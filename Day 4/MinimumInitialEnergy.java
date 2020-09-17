/* 

package codechef; // don't place package name! 
https://www.geeksforgeeks.org/minimum-initial-energy-required-to-cross-street/

*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MinimumInitialEnergy
{
        static int MinimumInitialEnergy(int arr[]) {
                boolean flag = false;
                int min = 0, currEnergy=0;
                for(int i=0;i<arr.length;i++) {
                        currEnergy += arr[i];
                        if(currEnergy<0) {
                               min +=  Math.abs(currEnergy) + 1;
                               currEnergy = 1;
                               flag = true; 
                        }
                }
                return (flag==false)?1:min;
        }
        
        
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {4, -10, 4, 4, 4};
		System.out.println(MinimumInitialEnergy(arr));
	}
}
