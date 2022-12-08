package polymorphism;

public class Main {

	public static void main(String[] args) {
	/*	// Burada Polymorphism sayesinde  base olan bir biçimden birden fazla biçimer türetildi. temel olarak bir biçimi esas aldı 
		// böylelikle rahatlıkla nesneleri ekleyip çıkartabiliriz.
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new EMailLogger() , new ConsoleLogger()};
		
		for (BaseLogger baseLogger : loggers) {
			 baseLogger.log("Log mesajı");
			
		}
		*/
		//burada benden baselohger türünde bir instance istesee ben burada uygulamam göre databese. file, console yada email logger verebilirim.
		// işte tam olarak polymorphism budur
		
		
		CustomerManager customerManager= new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
		

	}

}
