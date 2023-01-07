package ders10;

public class EncapsulationMain {

	public static void main(String[] args) {

		/*
		 * Normalde urunlerimizi agagidaki sekilde olusturabiliyorduk.
		 */
		
//		Encapsulations urun1 = new Encapsulations();
//		urun1.id = 1001;
//		urun1.marka = "Samsung";
//		urun1.fiyat = 0;
//		urun1.ekranBoyutu = "6.1";
//		
//		System.out.println("Urunun markasi : " + urun1.marka);
//		System.out.println("Urunun fiyati : " + urun1.fiyat);
		
		
		/*
		 * Fakat Urunlerimize Encapsullation uyguladik artik urun girmek icin set uygulamayiz
		 * urunleri getirmek icin get uygulamaliyiz
		 */
		Encapsulations urun2 = new Encapsulations();
		urun2.setId(1002);
		urun2.setMarka("Samsung");
		urun2.setFiyat(10000);
		urun2.setEkranBoyutu("6.1");
		
		System.out.println(urun2.getId());
		System.out.println(urun2.getMarka());
		System.out.println(urun2.getFiyat());
		System.out.println(urun2.getEkranBoyutu());
		System.out.println(urun2.geturunKod());
		
		
	}

}
