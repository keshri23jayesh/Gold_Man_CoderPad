/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SecondSmallest
{
    static void secondSmallestElem(ArrayList<Integer> arr){
        
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i)<first){
                second =first;
                first = arr.get(i);
            } else if(arr.get(i) < second && arr.get(i)!=first){
                second = arr.get(i);
            }
        }
        if(second == Integer.MAX_VALUE){
            System.out.println("No send minimum");
        } else {
            System.out.println("First minimum"+ first +"Second minimum"+ second);
        }
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0;i<N;i++){
		    arr.add(sc.nextInt());
		}
		secondSmallestElem(arr);
	}
}
