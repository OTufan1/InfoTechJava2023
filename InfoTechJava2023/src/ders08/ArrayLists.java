package ders08;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {

		//Liste olusturma
		
//		List<String> cities = new ArrayList<String>(); // Listeler bu sekilde olusturulabilir.
		List<String> cities = new ArrayList<>(); // Listeler bu sekilde de olusturulabilir. Genelde bu sekilde
													// kullanilir

		// 1. add() Fonksiyonu

		cities.add("Ankara"); // add() fonksiyonu listeye ekleme yapar
		cities.add("Samsun");

		System.out.println(cities); // yazdirmak icin degiskenin ismini yazdirmamiz yeterlidir.
		cities.add("Kirsehir"); // listeye sonradan eleman eklememiz mumkundur
		System.out.println(cities);

		cities.add(2, "Eskisehir"); // Listede istedigimiz indekse eleman ekleyince, sagindaki elemanlari saga dogru
									// kaydirir.
		System.out.println(cities);

		cities.addAll(cities); // addAll() herhangi bir listeyi komple baska listeye eklememizi saglar
		System.out.println(cities);

//		2. remove() Fonksiyonu
		List<String> isimler = new ArrayList<>();
		isimler.add("Ali");
		isimler.add("Veli");
		isimler.add("Deli");
		System.out.println(isimler);

		isimler.remove("Ali"); // Listede ki degere girerek silmemize izin verir
		isimler.remove(1); // index numarasi girerek silmemize izin verir
		System.out.println(isimler);

		List<String> yeniListe = new ArrayList<>();
		yeniListe.add("b");
		yeniListe.add("c");
		yeniListe.add("d");
		yeniListe.add("e");
		System.out.println(yeniListe);
		yeniListe.addAll(yeniListe);
		System.out.println(yeniListe);

		System.out.println(yeniListe.removeAll(yeniListe)); // listeyi komple silmemizi saglar. clear() fonks. gore
															// yavas calisir

		System.out.println(yeniListe);

		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(10);
		sayilar.add(5);
		sayilar.add(7);
		sayilar.add(9);
		sayilar.add(7);

		System.out.println(sayilar);

		/*
		 * integer listesinde remove fonksiyinunda kullanacgimiz int
		 */
		System.out.println(sayilar.remove(3));
		System.out.println(sayilar);

		/*
		 * integer listede deger girerek silinmesi istedgimiz degerleri bir degiskene
		 * atamaliyiz
		 */
		Integer silinecekEleman = 4;
		System.out.println(sayilar.remove(silinecekEleman));
		System.out.println(sayilar.remove(0));
		System.out.println(sayilar);

	}

}
