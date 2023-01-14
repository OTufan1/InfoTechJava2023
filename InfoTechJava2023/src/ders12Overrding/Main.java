package ders12Overrding;

public class Main {

	public static void main(String[] args) {
		KumesHayvanlari kms1 = new KumesHayvanlari();//Referans DataTuru -- Konstruktor ayni sekilde.
		kms1.hareket();//Data turu ve kumes ayni constructor da ise en alttan baslar
		System.out.println(kms1.gagasiVarMi);//Kuslar classindan alir
		System.out.println(kms1.gorurMu);//Hayvanlar classindan alir
		kms1.beslenme();
		
		Kuslar kus1 = new Kuslar();
		System.out.println(kus1.gagasiVarMi);// Kuslar klasindan alir
		kus1.beslenme();;//Hayvanlar klasiindan alir
		kus1.ureme();//kendi klasindan alir
		
		Kuslar kms2 = new KumesHayvanlari(); //Kuslarin referansini kullanir
		kms2.hareket(); // KumesHayvanlarindan alir
		kms2.beslenme();//Hayvanlar
		kms2.ureme(); //Kuslar
		kms2.solunum(); //Kuslar
		System.out.println(kms2.gagasiVarMi);//ilk gordugunu alir
		System.out.println(kms2.gorurMu);//ilk gordugunu alir
//		System.out.println(kms2.pencesiVarMi);// baska class ile iliskisi olmadigi icin CTE hatasi verir
		
		Hayvanlar kms3 = new KumesHayvanlari();
		kms3.beslenme(); //Hayvanlardan alir
		kms3.hareket(); //Kumes hayvanlari alir
		kms3.solunum(); //Kuslar dan alir
		kms3.ureme(); //kuslardan alir
		System.out.println(kms3.gorurMu);// ilk gordugunu alir hayvanlardan
		
		Hayvanlar kus2 = new Kuslar();
//		System.out.println(kus2.gagasiVarMi);
		System.out.println(kus2.gorurMu);//
		System.out.println(kus2.gagasiVarMi);//Kuslardan alir
		kus2.ureme(); // kuslardan alir
		kus2.solunum(); // kuslardan alir
		kus2.beslenme();//hayvanlardan alir
		kus2.hareket();// hayvanlardan
		
//		((Kuslar) kus2).ucar();//Bu tip donusumu ile alakali bir durum
		
		
		
		
		

	}

}
