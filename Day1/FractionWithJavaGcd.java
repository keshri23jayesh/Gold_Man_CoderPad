/* package codechef; // don't place package name! */

// the sum of fraction, with simplified output
// https://www.geeksforgeeks.org/program-to-add-two-fractions/


import java.util.*;
import java.lang.*;
import java.io.*;

import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class FractionWithJavaGcd
{
    
    static void printsimplest(BigInteger a, BigInteger b) {
        BigInteger common_factor = a.gcd(b);
        a = a.divide(common_factor);
        b = b.divide(common_factor);
        System.out.println(a+"/"+b);
    }
    
    static void fractionsum(BigInteger num1, BigInteger den1,
                            BigInteger num2, BigInteger den2){
        BigInteger den3 = den1.gcd(den2);
        BigInteger gcd = den3;
        // System.out.println("den3 "+ den3);
        den3 = (den1.multiply(den2)).divide(gcd);
        // System.out.println("den3 "+ den3);
        num1 = (num1.multiply(den1)).divide(gcd);
        num2 = (num2.multiply(den2)).divide(gcd);
        printsimplest(num1.add(num2),  den3);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        
        String num1, den1, num2, den2;
        num1 = sc.nextLine();
        den1 = sc.nextLine();
        num2 = sc.nextLine();
        den2 = sc.nextLine();
        System.out.println("your input is "+num1+"/"+den1+ "+" +num2+"/"+den2);
        System.out.println("Fraction Sum ");
        
        
        BigInteger n1 = new BigInteger(num1); 
		BigInteger d1 = new BigInteger(den1);
		
		BigInteger n2 = new BigInteger(num2);
		BigInteger d2 = new BigInteger(den2);
		
        fractionsum(n1, d1, n2, d2);
	}
}
