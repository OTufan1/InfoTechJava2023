package ders16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets {

	public static void main(String[] args) {
		
		Set<String> cars = new HashSet<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Audi");
		
        HashSet<String> cars2 = new HashSet<String>();
        cars2.add("Fiat");
        cars2.add("Mercedes");
        cars2.add("Audi");
        cars2.add("Toyota");
        cars2.add("Suzuki");
        
        Set<Person> set1 = new HashSet<>();//Baska class lardan turettigimiz nesneleri set icersinde kullanabiliriz
     
		/* 		METOTLAR  		*/
		System.out.println(cars.addAll(cars2));
//		System.out.println(cars.size());
//		cars.clear();
//		System.out.println(cars.contains("Tofas"));
//		System.out.println(cars.containsAll(cars2));
//      System.out.println(cars.equals(cars2));
//        System.out.println(cars.isEmpty());       
//       System.out.println(cars.remove("Mazda"));
//		System.out.println(cars.removeAll(cars));
//		System.out.println(cars.size());
	System.out.println(cars.retainAll(cars2));
		System.out.println(cars);
	
		
		
//		Iterator itr = cars.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		HashSet<Integer> numbers = new HashSet<>();
//		numbers.add(4);
//        numbers.add(7);
//        numbers.add(8);
//        numbers.add(3);
//        System.out.println(numbers);
//        
//        for(int i = 1; i <= 10; i++) {
//            if (numbers.contains(i)) {
//                System.out.println(i + " was found in the set.");
//            } else {
//                System.out.println(i + " was not found in the set.");
//            }
//
//        }
		
		
		
    }

}
