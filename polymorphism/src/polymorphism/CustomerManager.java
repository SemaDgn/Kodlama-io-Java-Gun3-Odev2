package polymorphism;

public class CustomerManager {
	
	private BaseLogger baseLogger;
	public CustomerManager(BaseLogger  baseLogger)
	{
		this.baseLogger=baseLogger;
	}
	
	public void add()
	{
		System.out.println("Müşteri eklendi.");
		// burada loglama yapılması istenıyorsa artık burada database yada file değişde baselogger türünden nesneyle genel gecer çözümler üretmeliyşz.
		this.baseLogger.log("Log mesajı :");
		
	
	}
}
