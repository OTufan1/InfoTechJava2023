package ders13;
/*
* Un Checked Exception
* Class isminin sonuna Exception kelimesi eklenir(Sart deil, genel konsept)
* RuntimeException class'ina child class yap (Un Checked Exceptionlar icin)
* String parametreli bir constructor olustur ve ilk satirina 
* super(message); keyword'unu ekle. 
*/
public class EmailKontrolUnChecked {

	public static void main(String[] args) {
		
		mailDogrula("omer@hotmail.com");
	}
	
	public static void mailDogrula(String email) {
		 
		 if(email.contains("@gmail.com") || email.contains("@hotmail.com")) {
			 System.out.println("Eposta adresiniz= "+email);
		 }
		 else {
			 
			 throw new InvalidEmailIdUnCheckedException("Bu eposta adresi uygun degildir.");
		 }

	}
}