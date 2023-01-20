package ders14;

public class Main3 {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		customerManager.getCustomers(new OracleDatabaseManager());
		customerManager.getCustomers(new SqlServerDatabaseManager());
		
		BaseDatabaseManager databaseManager = new OracleDatabaseManager();
		BaseDatabaseManager databaseManager2 = new SqlServerDatabaseManager();

	}

}
