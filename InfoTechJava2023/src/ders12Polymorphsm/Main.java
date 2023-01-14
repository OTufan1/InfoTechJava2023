package ders12Polymorphsm;

public class Main {

	public static void main(String[] args) {

//		MeslekKredisi kredi1 = new MeslekKredisi();
//		System.out.println(kredi1.hesapla(20000));
		
		BaseKredi kredi2 = new IhtiyacKredisi();
//		System.out.println(kredi2.hesapla(20000));
//		
		BaseKredi kredi3 = new MeslekKredisi();
//		System.out.println(kredi3.hesapla(20000));
//		
		BaseKredi kredi4 = new TasitKredisi();
//		System.out.println(kredi4.hesapla(20000));
		
		
		/*
		 * Kredilerimizi farkli sekilde dizilere arraylara atabiliriz. 
		 */
		/*Yontem-1
		 * 
		BaseKredi[] krediler = new BaseKredi[] {kredi2, kredi3, kredi4}; //Yukarida ki satirlarda new ile yeni krediler olusturdugumuz icin kredi2,3,4 e ulasabiliriz
		for (BaseKredi baseKredi : krediler) {
			System.out.println(baseKredi.hesapla(30000));
		}
		*/
		/*
		 * Yontem-2 asagidadir. 
		 */
//		BaseKredi[] krediler = new BaseKredi[] {new IhtiyacKredisi(), new MeslekKredisi(), new TasitKredisi()};
//		for (BaseKredi baseKredi : krediler) {
//			System.out.println(baseKredi.hesapla(25000));
//		}
		
		
		
//		final double PISAYISI = 3.14;
//		PISAYISI = 3.15; //final oldugu icin degistirmemize izin vermez
//		final bloklarini override'i yapilmasini engellemek icin de kullanabiliriz.
		
		

	}

}
