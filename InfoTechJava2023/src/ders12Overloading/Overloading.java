package ders12Overloading;

public class Overloading {

	public static void main(String[] args) {
		topla(10,20);
		topla(10,20,30);
		topla(10, 6.5, "Ahmet");
		topla(10,20,30,45,61);

	}
	static void topla(int sayi1, int sayi2) {
		System.out.println(sayi1 + sayi2);
	}
	static void topla(int sayi1, int sayi2, int sayi3) {
		System.out.println(sayi1+ sayi2+sayi3);
	}
	static void topla(int sayi1,double sayi2, String str) {
		System.out.println(sayi1+ sayi2 + str);
	}
	static void topla(int ... sayilar) {//Bir metotta istedigimiz kadar sayi toplayan metot
		int toplam = 0;
		for(int i=0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		System.out.println(toplam);
		
	}

}
