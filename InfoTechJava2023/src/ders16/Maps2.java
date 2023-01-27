package ders16;

import java.util.HashMap;

public class Maps2 {

	public static void main(String[] args) {
		// Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities1 = new HashMap<String, String>();
	    // Add keys and values (Country, City)
	    capitalCities1.put("England", "London");
	    capitalCities1.put("Norway", "OSLO");
	    capitalCities1.put("USA", "Washington DC");
	    capitalCities1.put("Germany", "Berlin");
//	    System.out.println(capitalCities1);
	    
	    HashMap<String, String> capitalCities2 = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities2.put("Hollanda", "Amsterdam");
        capitalCities2.put("Turkiye", "Ankara");
        capitalCities2.put("Norway", "Oslo");
        capitalCities2.put("USA", "Washington DC");
        
        
//        System.out.println(capitalCities2.containsKey("Norway"));
//        System.out.println(capitalCities2.containsValue("Kirsehir"));
//        System.out.println(capitalCities2.entrySet());
//        System.out.println(capitalCities2.equals(capitalCities1));
//        System.out.println(capitalCities1.get("USA"));
//        System.out.println(capitalCities2.getOrDefault("Cin", "Ankara"));
//        System.out.println(capitalCities2);
//        capitalCities2.putAll(capitalCities1);
//        System.out.println(capitalCities2);
//        capitalCities2.compute("Yunanistan", (k,v)->"Kirsehir");//Yoksa yeni ekler
//        System.out.println(capitalCities2);
//        capitalCities2.computeIfPresent("Ankara",(key,value)->"Kirsehir");//Yoksa hicbisiy yapmaz
//        System.out.println(capitalCities2);
//        capitalCities2.computeIfAbsent("USA", k->"France");
//        System.out.println(capitalCities2);
//        capitalCities2.putIfAbsent("Cin","Pekin");
        System.out.println(capitalCities2);
//        System.out.println(capitalCities2.size());

	}

}
