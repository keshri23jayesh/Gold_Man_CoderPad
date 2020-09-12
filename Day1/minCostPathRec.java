/* package codechef; // don't place package name! */

/*
Most optimal path problem where you had to reach from the bottom left of the
matrix to the top right with adding the elements along the path and reaching 
the top with maximum. You could either move up or right.
https://www.geeksforgeeks.org/minimum-cost-path-left-right-bottom-moves-allowed/
*/ 

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class minCostPathRec
{
    static int optimalPath(int arr[][], int m, int n) {
        if (n<0 || m <0){
            return Integer.MAX_VALUE;
        } else if(m==0 && n==0){
            return arr[m][n];
        } else {
            return arr[m][n] + min(optimalPath(arr, m-1, n), optimalPath(arr, m, n-1));
        }
    }
    
    static int min(int x, int y){
        return (x<y) ? x:y;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int row, column;
	    row = sc.nextInt();
	    column = sc.nextInt();
	    int arr[][] = new int[row][column];
	    for(int i=0;i<row;i++) {
	        for(int j=0;j<column;j++) {
	            arr[i][j] = sc.nextInt();
	        }
	    }
	    System.out.println("Most Optimal Path"+optimalPath(arr, row-1, column-1));
	}
	
}
