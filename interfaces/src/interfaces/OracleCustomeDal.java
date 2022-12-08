package interfaces;

public class OracleCustomeDal implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("Oracl'a eklendi.");
	}

}
