package Lecture1;

import java.util.*;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList();
		
		//Addition in ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        //Add element at specific index
        list.add(0,40);
        
                
        //set() function to replaces any element 
        list.set(0, 100);
        list.set(1, 200);
        list.set(2, 300);
        list.set(3, 400);
        
      //Get Element of specific index
        System.out.println(list.get(2));
        System.out.println(list.get(0));
  
				
        // remove element at specific index
        list.remove(3);
        
        //Enhanced for loop
        for(int i: list) {
        	System.out.println(i);
        }
        
        //clone() we have to type cast in cloning
        ArrayList<Integer> mist = (ArrayList<Integer>)list.clone();
   
        // equals function to check two lists/objects 
        System.out.println(list.equals(mist));
        
        
        //If an element excist more than once the this function get index number of that element placed  at last  
        System.out.println(list.lastIndexOf(100));

        //get subArray from a specific range
        System.out.println(list.subList(2, 5));
        
		// fuction to get the size of list
        System.out.println(list.size());
        
        //Get index  number of specific element
        System.out.println(list.indexOf(200));

        // function that checks that element is present in the list or not
        System.out.println(list.contains(400));
        
        //fuction that delete or empty the list
        list.clear();
        
        //fuction to check Wheather list is empty or not
        System.out.println(list.isEmpty());
	}

}
