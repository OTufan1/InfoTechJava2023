package ders3;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		
		// NESTED IF (ic ice if)
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cinsiyet giriniz e/k ?");
		char cinsiyet = scan.next().charAt(0);
		
		System.out.println("Yasinizi giriniz?");
		short yas = scan.nextShort();
		
		if(cinsiyet=='k') {
			
			if(yas>=60) {System.out.println("Kadin emekli olabilir.");}
			else {System.out.println("Kadin emekli OLAMAZ.");}
		}
		else {
			
			if(yas>=65) {System.out.println("Erkek emekli olabilir.");}
			else {System.out.println("Erkek emekli OLAMAZ.");}
		}
		
		scan.close();
	}

}
