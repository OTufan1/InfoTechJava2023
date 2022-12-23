package ders6;

public class ClassDeneme {

	public static void main(String[] args) {

		//Baska bir class' in icindeki statik variable'lara class'in ismini yazarak erisebiliriz.
		Ozet.sayi = 25;
		System.out.println(Ozet.sayi);
		
		
		System.out.println(ClassVariable.product+" "+ClassVariable.id);
		
		
		//Baska bir class' taki static olmayan yapiya erismek icin yeni bir obje uretmeliyiz.
		ClassVariable obj1 = new ClassVariable();
		obj1.islemciTipi = "i7";
		obj1.ekranBoyutu = "15";
		obj1.ramBilgisi = 8;
		System.out.println(obj1.islemciTipi);
		System.out.println(obj1.ekranBoyutu);
		System.out.println(obj1.ramBilgisi);
	}

}
