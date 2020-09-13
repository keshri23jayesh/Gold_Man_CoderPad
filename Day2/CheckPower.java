/*  package codechef; // don't place package name!
    Find if the number is a power of 10 or any num
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static boolean checkPower(int x, int y) {
	    if(x==1) {
	        return (y==1);
	    }
	    int pow=1;
	    while(pow < y){
	        pow *= x;
	    }
	    return (pow==y);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int small = sc.nextInt();
		int large = sc.nextInt();
		System.out.println(checkPower(small, large));
	}
}
