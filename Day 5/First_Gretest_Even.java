/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class First_Gretest_Even
{
        public static String FirstGretestEven(String arr[]){
                int max_len = 0;
                String ans = "";
                for(int i=0;i<arr.length;i++){
                        String s = arr[i];
                        int size = s.length();
                        if(size%2 == 0 && size > max_len) {
                                max_len = size;
                                ans = s;
                        }
                }
                return (max_len == 0) ? "":ans;
        }
        
	public static void main (String[] args) throws java.lang.Exception
	{
	        Scanner sc = new Scanner(System.in);
	        String line = sc.nextLine();
	        String []arr = line.split(" ");
	        System.out.println(FirstGretestEven(arr));
	}
}
