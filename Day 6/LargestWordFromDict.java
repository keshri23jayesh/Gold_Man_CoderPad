/* package codechef; // don't place package name!
Given a dictionary, and a list of letters ( or consider as a string), 
find the longest word that only uses letters from the string.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LargestWordFromDict
{
        public static boolean isSubseq(String arrWord, String word) {
                int j=0;
                for(int i=0; i<word.length() && j< arrWord.length(); i++) {
                        if(word.charAt(i) == arrWord.charAt(j)) {
                                j++;
                        }
                }
                if(j==arrWord.length()) return true;
                return false;
        }
        
        public static String longestWord (String arr[], String word) {
                int max = Integer.MIN_VALUE;
                String ans ="";
                for(int i=0;i<arr.length;i++) {
                        if(max<arr[i].length() && isSubseq(arr[i], word)) {
                               ans = arr[i];
                               max = arr[i].length();
                        }
                }
                return ans;
        }
        
	public static void main (String[] args) throws java.lang.Exception
	{
		String line =  "ale apple monkey plea";
		String dict [] = line.split(" ");
		String word = "abpcplea";
		System.out.println(longestWord(dict, word));
	}
}
