package ders08;

import java.util.Iterator;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		//Iki Boyutlu Duzenli diziler
		//Matrisler gibi islem yapmamizi saglar
		//Cok Boyutlu diziler 2 sekilde olusturulur
		//Esitlik ifadesinin saginda new keywordunun olup olmamasi arasinda bir fark yoktur
		int[][] cokBoyutlu3 = new int[][] { {11,12,13} , {21,22,23} , {31,32,33} };
		int[][] cokBoyutlu2 = { {11,12,13} , {21,22,23} , {31,32,33} };
		int[][] dizi4 = {{11,22,33,44}, {55,66,77,88}};
	
		
		System.out.println(cokBoyutlu2[0][0]); //13. satirdaki coklu dizinin 0.indeksin icindeki 0.indexi gosterir
		System.out.println(cokBoyutlu2[1][1]); //13. satirdaki coklu dizinin 1.indeksin icindeki 1.indexi gosterir
		
		/*
		 * Cok boyutlu dizileri gostermek icin ic ice for dongusu kullanmaliyiz.
		 * ilk dongumuz satir sayisini yani dizinin icinde kactane dizi oldugunu gosterir.
		 * icerdeki for dongusu icerideki dizilerin kac elemanli oldugunu yani sutun sayisini gosterir
		 */
		
		
		for (int i = 0; i < 3; i++) {//Dizinin satir sayisi 
			for (int j = 0; j < cokBoyutlu2[0].length; j++) {//Dizinin sutun sayisi
				System.out.print(cokBoyutlu2[i][j]+"\t");
			}
			System.out.println("");
		}
		
		System.out.println("*-*-*-*-*-*-*-*-*");
		
		/*
		 * dizi4 dizinin ekrana yazdirilmasi
		 */
		for (int i = 0; i < dizi4.length; i++) {
			for (int j = 0; j < dizi4[0].length; j++) {
				System.out.print(dizi4[i][j]+"\t");
			}
			System.out.println("");
		}
	
	}
}
