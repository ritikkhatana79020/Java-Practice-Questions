package DSA;

import java.util.*;

public class implementLL {

    static Node head; 
    
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    }
	
	void printList(Node node){
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<Integer> list=new LinkedList<>(); 
       list.head=new Node(10);
       list.printList(head);

	}

}
