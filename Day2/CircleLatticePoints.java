/* 
package codechef; // don't place package name!
https://www.geeksforgeeks.org/circle-lattice-points/
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CircleLatticePoints
{
    static int GetNumOfLaticePoint(int r){
        int ans = 4, ysquare=0, rsquare=r*r, ysqrt=0;
        for(int i=1;i<r;i++) {
            ysquare = rsquare - i*i;
            ysqrt = (int)Math.sqrt(ysquare);
            if(ysqrt*ysqrt == ysquare)
            ans += 4;
        }
        return ans;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("no of points"+ GetNumOfLaticePoint(r));
        
	}
}
