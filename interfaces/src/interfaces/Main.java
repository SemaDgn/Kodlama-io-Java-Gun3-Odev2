package interfaces;

public class Main {
	/*Abstract classları inherit eden class o class içindeki methodların 
	 * imzalarını doldurmak zorundadır.
	 * bir class sadece bir abstract class inherit edebilir.
	 * 
	 * interfacelerdede methosların imzası vardır.
	 * bir class birden fala interface kullanabılır.
	 * REferans ttuculardır.
	 * 
	 */

	public static void main(String[] args) {
		/* 1. Yöntem çalışma kodları
	//	ICustomerDal customerDal= new OracleCustomeDal();
		CustomerManager customerManager= new CustomerManager();
		customerManager.customerDal= new OracleCustomeDal();
		customerManager.add();
		*/
		
		CustomerManager customerManager= new CustomerManager(new MyCustomerDal()); 
		customerManager.add();
		
		
				
		
		
		
	}

}
