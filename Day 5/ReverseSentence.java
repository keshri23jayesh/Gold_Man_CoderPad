/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ReverseSentence
{
     
        
        public static String resvresedString(String[] str){
                String ans = "";
                for(int i=0;i<str.length;i++){
                        char [] arr =  str[i].toCharArray();
                        
                        for(int j=arr.length-1; j>=0 ;j--){
                                ans += arr[j];
                        }
                        ans += " ";
                }
                return ans;
        }
        
        
	public static void main (String[] args) throws java.lang.Exception
	{
	        String str = "Name of the class has to be";
	        String [] strArr = str.split(" ");
	        System.out.println(resvresedString(strArr));
	}
}
