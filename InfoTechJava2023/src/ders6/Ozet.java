package ders6;

public class Ozet {
	
	static int sayi = 10;
	String ders = "Java";

	public static void main(String[] args) {
		
		//ders degiskenine ulasmak icin Ozet class ' indan nesne uretmelisiniz.
		Ozet object1 = new Ozet();
		object1.ders = "Python";
		System.out.println(object1.ders);
		
		
		

		System.out.println(sayi);//static oldugu icin gosterir.
		//System.out.println(ders); Main classinda ders diye bir degisken yok. Ozet icinde ders var.
		
		int sayi1 = 20;
		
		for (int i = 0; i < 5; i++) {
			System.out.println(sayi1);
			String ders2 = "SQL";
		}
		
		//System.out.println(ders2); // Loop icinde olusturulan variable loop disinda kullanilamaz.
	}
	
	public static void staticMethod() {
		System.out.println(sayi);
		//Statik variable static metottan erisilebilir
	}
	
	public void staticOlmayanMethod() {
		//Statik variable static OLMAYAN metottan erisilebilir
		System.out.println(sayi);
	}
	
	

}
