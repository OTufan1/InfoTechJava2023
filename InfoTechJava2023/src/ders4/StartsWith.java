package ders4;

public class StartsWith {

	public static void main(String[] args) {
		//startsWith() ==> String bizim bakacagimiz degerlemi basliyor. Tru ve false doner
		//istedigimiz indexten itibaren bakabiliriz.
		String str  = "Calisirsaniz, Java ogrenmek cok kolay";
		System.out.println(str.indexOf("J"));
		System.out.println(str.startsWith("Java", 14));
		System.out.println(str.startsWith(str));

	}

}
