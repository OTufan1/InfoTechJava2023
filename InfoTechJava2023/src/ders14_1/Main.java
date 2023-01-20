package ders14_1;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new MsSqlDatabaseManager();
		customerManager.getCustomers();

		//Bu ornek dependency injection design patterni ile yapildi
		
	}

}
