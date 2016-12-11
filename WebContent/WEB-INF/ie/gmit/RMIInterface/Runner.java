//Using my RMIInterface folder here as the package as that's where my Runner class is located
package ie.gmit.RMIInterface;

//Using this import to deal with Remote Exceptions
import java.rmi.RemoteException;
//I'm making a Runner class so I can use the already (handily-so) built-in Interface Runnable
//This allows me to use Runnable's method, run, and override it to do what I want it to do
public class Runner implements Runnable
{
	//Using MatchingStringable again here
	MatchingStringable StringComparison;
	//Using Resultator again here
	Resultator r;
	//Using my two strings here too
	String FirstString, SecondString;

	//Making instances within this class of Resultator, MatchingStringable and my two strings
	public Runner(Resultator r, MatchingStringable StringComparison, String FirstString, String SecondString)
	{
		this.r = r;
		this.StringComparison = StringComparison;
		this.FirstString = FirstString;
		this.SecondString = SecondString;
	}
	
	@Override
	public void run()
	{
		try {
			//Using my similarities string from my MatchingStringable Interface here
			//Using SetResult from my Resultator method and setting the below parameters to the result
			r.setResult(StringComparison.similarities(FirstString, SecondString));
			try {
				//Thread asleep for 10 seconds to make the website seem like it is asynchronously processing requests
				Thread.sleep(10000);
				//Handling exceptions here
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//Using the the setProcessed method here from my Resultator class
			r.setProcessed();
			//Saying that the request has been processed
			System.out.println(r + "is processed");
			//Handling any exceptions here
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}
}
