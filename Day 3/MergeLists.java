/* package codechef; // don't place package name!
Merge Two linked list Sorted 
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class MergeUtill{
    public Node mergeUtill(Node headA, Node headB){
        Node dummyNode = new Node(0);
        Node tail = dummyNode;
        while(true){
            if(headA==null){
                tail.next = headB;
                break;
            }
            if(headB==null){
                tail.next = headA;
                break;
            }
            
            if(headA.data <= headB.data){
                tail.next = headA;
                headA = headA.next;
            } else {
                tail.next = headB;
                headB = headB.next;
            }
            tail = tail.next;
        }
        return dummyNode.next;
    }
}

class MergeLists
{
    Node head;
    public void addToTheList(Node node) {
        if (head==null) {
            head = node;
        } else {
            Node temp = head;
            while(temp.next != null) 
                temp = temp.next;
            temp.next = node;
        }
    }
    
    public void PrintList(){
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } 
        System.out.println();
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    MergeLists List1 = new MergeLists();
	    MergeLists List2 = new MergeLists();
	    List1.addToTheList(new Node(5));
	    List1.addToTheList(new Node(10));
	    List1.addToTheList(new Node(15));
	    List1.addToTheList(new Node(20));
	    List1.addToTheList(new Node(25));
	    
	    List2.addToTheList(new Node(6));
	    List2.addToTheList(new Node(11));
	    List2.addToTheList(new Node(16));
	    List2.addToTheList(new Node(21));
	    List2.addToTheList(new Node(30));
	    
	    List1.head = new MergeUtill().mergeUtill(List1.head, List2.head);
	    List1.PrintList();
	}
}
