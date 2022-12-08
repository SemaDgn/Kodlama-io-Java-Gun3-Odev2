package interfaces;
// Dal: Data Access Layer
public class MyCustomerDal implements ICustomerDal,IRepository {

	@Override
	public void add() {
		System.out.println("Mysql'e eklendi.");
	}

}
