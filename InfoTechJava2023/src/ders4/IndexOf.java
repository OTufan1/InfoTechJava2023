 package ders4;

public class IndexOf {

	public static void main(String[] args) {
		
		//IndexOf ==> Girdigimiz char veya string ifadenin hangi indexte olduguna bakar. Index numarasi doner
		//IndexOf 'da girdigimiz kriter herhangi bir indexte yoksa -1 doner
		//CharAt()==> hangi indexte hangi char oldugunu gormek icin kullaniriz . char ifadesi doner
		
		String str ="Calisirsaniz, Java ogrenmek cok kolay";
//		System.out.println(str.indexOf('a'));
//		System.out.println(str.indexOf("a"));
//		System.out.println(str.indexOf("j"));
//		System.out.println(str.indexOf("Java"));
		System.out.println(str.indexOf("Java", 15)); // 4.indexten sonra "Java" ifadesinin olup olmadigina bakar

		

	}

}
