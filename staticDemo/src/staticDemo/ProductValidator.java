package staticDemo;

public class ProductValidator {
	// ürünün geçerli olup olmadıgını kontrol eder.
	static {
		// burası  class newlenöase biler clasıır. static oldugu için
		// aynı anda bırden fazlada yapıcı mehod yazılabılır 3'ü de aynı anda calsıır.
		System.out.println("Static yapıcı blok çalıştı");
	}
	public ProductValidator() {
		// burası class nrewlendiğinde çalışır.
		System.out.println("Yapıcı blok çalıstı.");
	}

	public static boolean inValid(Product product) {
		
		if(product.price>0 && !(product.name.isEmpty()))			
		{
			return true;
			
		}
		else {
			return false;
			
		}
	}
	
	public static class BaskaBisey
	{
		/* bir classın içinde static olarak başka bir class olusturulabilyor
		 * fakat bu ProductVAlidator classı doğrudan static yapılamıyor.
		 * Bu durumdaC#  da tam tersi. ana classda static apılabiliyor.
		 */
		
	}
}
