package ders7;

public class Deneme2 {

	int x;
	static int y;
	
	Deneme2(int i){
		
		x+=i;
		y+=i;
	}
	
	public static void main(String[] args) {
		
		new Deneme2(2);
		
		Deneme2 dnm2 = new Deneme2(3);
		
		System.out.println(dnm2.x + " , " + dnm2.y);

	}

}
