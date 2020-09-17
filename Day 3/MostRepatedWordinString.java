/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MostRepatedWordinString
{
    static void mostRepated(String [] s){
        HashMap<String, Integer> mp = new HashMap<String, Integer>();
        
        for(int i=0;i<s.length;i++) {
            if(mp.containsKey(s[i])){
                mp.put(s[i], mp.get(s[i])+1);
            } else {
                mp.put(s[i],1);
            }
        }
        
        int max_rep = Integer.MIN_VALUE;
        String str = "";
        for(String p: mp.keySet()){
            // System.out.println(p);
            if(max_rep < mp.get(p)){
                max_rep = mp.get(p);
                str = p;
            }
        }
        System.out.println(str);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    String arr[] = s.split(" ", 0);
	    mostRepated(arr);
	}
}
