package ders6;

import java.util.Scanner;

public class Constructors {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Product product1 = new Product();
		product1.name = "Hp";
		product1.id = 100;
		product1.islemci = "i7";
		product1.ekranBoyutu = "15";
		product1.stokMiktari = 100;
		product1.fiyat = 650;
		
		
		Product product2 = new Product("Lenovo", 200, "i5", "13", 200, 350);
		System.out.println("Urun ismi= " + product2.name + "urun fiyati " +" " + product2.fiyat);
		
		Product product3 = new Product();
		System.out.println("Urunun name ni giriniz : ");
		product3.name = scan.nextLine();	
		System.out.println("Urunun id giriniz : ");
		product3.id = scan.nextInt();
		
		
		
		System.out.println("Girilen urunun ismi : " + product1.name);
		
		Araba araba1 = new Araba();
		

	}

}
