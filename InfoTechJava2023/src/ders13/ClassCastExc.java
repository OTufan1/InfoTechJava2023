package ders13;

public class ClassCastExc {

	public static void main(String[] args) {
		
		Integer sayi = 10;
		System.out.println(sayi);  //10

		//String str = (String)sayi; //CTE
		
		Object sayi1 = 40;
		String str3=(String)sayi1; // ClassCastException
	}

}
