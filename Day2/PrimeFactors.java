/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PrimeFactors
{
    static void printPrimeFacts(int n){
        
        while(n%2==0){
            System.out.print(2 + " ");
            n/=2;
        }
        
        for(int i=3; i<Math.sqrt(n); i+=2) {
            while(n%i==0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        
        if(n>2){
            System.out.print(n);
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    printPrimeFacts(n);
	}
}
