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
class minCostPathDP
{
    static int optimalPath(int arr[][], int m, int n) {
        int solArr [][] = new int [m+1][n+1];
        System.out.println(m +","+ n);
        solArr[0][0] = arr[0][0];
        
        for(int i=1; i<=m; i++) {
            solArr[i][0] = solArr[i-1][0] + arr[i][0];
        }
        
        for(int j=1; j<=n; j++) {
            solArr[0][j] = solArr[0][j-1] + arr[0][j];
        }
        
        for(int i=1; i<=m; ++i) {
            for(int j=1; j<=n; j++){
                solArr[i][j] = min(solArr[i-1][j], solArr[i][j-1]) + arr[i][j];
            }
        }
        return solArr[m][n];
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
