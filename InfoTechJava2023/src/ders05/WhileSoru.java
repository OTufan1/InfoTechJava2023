package ders05;

public class WhileSoru {

	public static void main(String[] args) {
		
		//Soru: While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana
		//yazdiriniz.
		
		int basSayisi= 3;
		
		while(basSayisi<=13) {
			
			if(basSayisi%2!=0) {
			System.out.println(basSayisi);
			}
			
			basSayisi++ ;
		}
		

	}

}
