/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LcsDp
{
    static int longestCommonSubSeq(char []X, char []Y, int m, int n) {
        int lcs[][] = new int[m+1][n+1];
        for (int i=0 ; i<=m ; i++){
            for(int j=0 ; j<=n ; j++){
                if(i==0 || j==0) {
                    lcs[i][j] = 0;
                } else if(X[i-1] == Y[j-1]){
                    lcs[i][j] = lcs[i-1][j-1] + 1;
                } else {
                    lcs[i][j] = max(lcs[i-1][j], lcs[i][j-1]);   
                }
            }
        }
        return lcs[m][n];
    }
    
    static int max(int a, int b) {return (a > b) ? a:b;}
    

	public static void main (String[] args) throws java.lang.Exception
	{
		String S1 = "AGGTAB";
		String S2 = "GXTXAYB";
		
		char [] X = S1.toCharArray();
		char [] Y = S2.toCharArray();
		
		int m = X.length;
		int n = Y.length;
		
		System.out.println("Lengh of LCS"+ longestCommonSubSeq(X,Y,m,n));
	}
}
