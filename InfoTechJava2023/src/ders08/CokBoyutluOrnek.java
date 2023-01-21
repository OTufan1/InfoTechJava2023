package ders08;

import java.util.Scanner;

public class CokBoyutluOrnek {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/*
		 * 1. Aşağıdaki gibi tanımlanan ve değer atanan dizinin; a. Her bir satırının
		 * ayrı ayrı toplamını bulup ekrana yazdırınız. b. Her bir sütunun ayrı ayrı
		 * toplamını bulup ekrana yazdırınız. c. Dizi elemanlarından değeri klavyeden
		 * girilecek bir sayısal değerden büyük olanları 0 yapınız.
		 * 
		 */

		int sayilar[][] = {

				{ 99, 37, 15, 51, 20, 78, 99, 33, 92, 41 }, 
				{ 98, 93, 41, 19, 27, 93, 63, 36, 63, 28 },
				{ 23, 20, 50, 56, 28, 79, 81, 39, 33, 49 }, 
				{ 33, 36, 58, 92, 47, 32, 74, 32, 23, 26 },
				{ 92, 88, 78, 68, 65, 81, 26, 89, 23, 54 }, 
				{ 94, 61, 41, 84, 40, 79, 79, 84, 49, 21 },
				{ 80, 76, 83, 54, 55, 57, 75, 44, 11, 26 }, 
				{ 10, 35, 77, 57, 14, 79, 37, 39, 88, 23 },
				{ 84, 32, 34, 81, 81, 53, 71, 39, 62, 39 }, 
				{ 89, 45, 20, 93, 18, 90, 98, 32, 16, 17 },

		};
		// 25.satirdaki 40 elemanina ulasmak icin ilk basta satir index numarasi
		// ardindan sutun index numarasi yazilir
		// System.out.println(sayilar[5][4]);

		// listeyi komple yazdirmak icin ic ice for dongusu
		for (int i = 0; i < sayilar.length; i++) {
			for (int j = 0; j < sayilar[0].length; j++) {
				System.out.print(sayilar[i][j] + "\t");
			}
			System.out.println("");
		}

		// A. satir toplami

		int toplam; // soruda toplam istedigi icin toplam adinda bir degisken olusturduk

		for (int i = 0; i < sayilar.length; i++) {
			toplam = 0; // Bir sonraki satira gecerken toplam degiskenini sifirlamamiz lazim. Aksi
						// takdirde mevcut toplama ilave yapar.
			for (int j = 0; j < sayilar[0].length; j++) {
				toplam += sayilar[i][j]; // (i)satirdaki her elemani(j) toplama islemini yaparak alacak
			}
			System.out.println((i + 1) + " .satirin toplami :" + toplam);
		}

		// B. Sutun toplami

		int toplamA;// toplam istedigi icin toplamA isminde bir degisken oluturdum
		for (int i = 0; i < sayilar.length; i++) {
			toplamA = 0; // Bir sonraki satira gecerken toplamA sifirlanmali
			for (int j = 0; j < sayilar[0].length; j++) {
				toplamA += sayilar[j][i]; // (j) sutunundaki her(i) elemanini alarak toplama islemi yapacak
			}
			System.out.println(" .sutunun toplami :" + toplamA);
		}

		// c. Dizi elemanlarından değeri klavyeden girilecek bir sayısal değerden büyük
		// olanları 0 yapınız.
		// Not : bu yontem goruntu islemede rgb degerlerini ayarlamak icin kullanilan
		// bir yontemdir.

		// hangi degerin alt veya ust limit oldugunu belirlemek icin kullaniciya
		// soruyoruz
		int deger;
		System.out.println("Bir deger giriniz : ");
		deger = scan.nextInt();

		// tum elemanlari dolasmasi icin ic ice for dongusu kullaniyoruz
		for (int i = 0; i < sayilar.length; i++) {
			for (int j = 0; j < sayilar[0].length; j++) {
				if (sayilar[i][j] > deger) {
					sayilar[i][j] = 0; // bizim girdigimiz degerden buyuk olanlara 0 atamasi yaptik
				}
			}
		}

		// yapilan deger digisikliklerini gostermesi icin tekrar ic ice for dongusu
		// kullaniriz
		for (int i = 0; i < sayilar.length; i++) {
			for (int j = 0; j < sayilar[0].length; j++) {
				System.out.print(sayilar[i][j] + "\t");
			}
			System.out.println("");
		}

	}

}
