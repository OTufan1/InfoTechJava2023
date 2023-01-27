package ders16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		
		//Create HashMap object.
				Map<Integer, String> hashMap = new HashMap<>();
		 
				//Add objects to the HashSet.
				hashMap.put(4, "Roxy");
				hashMap.put(2, "Sunil");
				hashMap.put(5, "Sandy");
				hashMap.put(1, "Munish");
				hashMap.put(3, "Pardeep");
				
		 
				//Print the HashMap object.
				System.out.println("HashMap elements:");
				System.out.println(hashMap);
		 
				//Get an iterator
				Set set=hashMap.entrySet();  
				Iterator iterator=set.iterator();  
//		 
//				//Print the HashMap elements using iterator.
				System.out.println("HashMap elements using iterator:");
				while(iterator.hasNext()){
				   Map.Entry mapEntry=(Map.Entry)iterator.next();  
				   System.out.println("Key: " + mapEntry.getKey() + ", " +
				   		"Value: " + mapEntry.getValue());  
				}


	}

}
