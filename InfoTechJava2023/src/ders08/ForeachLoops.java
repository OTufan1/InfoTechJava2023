package ders08;

import java.util.ArrayList;
import java.util.List;

public class ForeachLoops {
	public static void main(String[] args) {

		/*
		 * Foreach donguleri for dongusunun gelismis versiyonudur. Hemen hemen her dilde mevcuttur.
		 * indeks numaralarini girmeden listelerdeki elemanlari kolayca gostermenin yoludur.
		 */
		
		List<String> hayvanlar = new ArrayList<>();
		hayvanlar.add("Kedi");
		hayvanlar.add("Kopek");
		hayvanlar.add("At");
		hayvanlar.add("Inek");
		
		/*
		 * Foreach dongusu olusturulurken parantez icine listedeki elemanlarimizin tipini yazariz.
		 * (Normal for dongulerinde her degiskeni (i) temsil ederdi)
		 * Ama burada (i) yerine istedigimiz herseyi yazabiliriz.(genellikle each veya w harfi kullanilir)
		 * ben kod okunurlugu acisindan listeyi cogul yapiyorum kullandigim elemani tekil cagriyorum.
		 * iki noktadan sonra ki kisim ise, hangi listeden getirmesi istersek o kismi yazariz.
		 */
		
		/*
		 * foreach loops larin icinde yine for dongusu veya if else gibi yapilari rahatlikla kullanabiliriz
		 */
		
		for (String hayvan : hayvanlar) {
			System.out.println(hayvan);
		}
		for (String item : hayvanlar) {
			System.out.println(item);
		}
		for (String each : hayvanlar) {
			System.out.println(each);
		}
		for (String w : hayvanlar) {
			System.out.println(w);
		}
		
		for (String i : hayvanlar) {
			System.out.println(i);
		}
	}

}
