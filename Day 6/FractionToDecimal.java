/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FractionToDecimal
{
        public static String calculateRec(int num, int den) {
                HashMap<Integer, Integer> mp = new HashMap<>();
                int rem = num%den;
                String res = "";
                while((rem!=0) && (!mp.containsValue(rem))){
                        mp.put(rem, res.length());
                        System.out.println(rem);
                        rem =  rem*10;
                        int res_part = rem/den;
                        res += String.valueOf(res_part);
                        rem = rem%den;
                }
                System.out.println(res+"--");
                System.out.println(mp.get(rem)+"--");
                if(rem == 0)
                    return " ";
                else if(mp.containsKey(rem))
                      return res.substring(mp.get(rem));
                return "";
                
        }
        
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(calculateRec(50, 22));
	}
}
