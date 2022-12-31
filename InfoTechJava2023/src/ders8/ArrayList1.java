package ders8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);

		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(10);
		sayilar.add(5);
		sayilar.add(7);
		sayilar.add(9);

//		size() fonksiyonu 
		System.out.println(sayilar.size()); // length fonks. listelerde karsiligi size() dir. uzunluk belirtir

//		isEmpty() fonksiyonu
		System.out.println(sayilar.isEmpty()); // Listenin bos ise true doner

//      clear() fonksiyonu
		sayilar.clear(); // removeAll() fonksiyonundan daha hizli calisir
		System.out.println(sayilar);

//      Listeye birden fazla eleman eklemek icin tek tek giris yapmak yerine FOR loop kullanilir
		for (int i = 0; i < 3; i++) {
			System.out.println("Listeye yeni eleman giriniz : ");
			sayilar.add(giris.nextInt());
		}

//     contains() Fonksiyonu 
		System.out.println(sayilar);
		System.out.println(sayilar.contains(3)); // icerisine string veya integer deger alir, bu degerin olup olmadigina
													// bakar
		System.out.println(sayilar.contains(10));

	}

}
