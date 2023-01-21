package ders04;

public class Concat {

	public static void main(String[] args) {
		
		//Concat()==>Iki veya daha fazla String ifadeyi birlestirmek icin kullanilir.
		//Concat() yerine (+) isareti de kullanilir. 
		
		String name = "Ali";
		String soyisim = "Can";
		System.out.println(name + " "+soyisim);
		
		
		System.out.println(name.concat(" ").concat(soyisim)); //Birden fazla concat() kullanilabilir.
		System.out.println(name.concat(soyisim));
		System.out.println(name + soyisim);
		
		String ifade = "computer";
		int sayi = 20;
		double sayi1 = 3.14;
		boolean isTrue = true;
		
		System.out.println(ifade + sayi); //computer20
		System.out.println(ifade + isTrue); // computertrue
//		System.out.println(sayi + isTrue); // Concat yapmasi icin String gerekli. (int + bool yapmaz)
		
		
	}

}
