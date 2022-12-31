package ders8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Siralama {

	public static void main(String[] args) {

		//Siralama
		
		/*
		 * Collections.sort() alfabetik siralama kucukten buyuge siralama yapmamizi saglar
		 */
		
		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);
        sayilar.add(7);
        System.out.println(sayilar);
        Collections.sort(sayilar); // listedeki sayilari kucukten buyuge siralar
        System.out.println(sayilar);
        
        List<String> hayvanlar = new ArrayList<>();
		hayvanlar.add("Kedi");
		hayvanlar.add("Kopek");
		hayvanlar.add("At");
		hayvanlar.add("Inek");
		Collections.sort(hayvanlar); // listedeki stringleri ascii kodundaki siralamasina gore kucukten buyuge siralar
		System.out.println(hayvanlar);
		


	}

}
