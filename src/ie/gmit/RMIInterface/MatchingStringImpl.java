package ie.gmit.RMIInterface;

//Using this import statement to deal with Remote exceptions
import java.rmi.RemoteException;
//Using this import statement to deal with Mapping
import java.util.Map;
//Using this import statement to deal with extending Remote
import java.rmi.server.UnicastRemoteObject;
//Using this import statement to deal with the use of Hash maps within this class
import java.util.HashMap;

// This class will be using my MatchingStringable interface and extending Remote
public class MatchingStringImpl extends UnicastRemoteObject implements StringsService
{
	//Calling the class here
	protected MatchingStringImpl() throws RemoteException
	{
		super();
	}
	private static final long serialVersionUID = 1L;
	//Mapping my Algo to a string so I can work with them together
	private Map<String, Algos> algos = new HashMap<String, Algos>();
	
	@Override
	public Resultator compare(String FirstString, String SecondString, String Output)
{
		//Making sure both Strings are entered in the same way for comparison (toUpperCase)
		MatchingStringable StringComparison = algos.get(Output.toUpperCase()).getNewInstance();
		Resultator r = null;
		
		//Catching any exceptions
		try
		{
			r = new ResultatorImpl();
		} catch (RemoteException e)
		{
			e.printStackTrace();
		}
		
		// Starting a thread for my Comparison, Going to work with my Runner class too
		Thread myThread = new Thread(new Runner(r, StringComparison, FirstString, SecondString));
		myThread.start();
		// Returning my Resultator class here
		return r;
	    }
	


}