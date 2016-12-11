package ie.gmit.RMIInterface;

//Using this import to deal with error handling while using Remote
import java.rmi.RemoteException;
//Using this import statement to deal with extending Remote
import java.rmi.server.UnicastRemoteObject;

//This class is referenced in the web.xml file
public class StringServiceImpl extends UnicastRemoteObject implements StringService
{
	//Making an instance of Resultator here
	private Resultator r;
	private static final long serialVersionUID = 1L;

	// empty constructor in order to update the StringService interface with each new job
	public StringServiceImpl() throws RemoteException
	{
		
	}

	//Handlingthe client input here
	@Override
	public Resultator Stringcomparison(String FirstString, SecondString, String algo) throws RemoteException
	{
		//This is what updates the StringService Interface each time
		r = new ResultatorImpl(); 
		//This thread will handle FirstString and SecondString being compared using an algorithm
		StringCompare compareString = new StringCompare(FirstString, SecondString, r, algo);
		Thread compareJob = new Thread(compareString);
		//start the thread which compares these two strings
		compareJob.start();
			
		return r; //current version of resultator r is returned
	}
}
