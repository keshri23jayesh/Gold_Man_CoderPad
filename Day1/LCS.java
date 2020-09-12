/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LCS
{
    static int longestCommonSubSeq(char []X, char []Y, int l, int m){
        if(l==0 || m==0){
            return 0;
        } 
        if(X[l-1]==Y[m-1]){
            return 1 + longestCommonSubSeq(X, Y, l-1, m-1);
        } else {
            return max(longestCommonSubSeq(X, Y, l, m-1) , longestCommonSubSeq(X, Y, l-1, m));
        }
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
