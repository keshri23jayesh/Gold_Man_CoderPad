/* package codechef; // don't place package name!
https://www.geeksforgeeks.org/maximum-sum-path-matrix-top-bottom/
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MaxSumPath
{
        public static int maxSumPath(int arr[][], int size){
                int dp[][] = new int [size][size];
                for(int i=0;i<size;i++) {
                        dp[size-1][i] = arr[size-1][i];
                }
                for(int i=size-2;i>=0;i--){
                        for(int j=0;j<size;j++){
                                int max = Integer.MIN_VALUE;
                                if(j-1>0 && dp[i+1][j-1]>max) {
                                        max = dp[i+1][j-1];
                                }
                                if(j+1<size && dp[i+1][j+1]>max) {
                                        max = dp[i+1][j+1];
                                }
                                dp[i][j] = max + arr[i][j];
                        }
                }
                int max = Integer.MIN_VALUE;
                max = Integer.MIN_VALUE;
                for(int i=0 ; i<size ; i++) {
                        if(dp[0][i]>max){
                                max = dp[0][i];
                        }
                }
                return max;
        }
        
        
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[][] = {{5,  6,  1,  7},
		               {-2, 10, 8, -1},
		               {3, -7, -9, 11},
		               {12, -4, 2, 6}};
		System.out.println(maxSumPath(arr, 4));
	}
}
