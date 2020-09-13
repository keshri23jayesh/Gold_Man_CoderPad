/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MostRepatedWordinString
{
    static void mostRepated(String s){
        HashMap<String, Integer> mp = new HashMap<String, Integer>();
        
        for(int i=0;i<s.length;i++) {
            if(mp.containsKey(s.charAt(i))){
                mp.get(charAt(i))++;
            } else {
                mp.put(charAt(i),1);
            }
        }
        
        int max_rep = Integer.MAX_VALUE;
        String str = "";
        for(String s: mp.keySet()){
            if(max_rep < mp.get(s)){
                max_rep = mp.get(s);
                str = s;
            }
        }
        System.out.println(str);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    mostRepated(s);
	}
}
