package ders6;

public class Product {
	
	
	public Product() {
		System.out.println("Yapici blok calisti.");
	}
	
	
	public Product(String name, int numara, String islemciTipi, String ekran, int miktari, double price) {
		
		this.name = name;
		this.id = numara;
		this.islemci = islemciTipi;
		this.ekranBoyutu = ekran;
		this.stokMiktari = miktari;
		this.fiyat = price;
		
		
	}
	
	
	String name;
	int id;
	String islemci;
	String ekranBoyutu;
	int stokMiktari;
	double fiyat;
	
	
	

}
