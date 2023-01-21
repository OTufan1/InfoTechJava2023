package ders06;

import java.util.Scanner;

public class ClassVariable {
	
	//statik olan ve olmayan variable deklere ettik ve tanimladik.
	static String product = "Bilgisayar";
	static int id = 1000;
	static int stokMiktari = 100;
	static String marka;
	String islemciTipi;
	String ekranBoyutu;
	int ramBilgisi;
		
	public static void main(String[] args) {
		
		System.out.println(product);// statik olanlar statik metotta calisir.
		System.out.println(id);
//		System.out.println(ekranBoyutu);
		
//		Scanner giris = new Scanner(System.in);
		// Scanner class' indan giris objesi urettik.
		ClassVariable object1 = new ClassVariable();
		//ClassVariable sinifindan statik olmayan ozelliklere ulasmak icin object1 nesnesi urettik.
		System.out.println(object1.ekranBoyutu);
		System.out.println(object1.ramBilgisi);
		
	}
	
	public static void staticmethod() {
		System.out.println(stokMiktari); // statik olanlar static olan ve olmayan metotlara erisir
		//System.out.println(ekranBoyutu); // statik olmayanlar variable lara static metottan erismek icin nesne uretmelisin
		
	}
	
	public void staticOlmayanmethod() {
		// statik olmayan metotlar variable larin statik olanina ve olmayanina erisebilir
		System.out.println(product);
		System.out.println(ramBilgisi);
		System.out.println(ekranBoyutu);
		System.out.println(islemciTipi);
		
		
	}

}
