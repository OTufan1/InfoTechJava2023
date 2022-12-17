package ders4;

import java.util.Locale;
import java.util.Scanner;

public class ToLowerCase_ToUpperCase {

	public static void main(String[] args) {
		//toUpperCase()==> Bakacagimiz string ifadenin tamamini Buyuk harf yapar
		//toLowerCase()==> Bakacagimiz string ifadenin tamamini kucuk harf yapar
		
		String isim = "InfoTech Academy";
		String buyukIsim = isim.toUpperCase();
		System.out.println(buyukIsim);
		
		System.out.println(buyukIsim.toLowerCase());
		
		String str2 = "Ince Mehmet";
		System.out.println(str2.toLowerCase(Locale.forLanguageTag("Tr")));
		
				

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ifade giriniz : ");
		String str3 = scan.next().toLowerCase();
		System.out.println(str3);
		
		
		

	}

}
