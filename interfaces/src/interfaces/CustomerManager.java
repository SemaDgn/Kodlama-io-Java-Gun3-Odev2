package interfaces;

public class CustomerManager {
	private  ICustomerDal customerDal;
	/*
	 * 1. yötem
	 * 
	 * ICustomerDal customerDal;
	public void add()
	{
		// burada iş kodları yaılır
		customerDal.add();
	}
	*/
	
	
	//2. Yöntem
	public CustomerManager(ICustomerDal customerDal)
	{
		this.customerDal=customerDal;
	}
	public void add()
	{
		// burada iş kodları yaılır
		customerDal.add();
	}
}
