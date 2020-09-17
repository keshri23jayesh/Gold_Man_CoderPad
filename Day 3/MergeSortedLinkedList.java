/* package codechef; // don't place package name! 
Merge two sorted linked list using JAVA inbulit linked list.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MergeSortedLinkedList
{
    static LinkedList<Integer> ll1 = new LinkedList<Integer>();
	static LinkedList<Integer> ll2 = new LinkedList<Integer>();
	static LinkedList<Integer> ll3 = new LinkedList<Integer>();
	
	
	static void mergeSortedList(){
	    System.out.println(ll1);
	    System.out.println(ll2);
	    int size1=ll1.size(), size2=ll2.size(), i=0, j=0;
	    while(i<size1 && j<size2) {
	        if(ll1.get(i) < ll2.get(j)) {
	            ll3.add(ll1.get(i));
	            i++;
	        } else {
	            ll3.add(ll2.get(j));
	            j++;
	        }
	    }
	    
	    if(i<size1){
	        while(i<size1){
	            ll3.add(ll1.get(i));
	            i++;
	        }
	    } else if (j<size2) {
	        while(j<size2){
	            ll3.add(ll2.get(j));
	            j++;
	        }
	    }
	
	    System.out.println(ll3);
	}
	
	
	static void fillTheList(int[] arr, LinkedList<Integer> ll){
	    for(int i=0;i<arr.length;i++){
	        ll.add(arr[i]);
	    }
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int []arr1 = {1,5,10,15,19}; 
		int []arr2 = {2,6,11,16,20};
	    fillTheList(arr1, ll1);
	    fillTheList(arr2, ll2);
	    mergeSortedList();
	}
}
