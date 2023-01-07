package ders10;

import ders10_ek1.ProtectedAccess1;
import ders10_ek1.PublicAccess1;


public class Main extends ProtectedAccess1 {

	public static void main(String[] args) {

		PublicAccess pa1 = new PublicAccess();//PublecAccess clasina erisim ve pa1 nesnesi uretimi
		System.out.println(pa1.str1); //public erisim
		
		PublicAccess1 ppa1 = new PublicAccess1(); //Baska bir paketten class'a erisim
		System.out.println(ppa1.str5);
		
		DefaultAccess da1 = new DefaultAccess();
		System.out.println(da1.str4); // ayni paket icerisinde default degerlere ulasabiliriz
//		System.out.println(ppa1.str6);// Default degerlere baska bir paketten ulasamayiz
		
		ProtectedAccess proAcc = new ProtectedAccess(); //Ayni paket icinden protectede erisim
		System.out.println(proAcc.str2);
		
		
		/*
		 * Baska bir paketten protected erisim yapacagimiz zaman inheritance yapmaliyiz.
		 * yani extends etmeliyiz. 
		 * Bu degerlere ulasirken extends edilen class isimlerinin aksine hangi class tan extends yaptiysak 
		 * o classin ismini uygulamayiz. 
		 */
//		ProtectedAccess1 access1 = new ProtectedAccess1();//Bu sekilde protected kullanimi hatalidir
		Main main1 = new Main(); // Main kismini class bolumunden ProtectedAccess1'e extends ettik
		System.out.println(main1.str6);// str6 ProtectedAccess1 icinde olmasina ragmen main classiyla cagirdik
		
		PrivateAccess access = new PrivateAccess();//Private degerlere sadece class icersinden ulasilabilir. Ayrica ulasmak icin kapsulleme yapmaliyiz.
		System.out.println(access.sayi);//public oldugu icin ulastik
		
//		access.sayi2();//public olan Sayi2 metotun icersindeki private degere erisim saglandi
		System.out.println(access.kare());
		
		OrnekMetotPrivate orn1 = new OrnekMetotPrivate();//class icindeki variable ve metotlara erisime dikkat ediniz
		System.out.println(orn1.sonuc());
		orn1.setSayi(12);
		System.out.println(orn1.sonuc());
		System.out.println(orn1.sonuc());
		

	}

}
