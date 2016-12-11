package ie.gmit.RMIInterface;

//Using this import to deal with using Remote
import java.rmi.Remote;
//Using this import to deal with error handling while using Remote
import java.rmi.RemoteException;

//Extending remote within this interface
public interface StringsService extends Remote
{
	public Resultator compare(String s, String t, String Output) throws RemoteException;
}