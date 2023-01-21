package ders01;

public class PrimitiveDataTypes {
	
	public static void main(String[] args) {
		
		// Primitive Data Types
		// byte > short > int > long > float > double  // kucukten buyuge dogru siralama
		                                               
		// char / boolean 
		
		boolean isTrue= false;  //  1 bit hafizada yer kaplar. 
		boolean isCold= true;
		
		char ilkHarf = 'A';    // character a,A,1,8,,%,$,+,space(bosluk).
		                       // a ile A ayni karakter degildir.
		char tekRakam= '7';
		char ozelKarakter = '%';
		char ozelKarakter2='\'';  //   \ sola yatik slash onundeki tek tirnagin karakter oldugunu belirtir.
		
		int toplama = tekRakam +3;  // her char karakterinin ascii tablosunda bir sayisal deger karsiligi var.
		System.out.println("sonuc="+toplama); // sonuc=58
		
		System.out.println(ozelKarakter);  // output > '
		
		byte age =73;  // hafizada 8 bit alan kapsar.
		
		byte limitDegerUst = 127;
		byte limitDegerAlt = -128;
		
		byte ustDeger = Byte.MAX_VALUE;
		System.out.println(ustDeger);  // output >127
		
		byte altDeger = Byte.MIN_VALUE;
		System.out.println(altDeger);
		
		short ilceNufusu = 27432;  //Hafizada 16 bit alan kapsar. max value = +32767 , min value= -32768
		
		System.out.println(Short.MIN_VALUE);
		
		int maas = 2000000000;  //integer, 32 bit alan kapsar.
		
		long dataType = 3500000000L; // integer sayisiyla karismasin diye sayinin sonuna l veya L harfi konur.
									 // 64 bit alan kapsar.
		System.out.println(Long.MAX_VALUE);
		
		float reelSayi = 0.123456789012345F; // double sayisiyla karismasin diye sayinin sonuna f veya F harfi konur.
		System.out.println(reelSayi);      // noktadan sonra 7 basamak hassasiyetle calisir. 32 bit.
		
		double dbl = 0.12345678901234567890; // noktadan sonra 17 basamak hassasiyetle calisir. 64 bit.
		System.out.println(dbl);
		
		
		// Non-primitive data type
		
		String adres = "Yildiz Koleji, 10 numara, Cankaya Ankara #";
		String telNo = "5324748899";
		String harf = "F"; // String bir class tir. Non-primitive bir data dir. char la karistirmayin.
		
		
		byte money; // "money", "Money", "MONEY" ucu de farklidir. case sensitive.
		
		float hisse; // veriable name tanimlarken harflerin yaninda $ , _ , Rakam eklenebilir.
		             // rakamda bir istisnamiz var, rakam variable name'in ilk karakteri olamaz. 
		// double for;   javaya ozel terimler variable name olarak kullanilamaz.
		
		//variable name 'ler kucuk harfle baslar, kelime grubu olusturulacaksa camel case kullanilir.
		// ageJohn, firstName vs.
		
		
	}

}
