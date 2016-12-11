package ie.gmit.RMIInterface;

// Using this import to deal with using Remote
import java.rmi.Remote;
// Using this import to deal with error handling while using Remote
import java.rmi.RemoteException;

/* An interface that extends remote in order to identify itself as an interface that can be invoked/used
   from another Virtual Machine.
   Any object that uses this interface can be a remote object */
public interface Resultator extends Remote 
{
	public String getResult() throws RemoteException;
	public void setResult(String result) throws RemoteException;
	public boolean isProcessed() throws RemoteException;
	public void setProcessed() throws RemoteException;
}