package ders5;

import java.util.Scanner;

public class MethodSoru {

	public static void main(String[] args) {
		
//		Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu konsola yazdirin.

	Scanner scan = new Scanner(System.in);
	System.out.println("Bir sayi giriniz?");
	int sayi = scan.nextInt();
	
	soru1(sayi);
	
	}
	
	
	public static void soru1(int sayi) {
		
		if(sayi%2==0) {
			
			System.out.println("Sayi CIFTTIR.");
		}
		else {
			
			System.out.println("Sayi TEKTIR.");
		}
		
	}
	

}
