package ders08;

public class DuzensizArraylar {

	public static void main(String[] args) {
		
		
		int[][] duzensizDizi = new int[4][];
		duzensizDizi[0] = new int[2];//(1.satir) 0.index 2 tane daire var
		duzensizDizi[1] = new int[4];//(2.satir) 1.index 4 tane daire var
		duzensizDizi[2] = new int[1];//(3.satir) 2.index 1 tane daire var
		duzensizDizi[3] = new int[3];//(4.satir) 3.index 3 tane daire var

//		System.out.println(duzensizDizi.length);
//		System.out.println(duzensizDizi[0].length);//2 elemanlidir
//		System.out.println(duzensizDizi[1].length);//4 elemanlidir
//		System.out.println(duzensizDizi[2].length);//1 elemanlidir
//		System.out.println(duzensizDizi[3].length);//3 elemanlidir
		
		duzensizDizi[0][1]=5; //[0][1] indexindeki elemana 5 degerini atadik
		
		
		/*Duzensiz diziler yazdirmak icin yine ic ice for dongusu kullanilir.
		 * Disaridaki for dongusu satir sayisini bildirir
		 * icerideki for dongusu sutun sayilarini bildirir. 
		 * her satirin farkli sayida elemani oldugu icin her satirin uzunlugunu dongude ayri kullaniriz(duzensizDizi[i].length)
		 */
		for (int i = 0; i < duzensizDizi.length; i++) {
			for (int j = 0; j < duzensizDizi[i].length; j++) { 
				System.out.print(duzensizDizi[i][j] + "\t");
			}
			System.out.println("");
		}
		
		
		
	}
	
	

}
