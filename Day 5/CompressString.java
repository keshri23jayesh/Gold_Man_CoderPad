/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public.
Suppose we are given a string “aaabbbbbccccdaa”, then we to print “a3b5c4d1a2”.
*/
class CompressString
{
        public static String getcounts(String word){
                char [] str = word.toCharArray();
                String finalAns = "";
                for(int i=0 ; i < str.length; i++){
                        int count = 0;
                        char ans = str[i];
                        while( i < str.length-1 && str[i] == str[i+1]){
                                count++;
                                i++;
                        }
                        System.out.print(ans + Integer.toString(count+1));
                }
                return finalAns;
        }
        
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(getcounts("aaabbccaab"));
	}
}
