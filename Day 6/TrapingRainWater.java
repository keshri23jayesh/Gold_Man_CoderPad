/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TrapingRainWater
{
        
        public static int AmountOfWaterStored(int arr[]){
                int n = arr.length;
                int left_max[] = new int[n];
                int right_max[] = new int[n];
                
                
                left_max[0] = arr[0];
                for(int i=1 ; i<n ; i++){
                        left_max[i] = Math.max(left_max[i-1], arr[i]);
                }
                
                right_max[n-1] = arr[n-1];
                for(int i=n-2 ; i>=0 ; i--){
                        right_max[i] = Math.max(right_max[i+1], arr[i]);
                }
                
                int final_ans = 0;
                for(int i=0 ; i<n ; i++){
                        final_ans += Math.min(left_max[i], right_max[i])
                                        - arr[i];
                }
                return final_ans;
        }
        
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr [] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.println(AmountOfWaterStored(arr));
		
	}
}
