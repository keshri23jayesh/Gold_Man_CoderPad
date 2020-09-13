/* package codechef; // don't place package name! 
https://leetcode.com/discuss/interview-question/394477/Goldman-Sachs-or-Phone-or-Highest-Average-Score-and-Power-of-10
Running Average
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RunningAvg
{
    static void runningAvg(String arr[][]) {
        HashMap<String, Double> avg = new HashMap<String, Double>();
        for(int i=0;i<arr.length;i++){
            if (avg.containsKey(arr[i][0])) {
                Double val = avg.get(arr[i][0]);
                avg.put(arr[i][0], (Double.parseDouble(arr[i][1]) + val)/2);
            } else {
                avg.put(arr[i][0], Double.parseDouble(arr[i][1]));
            }
        }
        String ans = "";
        Double maxAvg = 0.0;
        for(Map.Entry<String, Double> en: avg.entrySet()){
            if(en.getValue() > maxAvg){
                ans = en.getKey();
                maxAvg = en.getValue();    
            }
            // System.out.println(en.getKey() +" - " + en.getValue());
        }
        System.out.println("The Avg is "+ ans +" - " + (int)Math.floor(maxAvg));
    }
    
    
	public static void main (String[] args) throws java.lang.Exception {
		String arr[][] = {{"Bob","87"}, {"Mike", "35"},{"Bob", "52"}, {"Jason","35"}, {"Mike", "55"}, {"Jessica", "99"}};
	    runningAvg(arr);
	}
}
