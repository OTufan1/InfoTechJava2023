package ders13;

public class EmailKontrolChecked {

	public static void main(String[] args) throws InvalidEmailIdCheckedException {
		
		
		mailDogrula("omer@mail.com");
	}
	
	 public static void mailDogrula(String email) throws InvalidEmailIdCheckedException{
		 
		 if(email.contains("@gmail.com") || email.contains("@hotmail.com")) {
			 System.out.println("Eposta adresiniz= "+email);
		 }
		 else {
			 
			 throw new InvalidEmailIdCheckedException("Bu eposta adresi uygun degildir.");
		 }
	 }
}
