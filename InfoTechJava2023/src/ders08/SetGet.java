package ders08;

import java.util.ArrayList;
import java.util.List;

public class SetGet {

	public static void main(String[] args) {
		
		/*
		 * Set fonksiyonu update(guncelleme) yapar. var olan degeri degistirir. Liste sayisi aynidir
		 * add() araya kaynak yapar. liste sayisi artar
		 * get() istedigimiz indexten eleman getirmemizi saglar
		 */
		
		
		List<String> hayvanlar = new ArrayList<>();
		hayvanlar.add("Kedi");
		hayvanlar.add("Kopek");
		hayvanlar.add("At");
		hayvanlar.add("Inek");
		
		System.out.println(hayvanlar);
		
		System.out.println(hayvanlar.set(1, "Keci")); //kopek keci olarak degisir
		System.out.println(hayvanlar);
		
		System.out.println(hayvanlar.get(2)); //2.indeksteki ati geririr
		

	}

}
