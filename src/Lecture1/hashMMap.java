package Lecture1;

import java.util.HashMap;

public class hashMMap {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//Create Hashmap
		HashMap<String,Integer> map= new HashMap<>();
		HashMap<String,Integer> aap= new HashMap<>();
		
		//Put Operation
		map.put("India",+91);
		map.put("USA",34);
		
		//function to check that this key is in that hashmap or not
		System.out.println(map.containsKey("USA"));
		
		//function to check that this value is in that hashmap or not  
		System.out.println(map.containsValue(34));
		
		//print all keys
		System.out.println(map.keySet());
		
		//print all values
		System.out.println(map.values());
		
		// return true if map is empty
		System.out.println(map.isEmpty());
		
		//size() function 
		System.out.println(map.size());
		
		//clone() fuction 
		aap=(HashMap<String, Integer>)map.clone();
        System.out.println(aap);
        
        //equals() function
        System.out.println(map.equals(aap));
        
        //print key value pair in array form
        System.out.println(map.entrySet());
       
        //print all values in array form
        System.out.println(map.values());
        
        //replace() function 
        map.replace("India", +91, 91);
        
        //print map in dictionary format {}
        System.out.println(map);
        
      //print map in a format []
        System.out.println(map.entrySet());
   
	}

}
