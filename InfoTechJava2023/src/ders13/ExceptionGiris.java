package ders13;

public class ExceptionGiris {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		try {
		System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Payda degeri sifir olamaz!");
			e.printStackTrace();
		}
		finally {
			System.out.println("Bu blok her zaman calisir.");
		}
		
	}

}
