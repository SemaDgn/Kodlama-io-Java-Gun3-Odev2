package abstractDemo;

public class Main {
	// Bu örnekte Oracle mssql mysql gibi temelde veritabanı işlemi yapan fakat hepsinin
	// kaydetme kodu farklı olacaktır.

	public static void main(String[] args) {
		
		CustomerManager customerManager= new CustomerManager();
		// burada basedatabasemanager nesnesi kendisinden inherit alan class ile dolduruldu ve müşteriler öyle çağrıldı.
		customerManager.baseDatabaseManager= new oracleDatabaseManager();
		customerManager.getCustomer();
		customerManager.baseDatabaseManager= new sqlServerDatabaseManager();
		customerManager.getCustomer();

	}

}
