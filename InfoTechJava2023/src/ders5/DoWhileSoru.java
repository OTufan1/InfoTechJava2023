package ders5;

public class DoWhileSoru {

	public static void main(String[] args) {
		
		//Soru: 9 den 190 e kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.
		
		int a = 9;
		
		do {
			
			if(a%7==0) {
				
				System.out.println(a);
			}
			
			a++;
		}
		while(a<=190);
		
		
	}

}
