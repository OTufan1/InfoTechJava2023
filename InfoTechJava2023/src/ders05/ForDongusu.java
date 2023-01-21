package ders05;

public class ForDongusu {

	public static void main(String[] args) {
		//  baslangic verisi; sart ;artirim ya da azaltim operatoru.
//		for(int i=1;i<=10;i=i++) {
//			
//			System.out.println(i);
//		}
		

//		Soru: 10 ile 30 arasindaki sayilari aralarinda virgule olarak ayni satirda
//		yazdirin.
		
		for(int i=10;i<=30;i++) {
			
			if(i<30) {
			System.out.print(i+",");
			
			}
			else {
				System.out.print(i);
			}
			
//			String a = i<30 ? ""+i+"," : ""+i; // Ternary
			
//			System.out.print(a);
		}
		
		
		
		
		
		
	}

}
