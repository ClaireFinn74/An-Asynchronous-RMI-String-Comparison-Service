package ie.gmit.RMIInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


//Exporting a remote object with Java Remote Method Protocol and creating  stub that talks to that remote object
public class ResultatorImpl extends UnicastRemoteObject implements Resultator
{
	// ensuring a loaded class corresponds to a serialized object
	private static final long serialVersionUID = 1L;

	// Will be using the isProcessed method further down
	private boolean processed;
	//instantiating the result as a string
	private String result;

	//Going to expose all of the methods now from the Resultator Interface
	protected ResultatorImpl() throws RemoteException
	{
		super();
	}

	@Override
	public String getResult() throws RemoteException
	{
		return result;
	}

	@Override
	public void setResult(String result) throws RemoteException
	{
		this.result = result;

	}

	public boolean isProcessed()
	{
		return processed;
	}

	public void setProcessed()
	{
		this.processed = true;
	}

}

