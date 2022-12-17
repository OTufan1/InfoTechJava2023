package ders4;

public class CharAt {

	public static void main(String[] args) {
		//CharAt()==> hangi indexte hangi char oldugunu gormek icin kullaniriz
		
		String str = "Bugun hava cok guzel";
		String str1 = new String("merhaba"); // Bu sekilde kullanim ileri seviyedir. New deyince Heap bolumunde otomatik adres verilir.
		System.out.println(str.charAt(6)); //str ifadesinin 6. indexini dondurur.
		char yeniString = str.charAt(2);// str degiskeninin 2. indexini yeni bir degiskene atadik.
		System.out.println(yeniString);
//		System.out.println(str.charAt(30)); //index disina cikildi hatasi verir.
		
		
		
		
		
		String ifade = ""; //Hicbir sey atamasi yapar. 
		String ifade2 = null; // java'ya ifade 2 nin degerini bos biraktigimizi bildiriyoruz.
		System.out.println(ifade); 
		System.out.println(ifade2); //null yazdirir. ilerleyen zamanda anlatilacak

	}

}
