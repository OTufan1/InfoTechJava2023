package ders04;

public class EndsWith {

	public static void main(String[] args) {
		//endsWith==> Baktigimiz stringin girdigimiz kriterle sonlanip sonlanmadigina bakariz.
		
		
		String str  = "Calisirsaniz, Java ogrenmek cok kolay";
		
		System.out.println(str.endsWith("olay")); //true
		System.out.println(str.endsWith("alay")); //false
		System.out.println(str.endsWith(str)); //true
		

	}

}
