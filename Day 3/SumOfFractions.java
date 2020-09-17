/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SumOfFractions
{
        static int gcd(int a, int b) {
                if (b==0) return a;
                return gcd(b, a%b);
        }
        
        static int findLcm(int arr[], int N){
            int lcm = arr[0];
            for(int i=1;i<N;i++) {
                 lcm = ((lcm*arr[i])/(gcd(lcm, arr[i])));
            }
            return lcm;
        }
        
        static void addAllFrac(int num[], int den[], int N){
                int final_den = findLcm(den, N);
                // System.out.println(final_den);
                
                int final_num = 0;
                for(int i=0 ; i<N ; i++){
                        final_num += (num[i]) *
                         (final_den / den[i]);
                }
                int final_gcd = gcd(final_den, final_num);
                final_num /=  final_gcd;
                final_den /= final_gcd;
                System.out.println(final_num +"/"+ final_den);
        }
        
	public static void main (String[] args) throws java.lang.Exception
	{
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
		int []num = new int [a];
		int []den = new int [a];
		for(int i=0;i<a;i++){
		        num[i] = sc.nextInt();
		}
		for(int i=0;i<a;i++) {
		        den[i] = sc.nextInt();
		}
	        addAllFrac(num, den, a);
	}
}
