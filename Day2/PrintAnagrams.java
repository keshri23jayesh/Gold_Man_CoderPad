/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PrintAnagrams
{
    static void printAnagrams(String arr[]){
        HashMap<String, List<String>> words = new HashMap<String, List<String>>();
        
        for(int i=0;i<arr.length;i++){
            String word = arr[i];
            char [] charArr = word.toCharArray();
            Arrays.sort(charArr);
            String newWord = new String(charArr);
            //  System.out.println(newWord);
            if(words.containsKey(newWord)) {
                words.get(newWord).add(word);
            } else {
                List<String> wordList = new ArrayList<String>();
                wordList.add(word);
                words.put(newWord, wordList);
            }
           
        }
        
        for(String s: words.keySet()){
            List<String> values = words.get(s);
            if(values.size()>1){
                System.out.println(values);
            }
        }
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		String arr[] = { "cat", "dog", "tac", "god", "act" }; 
        printAnagrams(arr); 
	}
}
