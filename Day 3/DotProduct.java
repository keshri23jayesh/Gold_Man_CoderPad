/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DotProduct
{
    static void dotProducts(List<Integer> l1, List<Integer> l2) {
        int product = 0;
        for (int i = 0; i < 3; i++)  {
            product += l1.get(i) * l2.get(i);
        }
        System.out.println("Dot Product is "+ product);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		
		for (int i=0 ; i<N; i++) {
		    l1.add(sc.nextInt());
		}
		
		for (int i=0 ; i<N; i++) {
		    l2.add(sc.nextInt());
		}
		
		dotProducts(l1, l2);
		
	}
}
