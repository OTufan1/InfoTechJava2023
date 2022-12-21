package ders4;

import java.lang.annotation.Target;

public class Replace_All_First {

	public static void main(String[] args) {
		
		//Replace()==> String ifade icinde istedigimiz karakteri veya kelimeyi degistirmek icin kullaniriz
		//ReplaceAll() ==> Regex ifadelerini kullaniriz. karakter degistirmesi yapamayiz.
		//ReplaceFirst() ==> Degismesini istedigimiz karakterin ilkini degistirir.
		
		String str = "Java ogrenmek cok kolay";//_
		System.out.println(str.replace("a", "x"));
		System.out.println(str.replace("Java", "C#"));
		System.out.println(str.replace('o', 'a'));
		
		System.out.println(str.replaceFirst("a", "e"));
		
		System.out.println(str.replaceAll("","_"));
		/*
		 
		 
		 
		 s bosluk (
\\S bosluk disindaki tum karakterler
\\w harfler ve rakamlar (a z A Z, 0 9
\\W harfler ve rakamlar disindaki tum karakterler
\\d rakamlar 0 9
\\D rakamlar disindaki tum karakterler
		 
		 */
		
//		String str1 = "J8av5a og54renme456k";
//		System.out.println(str1);
//		System.out.println(str1.replaceAll("a", "c"));
//		
//		  String regex=null;
//		  String mesaj = "Merhabalar";
//		  mesaj=mesaj.replaceAll(regex,"_");
//		  System.out.println(mesaj);
//		  
		  

		
	}

}
