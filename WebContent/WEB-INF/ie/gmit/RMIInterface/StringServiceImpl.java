package ie.gmit.RMIInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringServiceImpl extends UnicastRemoteObject implements StringService
{
	private Resultator r;
	private static final long serialVersionUID = 1L;

	// empty constructor in order to update the StringService interface with each new job
	public StringServiceImpl() throws RemoteException
	{
		
	}


	//Handlingthe client input here
	@Override
	public Resultator Stringcomparison(String str1, String str2, String algo) throws RemoteException
	{
		//This is what updates the StringService Interface each time
		r = new ResultatorImpl(); 
		//This thread will handle str1 and str2 being compared using an algorithm
		StringCompare compareString = new StringCompare(str1, str2, r, algo);
		Thread compareJob = new Thread(compareString);
		//start the thread which compares these two strings
		compareJob.start();
			
		return r; //current version of resultator r is returned
	}
}
