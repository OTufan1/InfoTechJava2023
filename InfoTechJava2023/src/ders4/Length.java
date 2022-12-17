package ders4;

public class Length {

	public static void main(String[] args) {
		//length() ==> Girilen String ifadenin karakter sayisini bildirir.
		
		String str = "Bugun hava cok guzel";
		System.out.println(str.length()); 
		System.out.println(str.charAt(19));
		System.out.println(str.charAt(str.length()-1)); //son karakteri doner
		System.out.println(str.charAt(str.length()-3)); //sondan 3.karakteri doner

	}

}
