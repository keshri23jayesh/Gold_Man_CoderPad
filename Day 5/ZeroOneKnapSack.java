/* package codechef; // don't place package name! 
https://www.geeksforgeeks.org/0-1-knapsack-problem-dp-10/
https://www.youtube.com/watch?v=xCbYmUPvc2Q
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ZeroOneKnapSack
{
        public static int max(int a, int b){
        return (a > b) ? a : b;
        }
        
        public static void KnapSackDp(int []weight, 
                                      int []value, 
                                      int W, 
                                      int N){
        
        int dp[][] = new int [N+1][W+1];
        
        for(int i=0; i<=N; i++) {
                for(int w=0; w<=W; w++) {
                        if(i==0||w==0) {
                                dp[i][w]=0;
                        } else if(weight[i-1]<=w){
                                dp[i][w] = max(dp[i-1][w],
                                       value[i-1]+dp[i-1][w-weight[i-1]]);
                        } else {
                                dp[i][w] = dp[i-1][w];
                        }
                }
        }
        System.out.println(dp[N][W]);
        }
        
	public static void main (String[] args) throws java.lang.Exception
	{
		int weight [] = {10, 20, 30};
		int value [] = {60, 100, 120};
		int W = 50;
		int length = weight.length;
		KnapSackDp(weight, value, W, length);
	}
}
