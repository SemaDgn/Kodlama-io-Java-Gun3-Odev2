package staticDemo;

public class ProductManager {
	public void add(Product _product)
	{
		//ProductValidator productValidator= new ProductValidator();
		// static method oldugu için class adıyla cağrıldı.
		if (ProductValidator.inValid(_product)) {
			System.out.println("Eklendi");
		}
		else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
		
	}

}
