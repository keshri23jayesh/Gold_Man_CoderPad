/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StairProblem
{
        public static int calculateUtill(int n, int ways){
                n+=1;
                int []arr = new int[n];
                arr[0] =1;
                arr[1] =1;
                
                for(int i=2;i<n;i++){
                        arr[i]=0;
                        for(int j=1;j<=ways && j<=i;j++){
                                arr[i] +=  arr[i-j];
                        }
                }
                return arr[n-1];
                
        }
        
        
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(calculateUtill(4,2));
	}
}
