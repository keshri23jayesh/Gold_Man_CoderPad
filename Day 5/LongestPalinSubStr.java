/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{       
        public static void printLongestUtil(String str,int start, int high) {
                System.out.println(str.substring(start, high + 1));
        }
        
        public static void printLongest(String str) {
                char []strArray = str.toCharArray();
                int n = str.length();
                boolean [][] dp = new boolean[n][n];
                
                for(int i=0;i<n;i++) {
                        dp[i][i] = true;
                }
                
                int start = 0;
                int maxLength = 1;
                
                for(int i=0;i<n-1;i++) {
                        if(strArray[i] == strArray[i+1])
                        {
                                dp[i][i+1] = true;
                                start = i; 
                                maxLength = 2;
                        }
                }
                
                
                for(int k=3; k<n;k++) {
                        for(int i=0;i<n-k+1;i++) {
                                int j = i+k-1;
                                if(strArray[i]==strArray[j] && dp[i+1][j-1]){
                                        dp[i][j] = true;
                                        if (k > maxLength) { 
                                                start = i; 
                                                maxLength = k; 
                                        } 
                                }
                        }
                }
                System.out.println("Max len"+ maxLength);
                printLongestUtil(str, start, start+maxLength-1);
        }
        
        
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printLongest(str);
	}
}
