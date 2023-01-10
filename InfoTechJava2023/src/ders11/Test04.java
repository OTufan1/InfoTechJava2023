package ders11;
	/*
	 * “super” keyword parent class’dan variable ve method cagirmak icin kullanilir. “this” 
	 * keyword icinde bulunulan class’dan variable ve method cagirmak icin kullanilir.
	 * 
	 * Esasinda “this” keyword parent class’dan variable cagirmak icin de 
	 * kullanilabilir; fakat tavsiye edilmez. Cunku, child ve parent class’larda ayni 
	 * isimli iki variable varsa, “this” parent class’dan variable cagiramaz.
	 * 
	 * "super()" ve "this()" constructor cagirmak icin kullanilirlar ve constructor’in ilk 
	 * satirinda olmalidirlar. Bu durumda bir constructor’da ikisinin birden olmasi 
	 * mumkun degildir.
	 * 
	 * "super" ve "this" variable cagirmak icin kullanilabilirler. Ilk satirda olma sarti 
	 * olmadigi icin ikisi birlikte kullanilabilirler.
	 * 
	 */
	class Human{
		
		public Human() {
			
			System.out.println("Human constructor.");
		}
	
		public void talk() {
			
			System.out.println("Human Talk()");
		}
	}
	
	class Student extends Human{
		
		public void talk() {
			
			System.out.println("Student Talk()");
		}
	}
	
	public class Test04 extends Human{
		
	public static void main(String[] args) {
		
		Human human = new Student();
		human.talk();
	}

}
