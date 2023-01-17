package ders13;

import java.util.Scanner;

public class IllegalArgumentExc {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasinizi Giriniz?");
		
		byte yas = scan.nextByte();
		
		if(yas<0) {
			try {
			throw new IllegalArgumentException("Yas negatif olamaz");
			}
			catch(IllegalArgumentException e) {
				System.out.println("Hatili giris yaptiniz.");
			}
		}
		else {
			System.out.println("Yasiniz= "+yas);
		}
		
		
		System.out.println("Kodlarin devami");

	}

}
