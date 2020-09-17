/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PascalTriangle
{
        
        static void genratePascalTriangle(int n) {
                
                // ArrayList<ArrayList<Integer>> triangle = 
                //         new ArrayList<ArrayList<Integer>>(A);
                // System.out.println(triangle);
                
                for(int line = 1; line <= n; line++) 
                {
                    int C=1;
                    for(int i = 1; i <= line; i++) 
                    {
                        System.out.print(C+" "); 
                        C = C * (line - i) / i;  
                    } 
                    System.out.println(); 
                } 
                
                // for(int i=0;i<triangle.size();i++){
                //         triangle.set(i, new ArrayList<Integer>(i+1));
                //         System.out.println(triangle.get(i));
                // }
                
                // for(int line=1 ; line<=A ; line++)
                // {
                //         int c = 1;
                //         for(int i = 1 ; i < line ; i++)
                //         {
                //             ArrayList<Integer> temp = triangle.get(line-1);
                //             temp.set(i-1, c);
                //             triangle.set(line-1, temp);
                //             c = c*(line-i)/i;
                //         }
                // }
        }
        
        // public void printTriangle(ArrayList<ArrayList<Integer>> triangle){
        //         for(int i=0;i<triangle.size();i++){
        //                 System.out.println(triangle.get(i));
        //         }
        // }
        
	public static void main (String[] args) throws java.lang.Exception
	{
	        Scanner sc = new Scanner(System.in);
	        int A  = sc.nextInt();
	        genratePascalTriangle(A);
	       // PascalTriangle ps = new PascalTriangle();
	       // ArrayList<ArrayList<Integer>> triangle = ps.genratePascalTriangle(A);
	       // ps.printTriangle(triangle);
	}
}
