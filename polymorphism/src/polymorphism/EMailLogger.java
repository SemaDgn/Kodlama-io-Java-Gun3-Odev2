package polymorphism;

public class EMailLogger extends BaseLogger {
	
	// BaseLoggerdaki Log ovverride edilmiş oldu.
	public void log(String message)
	{
		System.out.println("Logged to email :"+ message);
	}

}
