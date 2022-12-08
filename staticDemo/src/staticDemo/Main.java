package staticDemo;

public class Main {

	/*Static yapılar : Class isimleyirle beraber erişilir
	 * New ile yeni bir instance olusturulamaz.
	 * static yapılar program yüklenirken bir kere olusr.
	 * static tanımladığımızda işimiz bittiğinde uygulama sıfırlana kadar bellekten atılmıyor
	 * Garbage Collector silemiyor.
	 * bu yapıları newlwnmediği için classların yapıcı methotları  çalısmaz ama 
	 * C# da staticdede yapıcı methos calsıır.
	 * 
	 */
	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		Product product= new Product();
		product.price=10;
		product.name="Mouse";
		productManager.add(product);
		
		//Direk classlarla ulaşıldı
		//DatabaseHelper.Crud.Update();
		

	}

}
