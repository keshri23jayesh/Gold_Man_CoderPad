/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class printFabo
{
    static void printFab(int n) {
        if(n==2) { 
            System.out.println(0+" "+1);
        } 
        else {
            int first = 0,second = 1,val;
            int counter = 0;
            while(counter<n) {
                System.out.print(first+" ");
                val = first + second;
                first = second;
                second = val;
                counter+=1;
            }
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printFab(x);
	}
}
