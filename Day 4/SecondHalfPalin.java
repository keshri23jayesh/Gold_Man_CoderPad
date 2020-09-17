/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SecondHalfPalin
{
        public static void checkHalfPlain(String str){
                char [] cahrArray = str.toCharArray();
                int traversStart = 0;
                traversStart = cahrArray.length/2;
                boolean flag = true;
                int j=1;
                System.out.println(traversStart);
                for(int i=traversStart; i<cahrArray.length; i++) {
                        System.out.println(cahrArray[i]+","+cahrArray[cahrArray.length-j]);
                        if(cahrArray[i]!=cahrArray[cahrArray.length-j]) {
                                flag = false;
                                break;
                        }
                        j++;
                }
                if(flag == true){
                        System.out.println("PALIN");
                } else {
                        System.out.println("NOT PALIN");
                }
        }
        
	public static void main (String[] args) throws java.lang.Exception
	{
	        Scanner sc  = new Scanner(System.in);
	        String str = sc.nextLine();
	        checkHalfPlain(str);
	}
}
