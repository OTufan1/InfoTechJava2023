package ders14;

public class Main2 {

	public static void main(String[] args) {
		
		Isci isci1 = new Isci();
		isci1.isim = "Ali";
		isci1.soyIsim = "Can";
		isci1.saatUcreti = isci1.saatUcreti(); // saatUcretine Muhasebe classinin
												//	icindeki metotu atatik.
		isci1.aylikCalismaSuresi = isci1.aylikCalismaSuresi();
		isci1.maas = isci1.maas(isci1.saatUcreti, isci1.aylikCalismaSuresi);
		
		System.out.println(isci1);
		

	}

}
