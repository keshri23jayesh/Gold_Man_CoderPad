/* package codechef; // don't place package name!
https://www.geeksforgeeks.org/goldman-sachs-interview-experience-set-46-experienced/
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CheckUnequal
{
        public static boolean CheckUnequal(int n, int q){
                String s1 = Integer.toString(n);
                int [] arr = new int[26];
                
                for(int i=0; i<s1.length(); i++){
                        arr[s1.charAt(i)-'0']++;
                }
                
                int prod = n*q;
                
                String s2 = Integer.toString(prod);
                
                for(int i=0;i<s2.length();i++){
                        if(arr[s2.charAt(i)-'0']==1){
                                return false;
                        }
                }
                return true;
        }
        
        public static int CheckUnequal(int l, int r, int num){
                int count=0;
                for(int i=l;i<=r;i++) {
                        if(CheckUnequal(i, num)) {
                                count++;
                        }
                }
                return count;
        }
        
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(CheckUnequal(10, 12, 2));
	}
}
