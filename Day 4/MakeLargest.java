/* package codechef; // don't place package name! 
https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/

String[] currencies = lineOfCurrencies.split(" ");

https://howtodoinjava.com/java/sort/collections-sort/
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MakeLargest
{
        public static void makeLargest(ArrayList<String> ListOfNums){
                Comparator<String> makeLargestNum = new Comparator<String>() {
                
                @Override
                public int compare(String X, String Y) {
                        String XY = X+Y;
                        String YX = Y+X;
                        return XY.compareTo(YX)>0 ? -1:1;
                }
                };
                
                Collections.sort(ListOfNums, makeLargestNum);
                
                Iterator it = ListOfNums.iterator();
                
                while(it.hasNext()){
                System.out.print(it.next());
                }
        }
        
        
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc  = new Scanner(System.in);
		String nos = sc.nextLine();
		String[] arr =  nos.split(" ");
		ArrayList<String> var = new ArrayList<String>();
		for(int i=0; i<arr.length ;i++){
		        var.add(arr[i]);
		}
		makeLargest(var);
	}
}
