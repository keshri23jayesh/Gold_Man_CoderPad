/* package codechef; // don't place package name! 
https://www.geeksforgeeks.org/sum-of-all-the-child-nodes-with-even-parent-values-in-a-binary-tree/

Given a binary tree, the task is to find the sum of all the nodes whose parent is even.
*/


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EvenParentTree
{
        static int res=0;
        
        public static class Node {
                int data;
                Node left;
                Node right;
                Node(int x) {
                        this.data = x;
                        left = null;
                        right = null;
                }
        }
        
        static void calculateSum(Node root) {
                if(root==null) return;
                
                if(root.data%2==0){
                        // System.out.println(root.data);
                        if(root.left != null){
                                res += root.left.data;
                        }
                        if(root.right != null){
                                res += root.right.data;
                        }
                }
                calculateSum(root.left);
                calculateSum(root.right);
        }
        
	public static void main (String[] args) throws java.lang.Exception
	{
		    Node root = new Node(2); 
                    root.left = new Node(3); 
                    root.right = new Node(8); 
                    root.left.left = new Node(2); 
                    root.right.left = new Node(5); 
                    root.right.right = new Node(6); 
                    root.right.left.left = new Node(1); 
                    root.right.right.right = new Node(3); 
                    
                    calculateSum(root);
                    System.out.println(res);
	}
}
