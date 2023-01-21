package ders08;

import java.util.Scanner;

public class CokBoyutluOrnek2 {

	public static void main(String[] args) {

		/*
		 3. 10 kişilik bir sınıftaki öğrencilerin bir dersine ait vize ve 
		 final not bilgileri klavyeden giriş yapılacaktır
		 (Uygun bir dizi tanımlanıp bilgiler diziye aktarılacak);
		a. Her öğrencinin ortalamasını bulup ekrana yazdırınız(ortalama=vize*0.4+final*0.6).
		b. Vizesi 50 den küçük olan öğrencilerin final notlarını ekrana yazdırınız.
		c. Ortalaması 70 den buyuk olanlar için ekrana “Geçti”, eşit 
		ve ya kucuk olanlar için “Kaldı” yazdırınız.
		d. Vizesi 60-70 arası olup Finali 70 den büyük olan öğrencilerin notlarını
		ekrana yazdırınız ve kaç adet olduğunu bulup ekrana yazdırınız. 
		  		 
		 */

		/*
		 * Algoritma icin uygun diziyi belirledim
		 * Dizimin boyutu 10 ogrenci oldugu icin 10 boyutlu olmali.
		 * her boyutun icinde 2 variable olmali
		 
		 1. ogrenci vize	= notlar[0][0]
		 1. ogrenci final 	= notlar[0][1]
		 
		 2. ogrenci vize	= notlar[1][0]
		 2. ogrenci final 	= notlar[1][1]
		 
		 3. ogrenci vize	= notlar[2][0]
		 3. ogrenci final 	= notlar[2][1]
		 
		 4. ogrenci vize	= notlar[3][0]
		 4. ogrenci final 	= notlar[3][1]
		 
		 5. ogrenci vize	= notlar[4][0]
		 5. ogrenci final 	= notlar[4][1]
		 
		 6. ogrenci vize	= notlar[5][0]
		 6. ogrenci final 	= notlar[5][1]
		 
		 7. ogrenci vize	= notlar[6][0]
		 7. ogrenci final 	= notlar[6][1]
		 
		 8. ogrenci vize	= notlar[7][0]
		 8. ogrenci final 	= notlar[7][1]
		 
		 9. ogrenci vize	= notlar[8][0]
		 9. ogrenci final 	= notlar[8][1]
		 
		 10. ogrenci vize	= notlar[9][0]
		 10. ogrenci final 	= notlar[9][1]
		 */
		
		Scanner scan = new Scanner(System.in);
		int[][] notlar = new int[10][2]; 
		
		for (int i = 0; i < 10; i++) {
			System.out.println((i+1) + ". Vize Notunu Giriniz : ");
			notlar[i][0] = scan.nextInt();		//ikinci indexi 0 olanlar vize notlarini belirtir
			System.out.println((i+1) + ". Final Notunu Giriniz : ");
			notlar[i][1] = scan.nextInt();		//ikinci indeksi 1 olanlar final notlarini verir
		}
		
		/*
		 * formulumuz :
		 ortalama = vize*0.4 + final*0.6
		 notlar[0][0]*0.4 + [0][1]*0.6
		 notlar[1][0]*0.4 + [1][1]*0.6
		 */
		
		// a. her ogrencinin ortalamasi
		
		for (int i = 0; i < notlar.length; i++) {
			double ortalama = notlar[i][0]*0.4 + notlar[i][1]*0.6;
			System.out.println((i+1) + ". ogrencinin ortalamasi : " + ortalama );
		}
		
		
		
	}

}
