/* package codechef; // don't place package name! 
The smallest subarray exceeding target sum
*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SmallestSubarryExcedingTargetSum
{
    static int smallestSubarray(ArrayList<Integer> elemnts, int size,int tagetSum) {
        Queue<Integer> seq = new LinkedList<Integer>();
        int sum = 0, min_tagert=Integer.MAX_VALUE;
        for(int i=0 ;i<size;) {
            if(seq.isEmpty()){
                seq.add(elemnts.get(i));
                sum += elemnts.get(i);
                i++;
            } else{
                if(sum>tagetSum){
                    min_tagert = (min_tagert<seq.size()) ? min_tagert:seq.size();
                    int removedele = seq.remove();
                    sum -= removedele;
                } else{
                    seq.add(elemnts.get(i));
                    sum += elemnts.get(i);
                    i++;
                }
            }
        }
        while(!seq.isEmpty() && sum > tagetSum){
            min_tagert = (min_tagert<seq.size()) ? min_tagert:seq.size();
            int removedele = seq.remove();
            sum -= removedele;
        }
        return min_tagert;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
	    ArrayList<Integer> elemnts = new ArrayList<Integer>();
	    int tagetSum = in.nextInt();
	    int n = in.nextInt();
	    for(int i=0;i<n;i++) {
	        elemnts.add(in.nextInt());
	    }
	    System.out.println("min size sub array"+ smallestSubarray(elemnts, n, tagetSum));
	}
}
