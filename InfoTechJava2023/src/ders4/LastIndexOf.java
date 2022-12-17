package ders4;

public class LastIndexOf {

	public static void main(String[] args) {
		//lastIndexOf==> girilen karakteri aramaya sag taraftan baslar. index numarasi doner
		String str ="Calisirsaniz, Java ogrenmek cok kolay";
		System.out.println(str.length()); 
		System.out.println(str.indexOf("o"));
		System.out.println(str.lastIndexOf("o"));
		System.out.println(str.lastIndexOf('o')); //char olarak bakmamiza izin verir
		

	}

}
