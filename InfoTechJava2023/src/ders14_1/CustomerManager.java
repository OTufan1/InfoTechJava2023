package ders14_1;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	//BaseDatabaseManager abstract class oldugu icin kendisini extends eden
	//classlarin referansini tutar
	
	
	public void getCustomers() {
		databaseManager.getData();//abstract metot icindeki abstract metotu fonksiyonun icinde kullandik
		
		
	}

}
