/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NthRowPascalTriangle
{
        
        static void genratePascalTriangle(int line) {
                int C = 1;
                    for(int i = 1; i <= line; i++) 
                    {
                        System.out.print(C+" "); 
                        C = C * (line-i+1)/i;  
                    }
        }
        

        
	public static void main (String[] args) throws java.lang.Exception
	{
	        Scanner sc = new Scanner(System.in);
	        int A  = sc.nextInt();
	        genratePascalTriangle(A);
	       
	}
}
