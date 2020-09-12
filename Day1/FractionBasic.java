/* package codechef; // don't place package name! */

// the sum of fraction, with simplified output
// https://www.geeksforgeeks.org/program-to-add-two-fractions/


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class fractionNav
{
    
    static int gcd(int a, int b) {
        if (a==0) return b;
        return gcd(b%a, a);
    }
    
    static void printsimplest(int a, int b) {
        int common_factor = gcd(a,b);
        a = a/common_factor;
        b = b/common_factor;
        System.out.println(a+"/"+b);
    }
    
    static void fractionsum(int num1, int den1,
                            int num2, int den2){
        
        int den3 = gcd(den1, den2);
        int gcd = den3;
        // System.out.println("den3 "+ den3);
        den3 = den1 * den2 / gcd;
        // System.out.println("den3 "+ den3);
        num1 = num1 * (den1/gcd);
        num2 = num2 * (den2/gcd);
        printsimplest(num1+num2,  den3);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int num1, den1, num2, den2;
        num1 = sc.nextInt();
        den1 = sc.nextInt();
        num2 = sc.nextInt();
        den2 = sc.nextInt();
        System.out.println("your input is "+num1+"/"+den1+ "+" +num2+"/"+den2);
        System.out.println("Fraction Sum ");
        fractionsum(num1, den1, num2, den2);
	}
}
