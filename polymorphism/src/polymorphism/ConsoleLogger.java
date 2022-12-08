package polymorphism;

public class ConsoleLogger  extends BaseLogger{
	
	//BaseLoggerdaki Log ovverride edilmiş oldu.
		public void log(String message)
		{
			System.out.println("Logged to Console :"+ message);
		}


}
