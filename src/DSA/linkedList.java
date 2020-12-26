package DSA;

import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LinkedList<Integer> list=new LinkedList<>();
         LinkedList<Integer> list2=new LinkedList<>();
		
         list.add(10);
         //list2.add(11);
         
         list.add(1, 20);
         list.add(10);
         
         //list.addAll(list2); //insert one linkedlist into another linkedlist
         
         //list.addAll(1, list2); //insert one linkedlist into another linkedlist at specific index
         
         list.addFirst(19);
         list.addLast(21);
         //list.clear();
         
         System.out.println("First Element/Head of Linked List--> "+list.peekFirst());
         System.out.println("First Element/Head of Linked List--> "+list.getFirst());
         System.out.println("Last Element/Tail of Linked List--> "+list.peekLast());
         System.out.println("Last Element/Tail of Linked List--> "+list.getLast());
         
         System.out.println("Linkned List is Empty--> "+list.isEmpty());
         
         System.out.println("Remove Head and return the Head which is-->"+list.poll());//remove head and return the head if you print it
         
         System.out.println("Last Index Of 10 is--> "+list.lastIndexOf(10));
      
         System.out.println("Size of the LinkedList--> "+list.size());
         
         //System.out.println(list2);
         
         System.out.println("Linked List is--> "+list);
	}
	
	

}
