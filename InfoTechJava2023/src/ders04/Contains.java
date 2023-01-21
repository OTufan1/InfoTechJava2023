package ders04;

public class Contains {

	public static void main(String[] args) {
		//contains()==> belirttigimiz string ifadenin icinde olup olmadigina bakariz.  

		String str = "Bugun hava cok guzel";
		System.out.println(str.contains("g")); //true
		System.out.println(str.contains("hava")); //true
		System.out.println(str.contains("kotu")); //false

	}

}
