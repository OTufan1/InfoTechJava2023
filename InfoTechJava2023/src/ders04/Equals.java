package ders04;

public class Equals {

	public static void main(String[] args) {
		//Equals()==> string ifadelerin iclerini karsilastirir
		//STRING IFADELERIN KARSILASTILMASINDA BU METOT KULLANILMALI
		//STRING KARSILASTIRILMASINDA (==) IFADESI TERCIH EDILMEZ.
		
		
		String str1 = "Ali";
		String str2 = "ali";
		String str3 = new String("Ali");
		String str4 = "Ali";
		String str5 = new String("Ali");
		
//		System.out.println(str1 == str2); //false
//		System.out.println(str1 == str3); //false
//		System.out.println(str1 == str4); //true
//		System.out.println(str1.equals(str3)); //true
//		System.out.println(str1.equals(str2.toUpperCase()));//false
//		System.out.println(str3 == str5);//false
		System.out.println(str3.equals(str5));
		
	}

}
