package ders02;

import java.util.Scanner;

public class IkinciDers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		
//		System.out.println(" Byte degerinde bir tane sayi giriniz : ");
//		int byteSayisi = scan.nextByte();
//		System.out.println(byteSayisi);
//////		
//		System.out.println(" Integer degerinde bir tane sayi giriniz : ");
//		int tamSayi = scan.nextInt();
//		System.out.println(tamSayi);
//		
		
//		System.out.println("String ifade giriniz : ");
//		String ifade2 = scan.next();
//		System.out.println(ifade2);
		
//		Scanner scan1 = new Scanner(System.in);
//		
//		System.out.println("Uzun String ifade giriniz : ");
//		String uzunStrings = scan1.nextLine();
//		System.out.println(uzunStrings);
				
		
//		System.out.println("Uzun String ifade giriniz : ");
//		String ifade = scan.nextLine();
//		System.out.println(ifade);
		
//		System.out.println("Char ifade giriniz : ");
//		char karakter = scan.next().charAt(5);
//		System.out.println(karakter);
		
//		System.out.println("True mu False mi");
//		boolean isTrue = scan.nextBoolean();
//		System.out.println(isTrue);
		
//		boolean dogru;
//		int sayi;
//		sayi = 5;
//		System.out.println(sayi);
		
		
		/*
		 * TIP DONUSUMLERI KUCUKTEN BUYUGE (casting)
		 */
		
//		byte number = 12;
//		System.out.println(number);
//		short number1 = number;
//		System.out.println(number1);
//		int number2 = number1;
//		System.out.println(number2);
//		double number3 = number2;
//		System.out.println(number3);
		
		/*
		 * TIP DONUSUMLERI BUYUKTEN KUCUGE
		 */
		
//		float ondalikliSayi1 =(float)1.0;
//		System.out.println(ondalikliSayi1);
//		
//		double ondalikliSayi2 = 2.0;
		
//		long uzunSayi = 2147483647;
		
//		double sayi = 4.5;
//		int sayi1 = (int)sayi;
//		System.out.println(sayi1);
//		System.out.println((int)6.5);
//		
//		System.out.println(0XFFFF);
		
//		char ch1 = 'A'; // A Karakterinin ASCII dgerini gosterdi.
//		System.out.println(ch1);
		
//		char ch2 = 'A';
//		System.out.println((int)ch2);
		
//		int z = '3' + '2'; // 3 un 51 ve 2 nin  50 ASCII degerini topladi
//		System.out.println(z);
		
//		int sayi = 15;
//		sayi = 20;
//		System.out.println(sayi);
//		sayi = 25;
//		System.out.println(sayi);
//		
//		final double PISAYISI = 3.14;
//		System.out.println(PISAYISI);
//		PISAYISI = 3;
		
		
		/*
		 * MATEMATIKSEL ISLEMLER VE MODULUS
		 */
		
//		System.out.println(8+5+6-14);
//		
//	System.out.println(5/10);//5 int 10 int ifade
//		System.out.println((double)5/10);
//		
//		System.out.println(5.3 + 5);
//		System.out.println(Math.pow(5, 3));
//		System.out.println(Math.sqrt(49));
		
//		int sayi = 5478 ;
//		int yeniDeger = sayi%10;
//		System.out.println(yeniDeger);
//	
//		int sayi = 5478;
//		int birlerBasamagi = sayi % 10; //8
//		System.out.println(birlerBasamagi);
//		int onlarBasamagi = (sayi / 10) % 10; //7
//		System.out.println(onlarBasamagi);
//		int yuzlerBasamagi = (sayi / 100)% 10;
//		System.out.println(yuzlerBasamagi);
//		int binlerBasamagi = (sayi / 1000) % 10;
//		System.out.println(binlerBasamagi);
//		int toplam = birlerBasamagi + onlarBasamagi + yuzlerBasamagi+binlerBasamagi;
// 		System.out.println("Rakamlarin toplami = " + toplam);
		
		/*
		 deger = deger + 5;		deger += 5;
		 deger = deger - 5;		deger -= 5;
		 deger = deger * 5;		deger *= 5;
		 deger = deger / 5;		deger /= 5;
		 deger = deger % 5;		deger %= 5;
		 
		 */
//		int sayi1 = 16, sayi2 = 25; 
//		final int toplam = sayi1 + sayi2;
//		System.out.println(toplam);
//		sayi1 = 20;
//		sayi2 = 40;
//		System.out.println(toplam);
				
		
//		int sayi = 10;
//		sayi += 5;
//		System.out.println(sayi);
//		sayi -= 6;
//		System.out.println(sayi);
		
		/*
		sayi++		sayi = sayi + 1;
		++sayi		sayi = sayi + 1;
		*/
		
		
		/*
		deger++;			deger = deger + 1;		deger += 1; 		
		 ++deger;			deger = deger + 1;		deger += 1;
		 
		 deger--;			deger = deger - 1;		deger -= 1;
		 --deger;			deger = deger - 1;		deger -= 1;
		
		*/
		
//		int sayi = 5;
//		int sonuc = sayi++ + 10;
//		System.out.println(sonuc);
//		System.out.println(sayi);
//		sayi+=3;
//		System.out.println(sayi);
//		
//		int sayi2 = 5;
//		int sonuc2 = ++sayi2 + 10;
//		System.out.println(sonuc2);
//		System.out.println(sayi2);
		
//		String mesaj = "Merhaba";
//		mesaj +=    "\nNasilsiniz?";
//		System.out.println(mesaj);
		
		
		int sayi1 = 10;
		int sayi2 = 20;
		int toplam = sayi1 + sayi2;
		System.out.println(toplam);
		System.out.println("Toplam = " + toplam);
		System.out.println("Toplam = " + sayi1 + sayi2);
		System.out.println("Toplam = " + (sayi1 + sayi2));
		System.out.println(sayi1 + sayi2+"Toplam = " );

		
		//10 ve 20 toplami 30 hesaplandi
		
		System.out.println(sayi1 + " ve " + sayi2 + " toplami " + toplam + " hesaplandi");
		
		
		System.out.println("      1235+-* sayi");
	}

}
