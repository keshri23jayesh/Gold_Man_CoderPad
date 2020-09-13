/* package codechef; // don't place package name!
https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CountIndex {
    int count;
    int index;
    public CountIndex(int index){
        this.count = 1;
        this.index = index;
    }
    
    public void incCount(){
        this.count++;
    }
}


class firstNonRepeatingCharacter
{
    static int NO_OF_CHARS = 256;
    static HashMap<Character, CountIndex> CharCount = new HashMap<Character, CountIndex>(NO_OF_CHARS);
    
    static void getTheCharCount(String str){
        for (int i=0 ;i<str.length(); i++) {
             if(CharCount.containsKey(str.charAt(i))) {
                 CharCount.get(str.charAt(i)).incCount();
             } else {
                 CharCount.put(str.charAt(i), new CountIndex(i));
             }
        }
    }
    
    static int firstNonRepeatingCharacter(String str){
        getTheCharCount(str);
        int result=Integer.MAX_VALUE;
        for(Map.Entry<Character, CountIndex> entry: CharCount.entrySet()){
            int c = entry.getValue().count;
            int ind = entry.getValue().index;
            if(c==1 && ind<result){
                result = ind;
            }
        }
        return result;
    }
        
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int index = firstNonRepeatingCharacter(str);
		System.out.println(((index==Integer.MAX_VALUE)? "Every Char is repating":"The Non Rep Char is"+ str.charAt(index)));
	}
}
