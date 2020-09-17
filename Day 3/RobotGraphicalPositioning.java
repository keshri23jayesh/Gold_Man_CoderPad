/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RobotGraphicalPositioning 
{   
    
    /*
    Pass U,D or 
         R,L
    */
    static void printUtill(Integer A, Integer B){
        // System.out.println(A+","+B);
        System.out.print((A>=B)?A-B:B-A);
    }
    
    static void printFinalCords(String s){
        HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
        for(int i=0 ; i < s.length() ; i++){
            if(counts.containsKey(s.charAt(i))){
                counts.put(s.charAt(i), counts.get(s.charAt(i))+1);
            } else {
                counts.put(s.charAt(i), 1);
            }
        }
        printUtill(counts.containsKey('L')?counts.get('L'):0, 
                   counts.containsKey('R')?counts.get('R'):0);
        System.out.print(' ');
        printUtill(counts.containsKey('U')?counts.get('U'):0, 
                   counts.containsKey('D')?counts.get('D'):0);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String cords = sc.nextLine();
		printFinalCords(cords);
	}
}
