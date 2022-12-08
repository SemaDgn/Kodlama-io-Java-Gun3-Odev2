package polymorphism;

public class FileLogger  extends BaseLogger{
	//BaseLoggerdaki Log ovverride edilmiş oldu.
	public void log(String message)
	{
		System.out.println("Logged to File :"+ message);
	}

}
