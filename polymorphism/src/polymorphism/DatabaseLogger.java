package polymorphism;

public class DatabaseLogger extends BaseLogger {
	//BaseLoggerdaki Log ovverride edilmiş oldu.
	public void log(String message)
	{
		System.out.println("Logged to Database :"+ message);
	}


}
